/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;
import java.io.IOException;
import Models.MoveScene;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author josiah Stadler
 * Last Updated: 10/12/20
 */
public class OffloadingItemsController implements Initializable {

    private final MoveScene moveToBilling = new MoveScene();
    
    @FXML
    private Button nextBtn;
    @FXML
    private ImageView logo;
    @FXML
    private Label selectItemsLbl;
    @FXML
    private MenuButton menuBtn;
    @FXML
    private CheckMenuItem handTruckItem;
    @FXML
    private CheckMenuItem rampItem;
    @FXML
    private CheckMenuItem dollyItem;
    @FXML
    private Label driverAssistLbl;
    @FXML
    private MenuButton timeOfAssistMnBtn;
    @FXML
    private MenuItem assistMnItem_30;
    @FXML
    private MenuItem assistMnItem_1Hr;
    @FXML
    private MenuItem assistTimeMnItem_2Hr;
    @FXML
    private MenuItem assistMnItem_3hr;
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
    private void saveItemsAndMove(ActionEvent event) throws IOException{
       moveToBilling.Move("Billing.fxml", nextBtn);
    }

    @FXML
    private void setTimeOfAssist(ActionEvent event) {
    }
    /**
 * Will save the offloading items for the User into the Schlep Database
 * and move to the Billing screen
 * @param event
 * @throws IOException
 */
     
}
