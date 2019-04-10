package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static jdk.xml.internal.SecuritySupport.getClassLoader;

public class Windows {

    public static javafx.stage.Stage addTaskWindowStage =new Stage();
    public static Stage editTaskStage=new Stage();
    public static ObservableList<Task> TempList=null;
    public static int TempIndex;

    public static void CreateAddNewItemWindow() throws IOException {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(Windows.class.getResource("addTaskWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            addTaskWindowStage.setScene(new Scene(root1));
            addTaskWindowStage.show();

        }catch(IOException e){
            System.err.println("can't create a new window" +e );
        }
    }

    public static void CreateEditWindow(ObservableList<Task> list, int position) throws IOException{
        try{
            TempList=list;
            TempIndex=position;
            FXMLLoader loaderEditTask = new FXMLLoader();
            loaderEditTask.setLocation(getClassLoader().getResource("EditTask.fxml"));
            Parent root1 = loaderEditTask.load();

            editTaskStage.setScene(new Scene(root1));
            editTaskStage.show();
        }catch(IOException e){
            System.out.println("can't create a new window"+e);
        }

    }
}
