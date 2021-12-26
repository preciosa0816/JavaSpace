package p04.container.boarderpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//BorderPane은 top,bottom,left,right,center셀에 컨트롤을 배치하는 컨테이너이다.
//컨트롤+다른 컨테이너 배치 가능 => 다양한 레이아웃을 만들어 낼 수 있음(각셀에는 하나의컨트롤 또는 컨테이너만 배치 가능)
public class BoarderPane_Main extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene sc = new Scene(root);

		primaryStage.setTitle("AppMain");
		primaryStage.setScene(sc);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}
}
