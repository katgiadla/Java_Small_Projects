package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class EditWindow {

    @FXML
    private Label lebelPriority;

    @FXML
    private TextField titleField;

    @FXML
    private Button editTasks;

    @FXML
    private Label lebelTitle;

    @FXML
    private Label lebelDescription;

    @FXML
    private DatePicker datePicker;

    @FXML
    private Label lebelDate;

    @FXML
    private ComboBox<Task> comboBox;

    @FXML
    private GridPane editWindow;

    @FXML
    private TextArea textArea;

    @FXML
    void editMyTask(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert lebelPriority != null : "fx:id=\"lebelPriority\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert titleField != null : "fx:id=\"titleField\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert editTasks != null : "fx:id=\"editTasks\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert lebelTitle != null : "fx:id=\"lebelTitle\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert lebelDescription != null : "fx:id=\"lebelDescription\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert datePicker != null : "fx:id=\"datePicker\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert lebelDate != null : "fx:id=\"lebelDate\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert editWindow != null : "fx:id=\"editWindow\" was not injected: check your FXML file 'editWindow.fxml'.";
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'editWindow.fxml'.";

    }
}
