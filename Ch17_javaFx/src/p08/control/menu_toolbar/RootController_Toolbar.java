package p08.control.menu_toolbar;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

public class RootController_Toolbar implements Initializable {
	@FXML private TextArea textArea;
	@FXML private ListView<String> listView;
	@FXML private ComboBox<String> combo;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combo.setItems(FXCollections.observableArrayList("공개","비공개"));
		
	}
	
	public void handleNew(ActionEvent e) {
		textArea.appendText("New\n");
	}
	
	public void handleOpen(ActionEvent e) {
		textArea.appendText("Open\n");
	}
	
	public void handleSave(ActionEvent e) {
		textArea.appendText("Save\n");
	}
	
	public void handleExit(ActionEvent e) {
		Platform.exit();
	}
	

}
