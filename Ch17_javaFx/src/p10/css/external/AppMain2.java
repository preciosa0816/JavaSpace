package p10.css.external;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain2 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root2.fxml"));
		Scene sc = new Scene(root);
		
		// Css파일이 추가된 경우
		sc.getStylesheets().add(getClass().getResource("app2.css").toString());
		primaryStage.setTitle("AppMain2");

		primaryStage.setScene(sc);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}
}
