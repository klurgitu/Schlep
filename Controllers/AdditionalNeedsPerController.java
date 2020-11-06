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

/**
 * Controller for 'AdditionalNeedsPer.fxml' Controller Class
 *
 * @Author Josiah Stadler Last updated 10/23/20
 * @author Katelynn Urgitus Last Updated 11/05/2020
 */
public class AdditionalNeedsPerController {

    private final double wage = 15.00;
    private final double halfHrWage = wage * .5;
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
    void CheckDriverAssist(ActionEvent _event) {
        AssistTimeAmountMnBtn.setVisible(true);
        costMsg = "Your selected assistance time is: ";
    }

    @FXML
    void checkDolly(ActionEvent _event) {
        itemsMsg += dollyCheckMnBtn.getText() + "\n";
    }

    @FXML
    void checkHandTruck(ActionEvent _event) {
        itemsMsg += handTruckCheckMnBtn.getText() + "\n";
    }

    @FXML
    void checkRamp(ActionEvent _event) {
        itemsMsg += rampCheckMnItem.getText() + "\n";
    }

    @FXML
    void movePrvPage(ActionEvent _event) throws IOException {
        MoveScene.getInstance().Move("DeliveryInfo.fxml", backBtn);
    }

    @FXML
    void moveToNextPage(ActionEvent _event) throws IOException {
        MoveScene.getInstance().Move("PickupAddress.fxml", nextBtn);       
    }

    @FXML
    void selectTime(ActionEvent _event) {
        RadioMenuItem source = (RadioMenuItem) _event.getSource();
        String id = source.getId();
        AssistTimeAmountMnBtn.setText(source.getText());
        switch (id) {
            case "time30":
                subtotal = halfHrWage;
                time = time30Rb.getText();
                time1HrRb.setSelected(false);
                time2HrRb.setSelected(false);
                time3HrRb.setSelected(false);
                break;
            case "time1Hr":
                subtotal = wage;
                time = time1HrRb.getText();
                time30Rb.setSelected(false);
                time2HrRb.setSelected(false);
                time3HrRb.setSelected(false);
                break;
            case "time2Hr":
                subtotal = twoHrWage;
                time = time2HrRb.getText();
                time1HrRb.setSelected(false);
                time30Rb.setSelected(false);
                time3HrRb.setSelected(false);
                break;
            case "time3Hr":
                subtotal = threeHrWage;
                time = time3HrRb.getText();
                time1HrRb.setSelected(false);
                time2HrRb.setSelected(false);
                time30Rb.setSelected(false);
                break;
            default:
                subtotal = 0;
                time = "";
        }
    }

    @FXML
    void showCost(ActionEvent _event) {
        if (assistCheckMnItem.isSelected()) {
            costMsg += time + " of assistance.\n " + " With a cost of $ " + String.format("%.2f", subtotal) + "\n";
            costLbl.setText(costMsg);
            costLbl.setVisible(true);
        } else {
            costLbl.setVisible(false);
        }
        confirmedLbl.setVisible(true);
        NeedsLbl.setText("You have selected the following additional items to assist you: \n" + itemsMsg);
        NeedsLbl.setVisible(true);
        nextBtn.setDisable(false);
    }
}
