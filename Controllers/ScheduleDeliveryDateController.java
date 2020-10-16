
package Controllers;

import Models.MoveScene;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Josiah Stadler
 * last updated: 10/16/20
 */
public class ScheduleDeliveryDateController implements Initializable {
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    
    private String outputDate;

    @FXML
    private ImageView logo;
    @FXML
    private Label scheduleDeliveryLbl;
    @FXML
    private DatePicker scheduleDeliveryDatePicker;
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;
    @FXML
    private Label outputLbl;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getDate(ActionEvent event) { 
        //Change date format??
        outputLbl.setText(outputLbl.getText()+ scheduleDeliveryDatePicker.getValue());      
        outputLbl.setVisible(true);
        nextBtn.setDisable(false);
        
        
        
       
        
    }

    @FXML
    private void goToNxtPage(ActionEvent event) throws IOException {
        goToNextPage.Move("PickupAddress.fxml", nextBtn);
    }

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        goToPrvPage.Move("SelectDeliveryType.fxml", backBtn);
    }
    
}
