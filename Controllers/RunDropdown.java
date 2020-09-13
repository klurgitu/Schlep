package Controllers;

/**
 * This is the run for a drop-down selecting Country
 * @author Katelynn Urgitus
 * Last Updated 09/12/2020
 */
import java.io.File;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author katel
 */
public class RunDropdown extends Application {

    Stage window;
    Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        window = stage;
        window.setTitle("Country, State, City drop");
        URL urlForDropdownFX = new File("src/view/CountryDropdown.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(urlForDropdownFX);
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
