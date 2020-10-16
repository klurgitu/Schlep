/**
 * Controller for 'AdditionalNeedsPer.fxml' Controller Class
 * @Author Josiah Stadler
 * Last updated 10/8/20
 */

package Controllers;

import Models.MoveScene;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
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
    private String time = "Your selected assistance time is: ";
    private String itemsMsg = "You have selected the following additional items to assist you: \n";
    private String costMsg;
    
    
    
    
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
        //processBtn.setDisable(false);

    }

    @FXML
    void checkDolly(ActionEvent event) {
        itemsMsg += dollyCheckMnBtn.getText()+"\n";

    }

    @FXML
    void checkHandTruck(ActionEvent event) {
         itemsMsg += handTruckCheckMnBtn.getText() +"\n";

    }
  

    

    @FXML
    void checkRamp(ActionEvent event) {
          itemsMsg += rampCheckMnItem.getText() + "\n";

    }

    @FXML
    void movePrvPage(ActionEvent event) throws IOException {
         goToPrvPage.Move("SelectDeliveryType.fxml",backBtn);


    }

    @FXML
    void moveToNextPage(ActionEvent event) throws IOException {
       goToNextPage.Move("PickupAddress.fxml",nextBtn);
       //goToNextPage.Move("SelectDeliveryType.fxml",nextBtn);

    }
    @FXML
    void selectTime(ActionEvent event){
       RadioMenuItem source = (RadioMenuItem) event.getSource();
       String id = source.getId();
        switch (id) {
            case "time30":
                subtotal = halfHrWage;
                time += time30Rb.getText();
                break;
            case "time1Hr":
                subtotal = wage;
                time += time1HrRb.getText();
                break;
            case "time2Hr":
                subtotal = twoHrWage;
                time += time2HrRb.getText();
                break;
            case "time3Hr":
                subtotal = threeHrWage;
                time += time3HrRb.getText();
                break;
            default:                
                subtotal = 0;
                time = "";
        }        
        
        
    } 
   

    @FXML
    void showCost(ActionEvent event) {
        confirmedLbl.setVisible(true);
        NeedsLbl.setText(itemsMsg);
        costLbl.setText(time + " of assistance.\n" + " with a cost of $ " + String.format("%.2f", subtotal) + "\n");
        NeedsLbl.setVisible(true);
        costLbl.setVisible(true);
        nextBtn.setDisable(false);
        
        
    }
      
}
