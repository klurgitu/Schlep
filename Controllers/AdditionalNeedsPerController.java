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
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author josia
 */
public class AdditionalNeedsPerController implements Initializable {

    @FXML
    private AnchorPane nextBtn;
    @FXML
    private ImageView logo;
    @FXML
    private MenuButton additionalItemMnBtn;
    @FXML
    private CheckMenuItem dollyCheckMnItem;
    @FXML
    private CheckMenuItem handTruckCheckMnBtn;
    @FXML
    private CheckMenuItem rampCheckMnItem;
    @FXML
    private CheckMenuItem assistCheckMnItem;
    @FXML
    private MenuButton AssistTimeAmountMnBtn;
    @FXML
    private MenuItem selectAssistAmount_30;
    @FXML
    private MenuItem selectAssistTime_1Hr;
    @FXML
    private MenuItem AssistTime_2Hr;
    @FXML
    private MenuItem assistTime_3Hr;
    @FXML
    private Label confirmedLbl;
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
    private void checkItem(ActionEvent event) {
    }

    @FXML
    private void setItem(ActionEvent event) {
    }

    @FXML
    private void selectTime(ActionEvent event) {
    }
    
}
