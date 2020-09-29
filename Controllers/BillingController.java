package Controllers;

/**
 * This is a controller for the Billing FXML
 * @author Katelynn Urgitus
 * Last Updated 09/24/2020
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
//import Models.MoveScene;
import java.io.IOException;

public class BillingController implements Initializable {

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

    //private final MoveScene moveToRequest = new MoveScene();

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
        //moveToRequest.Move("Login.fxml", nextButton);
    }

}
