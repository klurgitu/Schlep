package Controllers;

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

/**
 * FXML Controller class
 *
 * @author Marc Bittle
 */
public class LoginViewController implements Initializable {

    @FXML
    private Button loginBtn;
    @FXML
    private Button returnToCreateAcctBtn;

    private static final MoveScene changeScene = new MoveScene(); // Handles scene changes

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    void moveToNextPage(ActionEvent event) throws IOException {
        changeScene.Move("SelectDeliveryType.fxml", loginBtn);
    }


    @FXML
    private void returnToCreateAcctBtn(ActionEvent event) throws Exception {
        changeScene.Move("CreateAccount.fxml", returnToCreateAcctBtn);
    }


}
