/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author josia
 */
public class SelectDeliveryTimeController implements Initializable {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private VBox verticalBox;
    @FXML
    private ImageView logo;
    @FXML
    private MenuItem deliveryWindowMnItem;
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

    @FXML
    private void setDeliveryTime(ActionEvent event) {
    }
    
}
