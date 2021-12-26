package p04.container.tilepane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//그리드로 컨트롤을 배치하되 고정된 셀크기를 갖는 컨테이너./
// 오른쪽에 컨트롤을 배치할 공간이 부족하면 새로운 행에 컨트롤 배치
public class TilePane_Main extends Application {

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
