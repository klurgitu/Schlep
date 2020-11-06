package Controllers;

/**
 * last updated 11/6/2020
 *
 * Controls all action events on the CreateAccount FXML file
 *
 * @author Marc Bittle
 * @author Katelynn Urgitus Last Updated 11/05/2020
 */
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import Models.MoveScene;
import java.io.IOException;
import javafx.scene.control.PasswordField;
import Models.SchlepUser;

public class CreateAccountController implements Initializable {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private Label messageLbl;

    @FXML
    private TextField email;

    @FXML
    private TextField phoneNumber;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField passwordConf;

    @FXML
    private Button changeToLoginBtn;

    @FXML
    private Button activateAcctBtn;

    /**
     *
     * @param e
     * @throws IOException
     */
    @FXML

    private void activateAcctBtn(ActionEvent e) throws IOException {
        // Force user to complete all fields
        if (firstName.getText().equals("") || lastName.getText().equals("") || email.getText().equals("") || phoneNumber.getText().equals("")) {
            messageLbl.setText("All fields required!");
        } else {
            if (!password.getText().equals(passwordConf.getText())) {
                messageLbl.setText("Passwords do not match!");
            } else {
                messageLbl.setText("");
                SchlepUser user = new SchlepUser(firstName, lastName, email, passwordConf, phoneNumber);
                MoveScene.getInstance().Move("AddressSignUp.fxml", activateAcctBtn);
            }

        }
    }

    /**
     *
     * @param event
     * @throws Exception
     */
    @FXML
    public void changeToLoginScreenBtn(ActionEvent event) throws Exception {
        MoveScene.getInstance().Move("LoginView.fxml", changeToLoginBtn);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        messageLbl.setText("");
    }

}
