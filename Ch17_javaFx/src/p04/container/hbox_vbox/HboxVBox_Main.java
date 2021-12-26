package p04.container.hbox_vbox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//Hbox와 VBox는 수평과 수직으로 컨트롤을 배치하는 컨테이너 
//Hbox 는 컨트롤의 높이를 확장하고 컨트롤의 폭은 유지
//Vbox 는 컨트롤의 폭을 확장하고 컨트롤의 높이는 유지
//button은 크기조정x
public class HboxVBox_Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root_875_2.fxml"));
		Scene sc = new Scene(root);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(sc);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}
}
