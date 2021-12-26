package p12.animation.screen_moving;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
//로그인 버튼 처리 : 로그인 화면으로 이동
public class RootController implements Initializable {
	@FXML
	private Button btnLogin;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		btnLogin.setOnAction(e -> handleBtnLogin(e));

	}

	public void handleBtnLogin(ActionEvent event) {
		try {//로그인 화면으로 이동
			Parent login = FXMLLoader.load(getClass().getResource("login.fxml"));
			StackPane root = (StackPane) btnLogin.getScene().getRoot();//Scene의 루트컨테이너인 StackPane 얻기
			root.getChildren().add(login);// stackPane에 로그인 화면 추가
		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
