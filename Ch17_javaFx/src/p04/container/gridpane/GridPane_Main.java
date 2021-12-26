package p04.container.gridpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//그리드로 컨트롤을 배치하되 셀의 크기가 고정적이지 않고 유동적인 컨테이너
//셀병합이 가능. 다양한 입력폼화면을 만들 떄 매우 유용하게 사용 가능
//각 컨트롤은 자신이 배치될 행 인덱스와 컬럼 인덱스를 속성으로 가지며 몇개의 셀병합할지도 지정 가능
public class GridPane_Main extends Application {

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
