package p08.control.menu_toolbar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//907
public class AppMain extends Application {
//code랑 fxcollections 에러남
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("rootnew2.fxml"));
		Scene sc = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
