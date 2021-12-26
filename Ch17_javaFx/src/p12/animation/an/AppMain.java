package p12.animation.an;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//translateX 속성을 주어진 종료값까지 변화시켜 수평방향으로 슬라이드하는 애니메이션을 구현한코드
public class AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("AppMain");
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene sc = new Scene(root);
		primaryStage.setScene(sc);
		primaryStage.setWidth(350);
		primaryStage.setHeight(500);
		primaryStage.setResizable(false);
		primaryStage.show();
				
	}

	public static void main(String[] args) {
		launch(args);
	}

}
