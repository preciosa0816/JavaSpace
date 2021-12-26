package p07.control5.slider.progressbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class RootController implements Initializable {

	@FXML
	private MediaView mediaView;
	@FXML
	private ImageView imageView;
	@FXML
	private Button btnPlay;
	@FXML
	private Button btnPause;
	@FXML
	private Button btnStop;
	@FXML
	private Label labelTime;
	@FXML
	private Slider sliderVolume;
	@FXML
	private ProgressBar progressBar;
	@FXML
	private ProgressIndicator progressIndicator;

	private boolean endOfMedia; // 재생 완료를 확인하는 플래그 필드

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 미디어 객체 생성
		Media media = new Media(getClass().getResource("media/video.m4v").toString());
		// Media media = new
		// Media(getClass().getResource("media/audio.wav").toString());

		// 미디어 플레이어 생성 및 미디어 뷰에 설정
		MediaPlayer mediaPlayer = new MediaPlayer(media);
		mediaView.setMediaPlayer(mediaPlayer);

		// 해당 상태가 되면 실행할 Runnable 설정
		mediaPlayer.setOnReady(new Runnable() {// Ready 상태가 될때 실행

			@Override
			public void run() {
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);
				
			}
		});
		// 해당 상태가 되면 실행할 Runnable 설정
		mediaPlayer.setOnReady(new Runnable() {

			@Override
			public void run() {
				mediaPlayer.currentTimeProperty().addListener(new ChangeListener<Duration>() {

					@Override
					public void changed(ObservableValue<? extends Duration> observable, Duration oldValue,
							Duration newValue) {
						double progress = mediaPlayer.getCurrentTime().toSeconds()/mediaPlayer.getTotalDuration().toSeconds();
						progressBar.setProgress(progress);
						progressIndicator.setProgress(progress);
						labelTime.setText((int) mediaPlayer.getCurrentTime().toSeconds() + "/"
								+ (int) mediaPlayer.getTotalDuration().toSeconds()+" sec");

					}
				});
				btnPlay.setDisable(false);
				btnPause.setDisable(true);
				btnStop.setDisable(true);
			}

		});

		mediaPlayer.setOnPlaying(() -> {// playing상태가 될 때 실행
			btnPlay.setDisable(true);
			btnPause.setDisable(false);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnPaused(() -> {// Paused상태가 될 때 실행
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(false);
		});

		mediaPlayer.setOnEndOfMedia(() -> {// endOfMedia상태가 될 때 실행
			endOfMedia = true;
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});

		mediaPlayer.setOnStopped(() -> {// stopped 상태가 될 때 실행
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);
		});
		mediaPlayer.setOnEndOfMedia(() -> {// 미디어 재생이 완료되었을 때 progress 의 속성값을 1.0으로 설정
			progressBar.setProgress(1.0);
			progressIndicator.setProgress(1.0);
			endOfMedia = true;
			btnPlay.setDisable(false);
			btnPause.setDisable(true);
			btnStop.setDisable(true);

		});
		// 버튼 ActionEvent 처리
		btnPlay.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				if (endOfMedia) {// EndOfMedia 상태일 경우
					mediaPlayer.stop();// 재생중지
					mediaPlayer.seek(mediaPlayer.getStartTime());// 재생시간을 처음으로 돌림
				}
				mediaPlayer.play();
				endOfMedia = false;
			}

		});

		btnPause.setOnAction(event -> mediaPlayer.pause());
		btnStop.setOnAction(event -> mediaPlayer.stop());

		// 볼륨설정
		sliderVolume.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				mediaPlayer.setVolume(sliderVolume.getValue() / 100.0);

			}
		});

		sliderVolume.setValue(50.0);// slider의 초기값
	}

}
