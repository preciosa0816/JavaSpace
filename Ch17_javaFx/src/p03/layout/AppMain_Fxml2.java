package p03.layout;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//859p
public class AppMain_Fxml2 extends Application {

	@Override
	public void start(Stage s) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		
		//밑의 4줄은 fxml 불러오든 아니든 필요함
		Scene sc = new Scene(root);
		s.setTitle("입력상자::확인");
		s.setScene(sc);
		
		s.show();

	}

	public static void main(String[] args) {
		
		launch(args);
		
	}
}	
