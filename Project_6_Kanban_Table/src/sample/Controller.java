package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ScrollPane listTODO;

    @FXML
    private Button newTaskButton;

    @FXML
    private ScrollPane listProcessing;

    @FXML
    private ScrollPane listDone;

    @FXML
    void addNewTask(ActionEvent event) {
        System.out.println("I don't undestand");
    }

    @FXML
    void initialize() {
        assert listTODO != null : "fx:id=\"listTODO\" was not injected: check your FXML file 'sample.fxml'.";
        assert newTaskButton != null : "fx:id=\"newTaskButton\" was not injected: check your FXML file 'sample.fxml'.";
        assert listProcessing != null : "fx:id=\"listProcessing\" was not injected: check your FXML file 'sample.fxml'.";
        assert listDone != null : "fx:id=\"listDone\" was not injected: check your FXML file 'sample.fxml'.";

    }
}
