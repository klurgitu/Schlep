package Controllers;

/**
 * This is a Controller for user entering their offloading items
 * @author Katelynn Urgitus
 * Last Updated 09/22/2020
 */
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuButton;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author katel
 */
public class OffloadingItemsController implements Initializable {

    Scene scene;
    @FXML
    private Button nextButton;
    @FXML
    private MenuButton menuButton;
    @FXML
    private CheckMenuItem handTruckItem;
    @FXML
    private CheckMenuItem rampItem;
    @FXML
    private CheckMenuItem dollyItem;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void saveItemsAndMove(ActionEvent event) throws IOException, SQLException {
        Stage stageTheLabelBelongs = (Stage) nextButton.getScene().getWindow();
        URL urlForDropdownFX = new File("src/View/OffloadingItems.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(urlForDropdownFX);
        scene = new Scene(root);
        stageTheLabelBelongs.setScene(scene);
    }
}
