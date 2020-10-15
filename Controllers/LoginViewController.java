package Controllers;

import Models.MoveScene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    void moveToNextPage(ActionEvent event) throws IOException{
        goToNextPage.Move("SelectDeliveryType.fxml", loginBtn);
    }
    
}
