package Controllers;

/**
 * This is a Controller for user entering their offloading items
 *
 * Last Updated 11/05/2020
 *
 * @author Katelynn Urgitus
 */
import java.io.IOException;
import java.net.URL;
import Models.MoveScene;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.MenuButton;

public class OffloadingItemsController implements Initializable {

    @FXML
    private CheckMenuItem handTruckItem;
    @FXML
    private CheckMenuItem rampItem;
    @FXML
    private CheckMenuItem dollyItem;
    @FXML
    private Button nextBtn;
    @FXML
    private MenuButton menuBtn;
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Will save the offloading items for the User into the Schlep Database and
     * move to the Billing screen
     *
     * @param event
     * @throws IOException
     */
    @FXML
    private void saveItemsAndMove(ActionEvent event) throws IOException {
        MoveScene.getInstance().Move("Billing.fxml", nextBtn);
    }

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        MoveScene.getInstance().Move("AddressSignUp.fxml", backBtn);
    }
}
