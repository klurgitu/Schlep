package Controllers;

/**
 * last updated 10/22/2020
 *
 * Controls all action events on the LoginView FXML file
 *
 * @author Marc Bittle
 * @author Katelynn Urgitus Last Updated 11/05/2020
 */
import Models.MoveScene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import Models.MoveScene;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import DB.MySQLConnector;

public class LoginViewController implements Initializable {

    @FXML
    private Button loginBtn;
    @FXML
    private Button returnToCreateAcctBtn;

    @FXML
    private Label messageLbl;
    @FXML
    private TextField userEmail;
    @FXML
    private PasswordField userPassword;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        messageLbl.setText("");
    }

    /**
     *
     * @param event
     * @throws IOException
     */
    @FXML
    void moveToNextPage(ActionEvent event) throws SQLException, IOException {
        String email = userEmail.getText();
        String password = userPassword.getText();

        MySQLConnector connect = new MySQLConnector();
        Map<String, String> checkExists = new HashMap();
        checkExists.put("userEmail", email);
        checkExists.put("userPassword", password);

        if (connect.readObject(checkExists, "user") == null) {
            messageLbl.setText("Incorrect Email/Password!");
        } else {
            MoveScene.getInstance().Move("DeliveryInfo.fxml", loginBtn);
        }

    }

    /**
     *
     * @param event
     * @throws Exception
     */
    @FXML
    private void returnToCreateAcctBtn(ActionEvent event) throws Exception {
        MoveScene.getInstance().Move("CreateAccount.fxml", returnToCreateAcctBtn);
    }

}
