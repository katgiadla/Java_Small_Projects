package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

public class Controller {

    @FXML
    private ListView<Task> listTODO;

    @FXML
    private ListView<Task> listDoing;

    @FXML
    private Label labelDoing;

    @FXML
    private GridPane mainWindow;

    @FXML
    private Button newTaskButton;

    @FXML
    private Label labelDone;

    @FXML
    private Label labelTODO;

    @FXML
    private ListView<Task> listDone;

    @FXML
    void addNewTask(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert listTODO != null : "fx:id=\"listTODO\" was not injected: check your FXML file 'sample.fxml'.";
        assert listDoing != null : "fx:id=\"listDoing\" was not injected: check your FXML file 'sample.fxml'.";
        assert labelDoing != null : "fx:id=\"labelDoing\" was not injected: check your FXML file 'sample.fxml'.";
        assert mainWindow != null : "fx:id=\"mainWindow\" was not injected: check your FXML file 'sample.fxml'.";
        assert newTaskButton != null : "fx:id=\"newTaskButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert labelDone != null : "fx:id=\"labelDone\" was not injected: check your FXML file 'sample.fxml'.";
        assert labelTODO != null : "fx:id=\"labelTODO\" was not injected: check your FXML file 'sample.fxml'.";
        assert listDone != null : "fx:id=\"listDone\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
