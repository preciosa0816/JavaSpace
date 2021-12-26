package p11.thread.task;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {
	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label lblWorkDone;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	private Task<Void> task;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event -> handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
	}

	public void handleBtnStart(ActionEvent e) {
		task = new Task<Void>() {
			@Override
			protected Void call() throws Exception {
				for (int i = 0; i <= 100; i++) {
					if (isCancelled()) {
						//updateMessage(String message):작업이 진행/취소 되었을 경우 문자열 메시지를 전달해서 UI변경할시
						updateMessage("취소됨");
						break;
					}
					//Task의 progress와 message속성을 업데이트
					updateProgress(i, 100);//updateProgress(현재진행정도, 진행완료 값)
					
					updateMessage(String.valueOf(i));

					try {
						Thread.sleep(100);
					} catch (Exception e) {
						if (isCancelled()) {
							updateMessage("취소됨");
							break;
						}

					}

				}
				return null;//call()재정의시 void메소드에서 작업값은 null.
			}

		};
		
		progressBar.progressProperty().bind(task.progressProperty());//progress 속성 바인딩
		lblWorkDone.textProperty().bind(task.messageProperty());
		
		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}
	
	public void handleBtnStop(ActionEvent e) {
		task.cancel();
	}
}
