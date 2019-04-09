package sample;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Set;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swt.FXCanvas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;

import static sample.Windows.CreateAddNewItemWindow;

public class Controller {

    public static ObservableList<Task> tODOList = FXCollections.observableArrayList();

    @FXML
    private ListView<Task> listTODO = new ListView<>(tODOList);

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
        try{
            CreateAddNewItemWindow();
        } catch(IOException e){
            e.printStackTrace();
        }
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
