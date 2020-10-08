/**
 * Controller for 'AdditionalNeedsPer.fxml' Controller Class
 * @Author Josiah Stadler
 * Last updated 10/8/20
 */

package Controllers;

import Models.MoveScene;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class AdditionalNeedsPerController {
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    private final double wage = 15.00;
    private final double halfHrWage = wage*.5;
    private final double twoHrWage = wage * 2;
    private final double threeHrWage = wage * 3;
    
    private double subtotal;
    private String dollyStr;
    private String rampStr;
    private String handTruckStr;
    private String time;
    private String checkedItemsMsq;
    int comma = 0;
    
    
    
    
    @FXML // fx:id="anchor"
    private AnchorPane anchor; // Value injected by FXMLLoader

    @FXML // fx:id="logo"
    private ImageView logo; // Value injected by FXMLLoader

    @FXML // fx:id="additionalItemMnBtn"
    private MenuButton additionalItemMnBtn; // Value injected by FXMLLoader

    @FXML // fx:id="dollyCheckMnItem"
    private CheckMenuItem dollyCheckMnBtn; // Value injected by FXMLLoader

    @FXML // fx:id="handTruckCheckMnBtn"
    private CheckMenuItem handTruckCheckMnBtn; // Value injected by FXMLLoader

    @FXML // fx:id="rampCheckMnItem"
    private CheckMenuItem rampCheckMnItem; // Value injected by FXMLLoader

    @FXML // fx:id="assistCheckMnItem"
    private CheckMenuItem assistCheckMnItem; // Value injected by FXMLLoader

    @FXML // fx:id="AssistTimeAmountMnBtn"
    private MenuButton AssistTimeAmountMnBtn; // Value injected by FXMLLoader

    @FXML // fx:id="time30Rb"
    private RadioMenuItem time30Rb; // Value injected by FXMLLoader

    @FXML // fx:id="time1HrRb"
    private RadioMenuItem time1HrRb; // Value injected by FXMLLoader

    @FXML // fx:id="time2HrRb"
    private RadioMenuItem time2HrRb; // Value injected by FXMLLoader

    @FXML // fx:id="time3HrRb"
    private RadioMenuItem time3HrRb; // Value injected by FXMLLoader

    @FXML // fx:id="processBtn"
    private Button processBtn; // Value injected by FXMLLoader

    @FXML // fx:id="confirmedLbl"
    private Label confirmedLbl; // Value injected by FXMLLoader

    @FXML // fx:id="nextBtn"
    private Button nextBtn; // Value injected by FXMLLoader

    @FXML // fx:id="backBtn"
    private Button backBtn; // Value injected by FXMLLoader

    @FXML // fx:id="NeedsLbl"
    private Label NeedsLbl; // Value injected by FXMLLoader

    @FXML // fx:id="costLbl"
    private Label costLbl; // Value injected by FXMLLoader

    @FXML
    void CheckDriverAssist(ActionEvent event) {
        AssistTimeAmountMnBtn.setVisible(true);
        processBtn.setDisable(false);

    }

    @FXML
    void checkDolly(ActionEvent event) {
        dollyStr = dollyCheckMnBtn.getText();

    }

    @FXML
    void checkHandTruck(ActionEvent event) {
        handTruckStr = handTruckCheckMnBtn.getText();

    }

    @FXML
    void checkRamp(ActionEvent event) {
         rampStr = rampCheckMnItem.getText();

    }

    @FXML
    void movePrvPage(ActionEvent event) throws IOException {
         goToPrvPage.Move("SelectDeliveryType.fxml",backBtn);


    }

    @FXML
    void moveToNextPage(ActionEvent event) throws IOException {
        goToNextPage.Move("PickupAddress.fxml",nextBtn);

    }
    @FXML
    void selectTime(ActionEvent event){
        
    }
   
    @FXML
    void selectTime(RadioMenuItem m, ActionEvent event) {
        
         if(m.getId().equals(time30Rb.getId())){
            time1HrRb.setSelected(false);
            time2HrRb.setSelected(false);
            time3HrRb.setSelected(false);
            time = time30Rb.getText(); 
            subtotal = halfHrWage;
        }
        else if(m.getId().equals(time1HrRb.getId())){
            time30Rb.setSelected(false);
            time2HrRb.setSelected(false);
            time3HrRb.setSelected(false);
            time = time1HrRb.getText();
            subtotal = wage;
        }
        else if(m.getId().equals(time2HrRb.getId())){
            time30Rb.setSelected(false);
            time1HrRb.setSelected(false);
            time3HrRb.setSelected(false);
            time = time2HrRb.getText(); 
            subtotal = twoHrWage;
        }
        else{
            time30Rb.setSelected(false);
            time1HrRb.setSelected(false);
            time2HrRb.setSelected(false);
            time = time3HrRb.getText();
            subtotal = threeHrWage;
        }
         
    }

    @FXML
    void showCost(ActionEvent event) {
        if(dollyCheckMnBtn.isSelected()){
            //get count of commas needed for string output
        }
        confirmedLbl.setVisible(true);
        //NeedsLbl.setText(itemsSelectedMsg);
        costLbl.setText(time + "of assistance = "+ subtotal);
        NeedsLbl.setVisible(true);
        costLbl.setVisible(true);
        nextBtn.setDisable(false);

    }

}
