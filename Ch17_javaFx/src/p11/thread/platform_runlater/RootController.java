package p11.thread.platform_runlater;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class RootController implements Initializable {
	@FXML
	private Label lblTime;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;

	private boolean stop;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		btnStart.setOnAction(event -> handleBtnStart(event));
		btnStop.setOnAction(event->handleBtnStop(event));
	}

	public void handleBtnStart(ActionEvent e) {
		stop = false;
		Thread thread = new Thread() {
			@Override
			public void run() {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
				while (!stop) {
					String strTime = sdf.format(new Date());
					//UI변경: 작업스레드가 직접 UI변경 불가->Runnable생성-runLater 호출해서 변경하기
					Platform.runLater(() -> {
						lblTime.setText(strTime);//작업스레드가 얻어낸 시간을 이용해서 Label컨트롤의 text속성 변경
					});

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {

					}

				}
			};
		};

		thread.setDaemon(true);
		thread.start();
	}

	public void handleBtnStop(ActionEvent e) {
		stop = true;
	}

}
