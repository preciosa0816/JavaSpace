package p09.dialoge.primarystage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain_PrimaryStage extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root.fxml"));
		Parent root = loader.load();
		RootController controller = loader.getController();
		controller.setPrimaryStage(primaryStage);
		
		Scene sc = new Scene(root);
		
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(sc);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);

	}

	

}
