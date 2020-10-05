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
import static javafx.scene.input.DataFormat.URL;
import javafx.stage.Stage;

/**
 *
 * @author josia
 */
public class RunAdditionalItems extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        URL file = new File("src/view/AdditionalItemsPer.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(file);
    }
    
}
