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
    private static final MoveScene goToNextPage = new MoveScene();
    
    @FXML
    private Button loginBtn;
    @FXML
    private Button returnToCreateAcctBtn;
    
    private final MoveScene moveToCreateAcct = new MoveScene();

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
<<<<<<< HEAD
    @FXML
    void moveToNextPage(ActionEvent event) throws IOException{
        goToNextPage.Move("SelectDeliveryType.fxml", loginBtn);
    }
    
=======

    @FXML
    private void returnToCreateAcctBtn(ActionEvent event) throws Exception{
        moveToCreateAcct.Move("CreateAccount.fxml", returnToCreateAcctBtn);
    }
    
    
>>>>>>> Added a 'back' button on the login view
}
