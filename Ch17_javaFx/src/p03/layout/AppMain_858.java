package p03.layout;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
//858: fxml없는 프로그램 : 프로그램적 레이아웃 자바코드
public class AppMain_858 extends Application {
	
	@Override
	public void start(Stage s) throws Exception {
		HBox hbox = new HBox(); //Hbox 컨테이너 생성
		hbox.setPadding(new Insets(10));//안쪽 여백 설정
		hbox.setSpacing(10);//컨트롤 간의 수평간격 설정
		
		TextField textField = new TextField(); //TextField 컨트로 생성
		textField.setPrefWidth(200);//TextField의 폭 설정
		
		Button button = new Button();//Button 컨트롤 생성
		button.setText("확인");	//Button 글자 설정
		
		ObservableList<Node> list = hbox.getChildren(); //Hbox의 ObservableList 얻기
		list.add(textField);//TextField 컨트롤 배치
		list.add(button);//Button의 컨트롤 배치
		
		Scene sc = new Scene(hbox); //장면생성
		
		s.setTitle("AppMain"); //윈도우 창 제목 설정
		s.setScene(sc);//윈도우 창에 장면 설정
		s.show();//윈도우 창 보여주기
		}

	public static void main(String[] args) {
		launch(args);

	}

}
