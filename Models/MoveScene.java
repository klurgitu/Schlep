package Models;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * This is a class for moving from one FXML to another
 * @author Katelynn Urgitus
 * Last Updated 09/24/2020
 */
public class MoveScene {

    public MoveScene() {
    }


    public void Move(String nextFXML, Button button) throws IOException {
        Scene scene;
        Stage stageTheLabelBelongs = (Stage) button.getScene().getWindow();
        URL urlForDropdownFX = new File("src/View/" + nextFXML).toURI().toURL();
        Parent root = FXMLLoader.load(urlForDropdownFX);
        scene = new Scene(root);
        stageTheLabelBelongs.setScene(scene);
    }

}
