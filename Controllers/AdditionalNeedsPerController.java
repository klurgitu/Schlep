
package Controllers;

import Models.MoveScene;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class AdditionalNeedsPerController {
    
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    
    private double subtotal;
    private final double driverWage = 15.00;
    private final double halfHrWage = driverWage*.5;
    private final double twoHourWage = driverWage * 2;
    private final double threeHourWage = driverWage * 3;
    private String itemsSelectedMsg = "";
    private String timeMsg = "";
    private boolean assistanceIsChecked = false;

    @FXML
    private AnchorPane anchor;

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
    private Label confirmedLbl ;

    @FXML
    private Button nextBtn;

    @FXML
    private Button backBtn;
    
    @FXML
    private Button processBtn;
    @FXML
    private Label NeedsLbl;

    @FXML
    private Label costLbl;
    
      @FXML
    void showCost(ActionEvent event) {
        confirmedLbl.setVisible(true);
        NeedsLbl.setText(itemsSelectedMsg);
        costLbl.setText(timeMsg);
        NeedsLbl.setVisible(true);
        costLbl.setVisible(true);

    }


    @FXML
    void CheckDriverAssist(ActionEvent event) {
        assistanceIsChecked = true;
        AssistTimeAmountMnBtn.setVisible(true);

    }

    @FXML
    void assistTime1Hr(ActionEvent event) {
        subtotal = 0;
        subtotal += driverWage;
        timeMsg += subtotal;
        processBtn.setDisable(false);

    }

    @FXML
    void assistTime2Hr(ActionEvent event) {
        subtotal = 0;
        subtotal += twoHourWage;
        timeMsg += subtotal;
        processBtn.setDisable(false);

    }

    @FXML
    void assistTime30M(ActionEvent event) {
        subtotal = 0;
        subtotal += halfHrWage;
        timeMsg += subtotal;
        processBtn.setDisable(false);
        

    }

    @FXML
    void assistTime3Hr(ActionEvent event) {
        subtotal = 0;
        subtotal += threeHourWage;
        timeMsg += subtotal;
        processBtn.setDisable(false);

    }

    @FXML
    void checkDolly(ActionEvent event) {
        itemsSelectedMsg += "Dolly ";

    }

    @FXML
    void checkHandTruck(ActionEvent event) {
        itemsSelectedMsg += "HandTruck ";

    }

    @FXML
    void checkRamp(ActionEvent event) {
        itemsSelectedMsg += "Ramp ";

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
    void selectTime(ActionEvent event) {
        

    }

}
