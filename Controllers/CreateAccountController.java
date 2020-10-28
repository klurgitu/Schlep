package Controllers;

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

/**
 * FXML Controller class
 *
 * @author Marc Bittle
 */
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

    private static final MoveScene changeScene = new MoveScene();

    private SchlepUser user;

    /**
     *
     * @param e
     * @throws IOException
     */
    @FXML

    private void activateAcctBtn(ActionEvent e) throws IOException {
        // Force user to complete all fields
        if (firstName.getText().equals("") || lastName.getText().equals("") || email.getText().equals("") || phoneNumber.getText().equals("")) {
            this.messageLbl.setText("All fields required!");
        } else {
            if (!password.getText().equals(passwordConf.getText())) {
                this.messageLbl.setText("Passwords do not match!");
            } else {
                user = new SchlepUser(firstName, lastName, email, passwordConf, phoneNumber);

            }

        }

//        changeScene.Move("AddressSignUp.fxml", activateAcctBtn);
    }

    /**
     *
     * @param event
     * @throws Exception
     */
    @FXML
    public void changeToLoginScreenBtn(ActionEvent event) throws Exception {
        changeScene.Move("LoginView.fxml", changeToLoginBtn);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.messageLbl.setText("");
    }

}
