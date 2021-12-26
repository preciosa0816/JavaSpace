package p01.basic;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		Circle c = new Circle(40,40,30);
		Group root = new Group(c); //원 여러개를 그룹으로 묶기
		Scene s= new Scene(root,300,200);
		
		arg0.setTitle("JAVAFX");
		arg0.setScene(s);
		arg0.show();
		
		
	}

	public static void main(String[] args) {
		
		launch(args);//void javafx.application.Application.launch(String... args)//파라미터 여러개를 쓸 수있음
						//start()찾기
		
		
		
	
	}

}
