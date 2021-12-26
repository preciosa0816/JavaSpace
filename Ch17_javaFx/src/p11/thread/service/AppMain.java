package p11.thread.service;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//Service 클래스: 작업스레드 상에서 Task를 간편하게 시작, 취소, 재시작 할 수 있는 기능을 제공
public class AppMain extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loader.load();
		
		
		Scene sc = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(sc);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);

	}

	

}
