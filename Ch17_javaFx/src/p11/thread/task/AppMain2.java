package p11.thread.task;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//Task : call메소드 재정의(작업결과를 리턴값으로 가짐 , 제네릭타입)
//runLater(): 단순히 컨트롤으 ㅣ문자열 속성에 바인딩하는 것 보다 더 복잡한 UI변경시
public class AppMain2 extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("root2.fxml"));
		Parent root = loader.load();
		
		
		Scene sc = new Scene(root);
		
		primaryStage.setTitle("AppMain2");
		primaryStage.setScene(sc);
		primaryStage.show();

	}
	public static void main(String[] args) {
		launch(args);

	}

	

}
