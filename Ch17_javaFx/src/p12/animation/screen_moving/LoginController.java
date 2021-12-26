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
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
//메인버튼 이벤트 처리 : 로그인 화면을 제거하고 메인호면을 보여줌
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
			root.getChildren().remove(login);//stackPane에서 로그인 화면 제거
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
