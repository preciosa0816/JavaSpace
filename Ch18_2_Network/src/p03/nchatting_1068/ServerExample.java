package p03.nchatting_1068;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

//1068
public class ServerExample extends Application {
	ExecutorService executorService;
	ServerSocket serverSocket;
	List<Client> connections = new Vector<Client>();

	// 1. 서버 시작
	void startServer() {
		executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
		} catch (IOException e) {
			if (!serverSocket.isClosed()) {
				stopServer();
			}
			return;
		}

		Runnable runnable = new Runnable() {// 수락작업 생성

			@Override
			public void run() {
				Platform.runLater(() -> {
					displayText("[서버 시작]");
					btnStartStop.setText("stop");
				});
				while (true) {

					try {
						Socket socket = serverSocket.accept();// 연결 수락
						String message = "[연결 수락: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));

						Client client = new Client(socket); // Client 객체 저장
						connections.add(client);

						Platform.runLater(() -> {
							displayText("[연결 개수: " + connections.size() + "]");
						});
					} catch (IOException e) {
						if (!serverSocket.isClosed()) {
							stopServer();
						}
						break;
					}
				}
			}
		};
		executorService.submit(runnable); // 스레드풀에서 처리
	}// startServer()메소드 끝

	// 2.서버 종료
	void stopServer() {
		try {
			Iterator<Client> iterator = connections.iterator();// 모든 Socket닫기
			while (iterator.hasNext()) {
				Client client = iterator.next();
				client.socket.close();
				iterator.remove();
			}
			if (serverSocket != null && !serverSocket.isClosed()) {// ServerSocket 닫기
				serverSocket.close();
			}
			if (executorService != null && !executorService.isShutdown()) {// ExecutorService 종료
				executorService.shutdown();
			}
			Platform.runLater(() -> {
				displayText("[서버 멈춤]");
				btnStartStop.setText("start");
			});
		} catch (IOException e) {

		}

	}

	// 3.데이터 통신 코드
	class Client {
		Socket socket;

		public Client(Socket socket) {
			super();
			this.socket = socket;
		}

		void receive() {// 데이터 받기 코드
			Runnable runnable = new Runnable() {// 받기 작업 생성

				@Override
				public void run() {
					try {
						while (true) {
							byte[] byteArr = new byte[100];
							InputStream inputStream = socket.getInputStream();

							// 클라이언트가 비정상 종료를 했을 경우 IOException발생
							int readByteCount = inputStream.read(byteArr);// 데이터 받기

							// 클라이언트가 정상적으로 Socket의 close()를 호출했을 경우
							if (readByteCount == -1) {
								throw new IOException();
							}

							String message = "[요청 처리: " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";

							Platform.runLater(() -> displayText(message));

							String data = new String(byteArr, 0, readByteCount, "UTF-8");// 문자열로 변환

							for (Client client : connections) {// 모든 클라이언트에게 보냄
								client.send(data);
							}
						}
					} catch (IOException e) {
						connections.remove(Client.this);
						String message = "[클라이언트 통신 안됨: " + socket.getRemoteSocketAddress() + ": "
								+ Thread.currentThread().getName() + "]";
						Platform.runLater(() -> displayText(message));

						try {
							socket.close();
						} catch (IOException e1) {

						}
					}
				}

			};
			executorService.submit(runnable);// 스레드풀에서 처리
		}

		void send(String data) {// 데이터 전송 코드
			Runnable runnable = new Runnable() {// 보내기 작업 생성

				@Override
				public void run() {
					try {
						byte[] byteArr = data.getBytes("UTF-8");// 클라이언트로 데이터 보내기
						OutputStream outputStream = socket.getOutputStream();
						outputStream.write(byteArr);
						outputStream.flush();
					} catch (IOException e) {
						try {
							String message = "[클라이언트 통신 안됨 : " + socket.getRemoteSocketAddress() + ": "
									+ Thread.currentThread().getName() + "]";
							Platform.runLater(() -> displayText(message));
							connections.remove(Client.this);
							socket.close();
						} catch (IOException e1) {

						}
					}

				}
			};
			executorService.submit(runnable); // 스레드풀에서 처리

		}
	}

	TextArea txtDisplay;
	Button btnStartStop;

	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane root = new BorderPane();
		root.setPrefSize(500, 300);

		txtDisplay = new TextArea();
		txtDisplay.setEditable(false);
		BorderPane.setMargin(txtDisplay, new Insets(0, 0, 2, 0));
		root.setCenter(txtDisplay);

		btnStartStop = new Button("start");
		btnStartStop.setPrefHeight(30);
		btnStartStop.setMaxWidth(Double.MAX_VALUE);

		btnStartStop.setOnAction(e -> {//start와 stop버튼을 클릭했을 때 이벤트 처리 코드
			if (btnStartStop.getText().equals("start")) {
				startServer();
			} else if (btnStartStop.getText().equals("stop")) {
				stopServer();
			}
		});
		root.setBottom(btnStartStop);

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("app.css").toString());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Server");
		primaryStage.setOnCloseRequest(event -> stopServer()); //윈도우 우측 상단 닫기 버튼을 클릭했을 때 이벤트 처리 코드
		primaryStage.show();

	}

	void displayText(String text) {//작업 스레드의 작업 처리 내용을 출력할 때 호출하는 메소드
		txtDisplay.appendText(text + "\n");
	}

	public static void main(String[] args) {
		launch(args);
	}

}
