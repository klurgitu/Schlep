package Controllers;

import Models.MoveScene;
import Models.PassCost;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author Josiah Stadler updated: 10/16/20, 11/11/20
 * @author Katelynn Urgitus Last Updated 11/05/2020
 */
public class DeliveryInfoController extends PassCost implements Initializable {

   //To hold data format for output
    private  String date;
    private static final double instantCost = 25.00;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private DatePicker scheduleDeliveryDatePicker;
    @FXML
    private MenuButton selectTimeMnBtn;
    @FXML
    private MenuItem selectedTime10_12MnItem;
    @FXML
    private MenuItem selectedTime1_3MnItem;
    @FXML
    private MenuItem selectedTime3_5MnItem;
    @FXML
    private MenuItem selectedTime5_7MnItem;
    @FXML
    private MenuItem selectedTime7_9MnItem;
    @FXML
    private MenuItem selectedTime9_11MnItem;
    @FXML
    private Button nextBtn;
    @FXML
    private ImageView logo;
    @FXML
    private MenuButton selectServiceTypeMnuBtn; 
    @FXML
    private MenuItem instantDeliveryMnuItem;
    @FXML
    private Button backBtn; 
    @FXML
    private Label detailHeaderLbl;
    @FXML
    private Label deliveryTypeLbl;
    @FXML
    private Label whenLbl;
    @FXML
    private Label willContactLbl;   
    @FXML
    private VBox detailsVBox;
    @FXML
    private MenuItem scheduledDeliveryMnuItem;

    /**
     * Initializes the controller class.
     * @param _url
     * @param _rb
     */
    @Override
    public void initialize(URL _url, ResourceBundle _rb) {
        //Variables to hold id for switch statement to set delivery window    
        scheduleDeliveryDatePicker.setDisable(true);
        selectServiceTypeMnuBtn.setDisable(false);
        selectTimeMnBtn.setDisable(true);        
        nextBtn.setDisable(true);
        detailsVBox.setVisible(false);     
        
    }

    @FXML
    private void setDate(ActionEvent _event) {
        DatePicker source = (DatePicker) _event.getSource();
        date = source.getValue().toString();        
        detailsVBox.setVisible(false);       
        whenLbl.setText("Delivery Window: ");
        deliveryTypeLbl.setText("Delivery Type: " + scheduledDeliveryMnuItem.getText());              
        whenLbl.setText(whenLbl.getText() + date);        
        detailsVBox.setVisible(true);       
    }

    @FXML
    private void setWindow(ActionEvent _event) { 
        MenuItem source = (MenuItem) _event.getSource();
        selectTimeMnBtn.setText(source.getText());     
        detailsVBox.setVisible(false);
        whenLbl.setText("Delivery Window: ");            
        deliveryTypeLbl.setText("Delivery Type: " + " " + instantDeliveryMnuItem.getText()+" = $" + String.format("%.2f",instantCost));
        
        if (source.getId().equals(selectedTime10_12MnItem.getId())) {                  
            whenLbl.setText(whenLbl.getText() + "today, between " + source.getText());              
        } else if (source.getId().equals(selectedTime1_3MnItem.getId())) {          
            whenLbl.setText(whenLbl.getText()+ "today, between " + source.getText());           
        } else if (source.getId().equals(selectedTime3_5MnItem.getId())) {                   
            whenLbl.setText(whenLbl.getText() + "today, between " + source.getText());
        } else if (source.getId().equals(selectedTime5_7MnItem.getId())) {             
            whenLbl.setText(whenLbl.getText() + "today, between " + source.getText());         
        } else if (source.getId().equals(selectedTime7_9MnItem.getId())) {                    
            whenLbl.setText(whenLbl.getText() + "today, between " + source.getText());         
        } else if (source.getId().equals(selectedTime9_11MnItem.getId())) {                  
            whenLbl.setText(whenLbl.getText() + "today, between " + source.getText());           
        }
        setInstDeliveryCost(instantCost);
        detailsVBox.setVisible(true);
    }

    @FXML
    private void goToNextPage(ActionEvent _event) throws IOException {
        MoveScene.getInstance().Move("AdditionalNeedsPer.fxml", nextBtn);
    }

    @FXML
    private void setType(ActionEvent _event) {
        MenuItem source = (MenuItem) _event.getSource();
        detailsVBox.setVisible(false);
        scheduleDeliveryDatePicker.setDisable(true);
        selectTimeMnBtn.setDisable(true);
        nextBtn.setDisable(true);        
        
        if (source.getId().equals(instantDeliveryMnuItem.getId())) {
            selectTimeMnBtn.setDisable(false);           
            selectServiceTypeMnuBtn.setText(instantDeliveryMnuItem.getText());
        } else if (source.getId().equals(scheduledDeliveryMnuItem.getId())) {
            scheduleDeliveryDatePicker.setDisable(false);            
            selectServiceTypeMnuBtn.setText(scheduledDeliveryMnuItem.getText());
        }
        nextBtn.setDisable(false);
    }

    @FXML
    private void moveToPrvPage(ActionEvent _event) throws IOException {
        MoveScene.getInstance().Move("LoginView.fxml", backBtn);
    }
}
