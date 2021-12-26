package p09.dialoge;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class custom_AppMain extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Stage dialog = new Stage(StageStyle.UTILITY);
		dialog.initModality(Modality.WINDOW_MODAL);
		dialog.initOwner(primaryStage);
		dialog.setTitle("확인");
		
		Parent parent = FXMLLoader.load(getClass().getResource("custom_dialog.fxml"));
		Label txtTitle = (Label) parent.lookup("#txtTitle");//메시지 설정
		txtTitle.setText("확인하셨습니까?");
		Button btnOk = (Button) parent.lookup("#btnOk");//버튼이벤트처리
		btnOk.setOnAction(event->dialog.close());
		Scene scene = new Scene(parent);
		
		dialog.setScene(scene);//다이얼로그에 scene 설정
		dialog.setResizable(false);//크기 변경불가 설정
		dialog.show();//다이얼로그 띄우기
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
