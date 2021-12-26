package p05.event;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

//fxml에서 있는 이벤트 내용을 만드는 곳(EvenHandler 생성 및 등록)
//Initializable : UI컨트롤의 초기화 , 이벤트 핸들러 등록, 속성감시 등에 사용
public class RootController2 implements Initializable {
	// fxml에서 사용하는 객체 선언
	@FXML
	private Button btn1;
	@FXML
	private Button btn2;
	@FXML
	private Button btn3;

	// 초기화, 이벤트 핸들러 등록
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// 익명구현객체
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				handleBtn1Action(event);
			}
		});

		// 람다식
		btn2.setOnAction((event) -> handleBtn2Action(event));
		// 람다식
		//btn3.setOnAction((event) -> handleBtn3Action(event));

	}

	public void handleBtn1Action(ActionEvent event) {
		System.out.println("버튼 1 클릭");
	}

	public void handleBtn2Action(ActionEvent event) {
		System.out.println("버튼 2 클릭");
	}

	public void handleBtn3Action(ActionEvent event) {
		System.out.println("버튼 3 클릭");
	}

}
