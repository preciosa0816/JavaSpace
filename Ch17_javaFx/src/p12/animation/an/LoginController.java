package p12.animation.an;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginController implements Initializable {
	@FXML private BorderPane login;
	@FXML
	private Button btnMain;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnMain.setOnAction(e -> handleBtnMain(e));

	}

	public void handleBtnMain(ActionEvent event) {
		try {
			StackPane root = (StackPane) btnMain.getScene().getRoot();
			
			login.setTranslateX(0);
			
			Timeline timeline= new Timeline();
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 350);
			//KeyFrame : 지속시간동안 속성을 종료값까지 변화시키고 나서 콜백메소드를 자동호출하는 기능을 가짐(이벤트핸들러추가필요)
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {//애니메이션 종료시 handle()메소드 자동 호출
					root.getChildren().remove(login);
					
				}
				
			}, keyValue);
			
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
