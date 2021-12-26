package p06.property_bind2;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
//Bindings.bindBidirectional : 양방향 참조
//textArea2.textProperty().bind(textArea1.textProperty()) : textArea2는 쓰기 불가능 1내용참조만 가능(단방향)

public class RootController_893 implements Initializable {

	@FXML
	private TextArea textArea1;
	@FXML
	private TextArea textArea2;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty());
		//textArea2.textProperty().bind(textArea1.textProperty()); // textArea2는 쓰기 불가능
	}

}
