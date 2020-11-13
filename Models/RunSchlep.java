package Models;

/**
 * Launch the application
 *
 * @author Katelynn Urgitus Last Updated 09/12/2020
 * @author Marc Bittle Last Updated 10/22/2020
 */
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RunSchlep extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        URL urlForDropdownFX = new File("src/view/Timer.fxml").toURI().toURL();
        Parent parent = FXMLLoader.load(urlForDropdownFX);
        Scene scene = new Scene(parent);

        stage.setTitle("Schlep");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
