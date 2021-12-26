package p12.animation.screen_moving;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//화면 이동 구현
public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("AppMain");
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setWidth(350);
		primaryStage.setHeight(500);
		primaryStage.setResizable(false);
		primaryStage.show();
				
	}

	public static void main(String[] args) {
		launch(args);
	}

}
