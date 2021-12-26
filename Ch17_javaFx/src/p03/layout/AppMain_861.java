package p03.layout;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppMain_861 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//패딩설정===========
		HBox h = new HBox();
		h.setPadding(new Insets(50,10,10,50));//여백설정(위,오,아래,왼) // 오른쪽 아래 박스만듦
		Button b = new Button();
		b.setPrefSize(100, 100);
		
		//마진설정===========
//		HBox h = new HBox();
//		Button b = new Button();
//		b.setPrefSize(100, 100);
//		h.setMargin(b, new Insets(10,10,50,50)); //여백설정(위,오,아래,왼)//오른쪽 위에 박스 만듦
		
		h.getChildren().add(b);
		Scene sc = new Scene(h);
		primaryStage.setTitle("AppMain");
		primaryStage.setScene(sc);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
