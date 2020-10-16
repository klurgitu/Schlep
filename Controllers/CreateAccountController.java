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
    private Label welcomeMSG;

    @FXML
    private TextField email;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField passwordConf;

    @FXML
    private Button changeToLoginBtn;

    @FXML
    private Button activateAcctBtn;

    private final MoveScene moveToLogin = new MoveScene();
    private final MoveScene moveToAddress = new MoveScene();

    /**
     * When a user makes a new account, prints a welcome message with the users
     * first and last name
     */
    @FXML
    private void activateAcctBtn(ActionEvent e) throws IOException {
        String welcome = "Welcome, ";
        welcome += firstName.getText() + " ";
        welcome += lastName.getText();
        this.welcomeMSG.setText(welcome);
        moveToAddress.Move("AddressSignUp.fxml", activateAcctBtn);
    }

    /**
     * If user already has an account, change scene to login screen
     *
     * @param event read from button to get the stage
     * @throws Exception for IO
     */
    @FXML
    public void changeToLoginScreenBtn(ActionEvent event) throws Exception {
        moveToLogin.Move("LoginView.fxml", changeToLoginBtn);
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        welcomeMSG.setText("");
    }

}
