package sample;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import static sample.Windows.addTaskWindowStage;

public class AddTaskWindow {

    @FXML
    private Label lebelPriority;

    @FXML
    private Button addNewItemButton;

    @FXML
    private TextField titleField;

    @FXML
    private Label lebelTitle;

    @FXML
    private Label lebelDescription;

    @FXML
    private DatePicker datePicker;

    @FXML
    private GridPane addNewTaskWindow;

    @FXML
    private Label lebelDate;

    @FXML
    private ComboBox<Priority> comboBox = new ComboBox<Priority>();

    @FXML
    private TextArea textArea;

    @FXML
    void makeNewTask(ActionEvent event) {
        String newTitle = titleField.getText();
        Priority newPriority = comboBox.getValue();
        LocalDate newExpiryDate = datePicker.getValue();
        String newDescription = textArea.getText();
        Controller.tODOList.add(new Task(newTitle, newPriority, newExpiryDate, newDescription));
        addTaskWindowStage.close();
    }

    @FXML
    void initialize() {

        comboBox.getItems().addAll(Priority.today, Priority.tommorow, Priority.thisWeek);

        assert lebelPriority != null : "fx:id=\"lebelPriority\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert addNewItemButton != null : "fx:id=\"addNewItemButton\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert titleField != null : "fx:id=\"titleField\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert lebelTitle != null : "fx:id=\"lebelTitle\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert lebelDescription != null : "fx:id=\"lebelDescription\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert datePicker != null : "fx:id=\"datePicker\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert addNewTaskWindow != null : "fx:id=\"addNewTaskWindow\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert lebelDate != null : "fx:id=\"lebelDate\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert comboBox != null : "fx:id=\"comboBox\" was not injected: check your FXML file 'addTaskWindow.fxml'.";
        assert textArea != null : "fx:id=\"textArea\" was not injected: check your FXML file 'addTaskWindow.fxml'.";

    }
}
