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
/**
 * Controller for 'AdditionalNeedsPer.fxml' Controller Class
 * @Author Josiah Stadler
 * Last updated 10/23/20
 */
public class AdditionalNeedsPerController {
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    private final double wage = 15.00;
    private final double halfHrWage = wage*.5;
    private final double twoHrWage = wage * 2;
    private final double threeHrWage = wage * 3;    
    private double subtotal;
    private String time;   
    private String itemsMsg = ""; 
    private String costMsg;    
    @FXML 
    private AnchorPane anchor; 

    @FXML 
    private ImageView logo;

    @FXML 
    private MenuButton additionalItemMnBtn; 

    @FXML 
    private CheckMenuItem dollyCheckMnBtn; 

    @FXML 
    private CheckMenuItem handTruckCheckMnBtn; 

    @FXML
    private CheckMenuItem rampCheckMnItem; 

    @FXML 
    private CheckMenuItem assistCheckMnItem; 

    @FXML 
    private MenuButton AssistTimeAmountMnBtn; 

    @FXML 
    private RadioMenuItem time30Rb; 

    @FXML 
    private RadioMenuItem time1HrRb; 

    @FXML 
    private RadioMenuItem time2HrRb;

    @FXML 
    private RadioMenuItem time3HrRb;

    @FXML 
    private Button processBtn;

    @FXML 
    private Label confirmedLbl; 

    @FXML 
    private Button nextBtn; 

    @FXML 
    private Button backBtn; 

    @FXML 
    private Label NeedsLbl; 

    @FXML
    private Label costLbl; 

    @FXML
    void CheckDriverAssist(ActionEvent event) {
        AssistTimeAmountMnBtn.setVisible(true);
        costMsg = "Your selected assistance time is:\n";
        //costLbl.setText(costMsg);
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
         goToPrvPage.Move("DeliveryInfo.fxml",backBtn);
    }

    @FXML
    void moveToNextPage(ActionEvent event) throws IOException {
       goToNextPage.Move("PickupAddress.fxml",nextBtn);
       //goToNextPage.Move("SelectDeliveryType.fxml",nextBtn);
    }
    @FXML
    void selectTime(ActionEvent event) {
       RadioMenuItem source = (RadioMenuItem) event.getSource();
       String id = source.getId();
       AssistTimeAmountMnBtn.setText(source.getText());
        switch (id) {
            case "time30":
                subtotal = halfHrWage;
                time = time30Rb.getText();
                break;
            case "time1Hr":
                subtotal = wage;
                time = time1HrRb.getText();
                break;
            case "time2Hr":
                subtotal = twoHrWage;
                time = time2HrRb.getText();
                break;
            case "time3Hr":
                subtotal = threeHrWage;
                time = time3HrRb.getText();
                break;
            default:                
                subtotal = 0;
                time = "";
        }    
       costMsg +=  time + " of assistance.\n" + " with a cost of $ " + String.format("%.2f", subtotal) + "\n";
    }
    @FXML
    void showCost(ActionEvent event) {
       costLbl.setText(costMsg);
       confirmedLbl.setVisible(true);
       NeedsLbl.setText("You have selected the following additional items to assist you: \n" + itemsMsg);        
       NeedsLbl.setVisible(true);
       costLbl.setVisible(true);
       nextBtn.setDisable(false);        
    }     
}
