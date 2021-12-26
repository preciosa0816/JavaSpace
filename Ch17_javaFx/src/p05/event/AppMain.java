package p05.event;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene sc = new Scene(root);

		primaryStage.setTitle("Event");
		primaryStage.setScene(sc);
		primaryStage.setOnCloseRequest((event)-> System.out.println("종료 클릭"));
		
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
		
	}

}
