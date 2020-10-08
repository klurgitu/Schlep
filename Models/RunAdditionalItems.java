/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import static javafx.scene.input.DataFormat.URL;
import javafx.stage.Stage;

/**
 *
 * @author josiah Stadler
 * Last updated 10/8/20
 */
public class RunAdditionalItems extends Application{

    Stage window;
    Scene scene;
    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Additional Needs");
        URL file = new File("src/View/AdditionalNeedsPer.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(file);
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }
     public static void main(String args[]){
        launch(args);
    }
    
}
