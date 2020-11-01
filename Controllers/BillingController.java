package Controllers;

/**
 * This is a controller for the Billing FXML
 *
 * Last Updated 10/31/2020
 *
 * @author Katelynn Urgitus
 */
import Models.MoveScene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class BillingController implements Initializable {

    private static final MoveScene moveScene = new MoveScene();

    @FXML
    private TextField nameOnCardField;
    @FXML
    private TextField cardNumberField;
    @FXML
    private TextField expirationDateField;
    @FXML
    private TextField ccvCvvField;
    @FXML
    private Button nextBtn;
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
     * Will save billing info of the User in the Schlep Database and move to the
     * next screen
     *
     * @param event
     */
    @FXML
    private void saveInfoAndMove(ActionEvent event) throws IOException {
        moveScene.Move("Login.fxml", nextBtn);
    }

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        moveScene.Move("OffloadingItems.fxml", backBtn);
    }
}
