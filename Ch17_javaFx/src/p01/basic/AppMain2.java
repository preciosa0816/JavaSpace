package p01.basic;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;
//javaFX : 겹친 비닐 구조
// 가장 안쪽 부터 : Stage-Title/Scene-Container-controller
public class AppMain2 extends Application {
//1.stage
	@Override
	public void start(Stage s) throws Exception {
		Button btn = new Button();//4.controller
		//Button btn2 = new Button();
		btn.setText("Login");
		//btn2.setText("ex");
		//버튼이 눌려졌을때의 동작(이벤트)
		btn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("login event 발생");
				
			}
		});
//		btn2.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent event) {
//				System.out.println("ex event 발생");
//				
//			}
//		});
//		
		
		//TilePane root = new TilePane();//StackPane : container
		StackPane root = new StackPane(); //3.container
		root.getChildren().add(btn);
		//root.getChildren().add(btn2);
		Scene sc = new Scene(root,300,250);
		s.setTitle("login screen");//2.title
		s.setScene(sc);//2.scene
		s.show();
		
	}

	public static void main(String[] args) {
		launch(args);
		
	}

}
