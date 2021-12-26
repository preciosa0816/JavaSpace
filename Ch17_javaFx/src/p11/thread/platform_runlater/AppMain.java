package p11.thread.platform_runlater;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//runLater(): 단순히 컨트롤의 문자열 속성에 바인딩하는 것 보다 더 복잡한 UI변경시
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
