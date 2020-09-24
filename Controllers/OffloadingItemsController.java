package Controllers;

/**
 * This is a Controller for user entering their offloading items
 * @author Katelynn Urgitus
 * Last Updated 09/22/2020
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
    private Button nextButton;
    @FXML
    private MenuButton menuButton;
    @FXML
    private CheckMenuItem handTruckItem;
    @FXML
    private CheckMenuItem rampItem;
    @FXML
    private CheckMenuItem dollyItem;

    private final MoveScene moveToBilling = new MoveScene();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
/**
 * Will save the offloading items for the User into the Schlep Database
 * and move to the Billing screen
 * @param event
 * @throws IOException
 */
    @FXML
    private void saveItemsAndMove(ActionEvent event) throws IOException{
       moveToBilling.Move("Billing.fxml", nextButton);
    }
}
