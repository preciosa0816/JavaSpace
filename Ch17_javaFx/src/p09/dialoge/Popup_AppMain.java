package p09.dialoge;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class Popup_AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
//		Parent root = FXMLLoader.load(getClass().getResource("rootnew2.fxml"));
//		Scene sc = new Scene(root);
//		
//		primaryStage.setTitle("AppMain");
//		primaryStage.setScene(sc);
//		primaryStage.show();

		Popup popup = new Popup();

		Parent parent = FXMLLoader.load(getClass().getResource("popup.fxml"));
		ImageView imageView = (ImageView) parent.lookup("#imgMessage");
		// 메시지 별로 아이콘을 다르게 지정하기 위해 코드로 이미지 지정
		imageView.setImage(new Image(getClass().getResource("images/dialog-info.png").toString()));

		imageView.setOnMouseClicked(event -> popup.hide()); // 팝엄 닫기

		Label lblMessage = (Label) parent.lookup("#lblMessage");
		lblMessage.setText("메시지가 왔습니다.");
		
	//	Scene sc = new Scene(parent);
	//	primaryStage.setScene(sc);
	//	primaryStage.show();
		
		popup.getContent().add(parent);
		popup.setAutoHide(true); // 다른 윈도우로 포커스를 이동하면 자동 닫힘 설정
		popup.show(primaryStage); // popup 띄우기
	}

	public static void main(String[] args) {
		launch(args);

	}

}
