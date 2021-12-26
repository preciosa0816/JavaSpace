package p12.animation.an;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class RootController implements Initializable {
	@FXML
	private Button btnLogin;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnLogin.setOnAction(e -> handleBtnLogin(e));

	}

	public void handleBtnLogin(ActionEvent event) {
		try {
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
			StackPane root = (StackPane) btnLogin.getScene().getRoot();
			root.getChildren().add(login);
			
			login.setTranslateX(350); //시작값을 350으로 설정(로그인 화면의 폭)
			
			Timeline timeline = new Timeline();//KeyFrame에 설정된 내용대로 애니메이션을 진행시키는 객체
			KeyValue keyValue = new KeyValue(login.translateXProperty(), 0);//타겟속성(property)과 종료값(0) 설정 객체
			// keyFrame : 애니메이션의 지속 시간와 KeyValue를 설정하는 객체(지속시간 동안 타겟 속성의 값을 종료값(0)까지 변화시킴)
			KeyFrame keyFrame = new KeyFrame(Duration.millis(100), keyValue);//100은 지속시간
			timeline.getKeyFrames().add(keyFrame);
			timeline.play();
			
			
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
