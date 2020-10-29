package Controllers;

/**
 * This is a controller for the Billing FXML
 * @author Katelynn Urgitus
 * Last Updated 10/23/2020
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
    private static final MoveScene goToPrvPage = new MoveScene();
    private static final MoveScene saveInfoAndMove = new MoveScene();

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
        //For future login or maybe move to pickup request
        saveInfoAndMove.Move("Login.fxml", nextBtn);
    }

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        goToPrvPage.Move("OffloadingItems.fxml", backBtn);
    }
}
