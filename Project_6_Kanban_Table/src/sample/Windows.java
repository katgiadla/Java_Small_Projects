package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static jdk.xml.internal.SecuritySupport.getClassLoader;

public class Windows {

    public static javafx.stage.Stage addTaskWindowStage =new Stage();

    public static void CreateAddNewItemWindow() throws IOException {
        try{

            FXMLLoader fxmlLoader = new FXMLLoader(Windows.class.getResource("addTaskWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();

        }catch(IOException e){
            System.err.println("can't create a new window" +e );
        }

    }
}
