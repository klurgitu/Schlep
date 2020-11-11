package Controllers;

/**
 * This is a controller for the Billing FXML
 *
 * Last Updated 10/31/2020
 *
 * @author Katelynn Urgitus
 */
import Models.BillingInfo;
import Models.MoveScene;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    /**
     * Will save billing info of the User in the Schlep Database and move to the
     * next screen
     *
     * @param event
     */
    @FXML
    private void saveInfoAndMove(ActionEvent event) throws IOException, SQLException {
        MoveScene.getInstance().Move("Login.fxml", nextBtn);
        BillingInfo info = new BillingInfo(nameOnCardField.getText(), cardNumberField.getText(), expirationDateField.getText(), ccvCvvField.getText());
    }

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        MoveScene.getInstance().Move("OffloadingItems.fxml", backBtn);
    }
}
