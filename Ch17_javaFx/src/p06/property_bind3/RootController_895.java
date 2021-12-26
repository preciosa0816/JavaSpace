package p06.property_bind3;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
//속성감시
// 윈도우 창크기 변경되도 항상 화면 정중앙에 원을 그리는 예제
public class RootController_895 implements Initializable {

	@FXML private AnchorPane root;
	@FXML private Circle circle;
	
	//Bindings.divide(): 루트 컨테이너의 폭과 높이를 원의 중심과 바인딩하기 위해 1/2하기위해 사용
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		circle.centerXProperty().bind(Bindings.divide(root.widthProperty(), 2));
		circle.centerYProperty().bind(Bindings.divide(root.heightProperty(), 2));
	}

}
