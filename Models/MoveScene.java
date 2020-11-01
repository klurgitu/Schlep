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
 *
 * Last Updated 10/31/2020
 *
 * @author Katelynn Urgitus
 */
public class MoveScene {

    public MoveScene() {
    }

    public void Move(String _nextFXML, Button _button) throws IOException {
        Scene scene;
        Stage stageTheLabelBelongs = (Stage) _button.getScene().getWindow();
        URL urlForDropdownFX = new File("src/View/" + _nextFXML).toURI().toURL();
        Parent root = FXMLLoader.load(urlForDropdownFX);
        scene = new Scene(root);
        stageTheLabelBelongs.setScene(scene);
    }

}
