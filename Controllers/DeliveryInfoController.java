/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.MoveScene;
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

/**
 * FXML Controller class
 *
 * @author Josiah Stadler
 * updated: 10/16/20
 */
public class DeliveryInfoController implements Initializable {
    //MoeScenes to move to next or previouse page
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    
    
    //String to hold text for start of confirmation msg
    private String timeWindow = "You have selected the following delivery window: ";
    private String date;
    
    private String time_1; 
    private String time_2;
    private String time_3;
    private String time_4;
    private String time_5;
    private String time_6; 
    
    //Variables to hold time window for output
    private String window1 ="10:00 a.m. - 12:00 p.m.";
    private String window2 = "1:00 p.m. - 3:00 p.m.";
    private String window3 = "3:00 p.m. - 5:00 p.m.";
    private String window4 = "5:00 p.m. - 7:00 p.m.";
    private String window5 = "7:00 p.m. - 9:00 p.m.";
    private String window6 = "9:00 p.m. - 11:00 p.m.";

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
    private MenuItem scheduledDelveryMnuItem;
    @FXML
    private MenuItem instantDeliveryMnuItem;
    @FXML
    private Button backBtn;
    @FXML
    private Label outputLbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       //Variables to hold id for switch statement to set delivery window
       time_1 = selectedTime10_12MnItem.getId();
       time_2 = selectedTime1_3MnItem.getId();
       time_3 = selectedTime3_5MnItem.getId();
       time_4 = selectedTime5_7MnItem.getId();
       time_5 = selectedTime7_9MnItem.getId();
       time_6 = selectedTime9_11MnItem.getId();  
       scheduleDeliveryDatePicker.setDisable(true);
       selectTimeMnBtn.setDisable(true);  
       outputLbl.setVisible(false);
       nextBtn.setDisable(true);
    }    

    @FXML
    private void setDate(ActionEvent _event) {
        //date = scheduleDeliveryDatePicker.get().toString();
       
    }

    @FXML
    private void setWindow(ActionEvent _event) {
         MenuItem source = (MenuItem) _event.getSource();
         
        if(source.getId().equals(time_1)){
            selectTimeMnBtn.setText(source.getText());
            timeWindow += "\n" + window1;            
        }
        else if(source.getId().equals(time_2)){
            selectTimeMnBtn.setText(source.getText());
            timeWindow += "\n" + window2;            
        }
         else if(source.getId().equals(time_3)){
            selectTimeMnBtn.setText(source.getText());
            timeWindow += "\n" + window3;            
        }
         else if(source.getId().equals(time_4)){
            selectTimeMnBtn.setText(source.getText());
            timeWindow = "\n" + window4;            
        }
        else if(source.getId().equals(time_5)){
            selectTimeMnBtn.setText(source.getText());
            timeWindow += "\n" + window5;            
        }
         else if(source.getId().equals(time_6)){
            selectTimeMnBtn.setText(source.getText());
            timeWindow += "\n" + window6; 
        }
        outputLbl.setText( timeWindow);
        outputLbl.setVisible(true);
    }

    @FXML
    private void goToNextPage(ActionEvent _event) throws IOException {
         goToNextPage.Move("AdditionalNeedsPer.fxml", nextBtn);
    }


    @FXML
    private void setType(ActionEvent _event) {
        outputLbl.setVisible(false);
        MenuItem source = (MenuItem) _event.getSource();
        if(source.getId().equals(instantDeliveryMnuItem.getId())){
            selectTimeMnBtn.setDisable(false);
            scheduleDeliveryDatePicker.setDisable(true);
            selectServiceTypeMnuBtn.setText(instantDeliveryMnuItem.getText());
        }
        else if (source.getId().equals(scheduledDelveryMnuItem.getId())){
            scheduleDeliveryDatePicker.setDisable(false);
            selectTimeMnBtn.setDisable(true);
            selectServiceTypeMnuBtn.setText(scheduledDelveryMnuItem.getText());
        }
        nextBtn.setDisable(false);
    }


    @FXML
    private void moveToPrvPage(ActionEvent _event) throws IOException {
        goToPrvPage.Move("LoginView.fxml", backBtn);
    }
    
}
