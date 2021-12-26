package p06.property_bind;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.text.Font;
//889 속성감시
public class RootController_891 implements Initializable {

	@FXML private Label label;
	@FXML private Slider slider;
	
	//ChangeListener : 속성이 변경되었을 떄 하위 메소드 실행
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		slider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				label.setFont(new Font(newValue.doubleValue()));//number클래스를상속했기때문에 사용가능
				//label.setFont:Label의 폰트변경  	newValue.doubleValue:slider의 변경된 value값
			}
		});

	}

}
