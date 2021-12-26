package p04.container.anchorpane;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//x축 y축 기준으로 배치
public class AnchorpaneMain extends Application  {
@Override
		public void start(Stage primaryStage) throws Exception {
			Parent root = FXMLLoader.load(getClass().getResource("root_873.fxml"));
			Scene sc = new Scene(root);

			primaryStage.setTitle("AppMain");
			primaryStage.setScene(sc);
			primaryStage.show();

			//<다른 방법>
//			FXMLLoader loader = new FXMLLoader(getClass().getResource(""));
//			Parent root2 = loader.load();
//			Scene sc2 = new Scene(root2);
//			primaryStage.setTitle("");
//			primaryStage.setScene(sc2);
//			primaryStage.show();
			
		}

	public static void main(String[] args) {
		
		
			launch(args);

		}

	}

	
