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
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 * Controller for 'AdditionalNeedsPer.fxml'. This is where a customer selects items they
 * might need for offloading items that are delivered. this includes assistance
 * from the driver, which is an additional fee. 
 *
 * @Author Josiah Stadler Last updated 10/23/20, 11/13/20, 11/17/20, 11/18/20
 * @author Katelynn Urgitus Last Updated 11/05/2020
 */
public class AdditionalNeedsPerController extends PassCost implements Initializable {

    //Gets the one hour wage for driver assistance with offloading from the PassCost model.
    public double wage = getWAGE();
   
    //public boolean assistRequest;

    private final double halfHrWage = wage * .5;
    private final double twoHrWage = wage * 2;
    private final double threeHrWage = wage * 3;
    public static double assistTime;
    private double subtotal;
    private String time;
    private String itemsMsg;
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
    private Label costLbl;

    @FXML
    private VBox outputVBox;

    @FXML
    private Label needsLbl;

    @FXML
    private Label costOutLbl;

    @FXML
    private Label needsOutLbl;

    @Override
    public void initialize(URL _url, ResourceBundle _rb) {
        needsLbl.setVisible(false);
        needsOutLbl.setVisible(false);
        costLbl.setVisible(false);
        costOutLbl.setVisible(false);
        confirmedLbl.setVisible(false);
        AssistTimeAmountMnBtn.setVisible(false);
        needsOutLbl.setText("");
        costOutLbl.setText("");
        processBtn.setDisable(true);
        nextBtn.setDisable(true);
        itemsMsg = "";
        costMsg = "";
        assistTime = 0;
        
    }

    @FXML
    private void checkItem(ActionEvent _event) {
        CheckMenuItem source = (CheckMenuItem) _event.getSource();
        String id = source.getId();
        if (id.equals(assistCheckMnItem.getId())) {
            AssistTimeAmountMnBtn.setVisible(true);
        }
        processBtn.setDisable(false);
    }

    void CheckDriverAssist(ActionEvent _event) {
        AssistTimeAmountMnBtn.setVisible(true);
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
                assistTime = .50;
                time1HrRb.setSelected(false);
                time2HrRb.setSelected(false);
                time3HrRb.setSelected(false);
                break;
            case "time1Hr":
                subtotal = wage;
                time = time1HrRb.getText();
                assistTime = 1;
                time30Rb.setSelected(false);
                time2HrRb.setSelected(false);
                time3HrRb.setSelected(false);
                break;
            case "time2Hr":
                subtotal = twoHrWage;
                time = time2HrRb.getText();
                assistTime = 2;
                time1HrRb.setSelected(false);
                time30Rb.setSelected(false);
                time3HrRb.setSelected(false);
                break;
            case "time3Hr":
                subtotal = threeHrWage;
                time = time3HrRb.getText();
                assistTime = 3;
                time1HrRb.setSelected(false);
                time2HrRb.setSelected(false);
                time30Rb.setSelected(false);
                break;
            default:
                subtotal = 0;
                assistTime = 0;
                time = "";
        }
        setAssistCost(subtotal);
        processBtn.setDisable(false);
    }

    @FXML
    void showCost(ActionEvent _event) {
        itemsMsg = "";
        costMsg = "";
        needsLbl.setVisible(false);
        needsOutLbl.setVisible(false);
        if (dollyCheckMnBtn.isSelected()) {
            itemsMsg += dollyCheckMnBtn.getText() + " ";
            needsLbl.setVisible(true);
        }
        if (rampCheckMnItem.isSelected()) {
            itemsMsg += rampCheckMnItem.getText() + " ";
            needsLbl.setVisible(true);
        }
        if (handTruckCheckMnBtn.isSelected()) {
            itemsMsg += handTruckCheckMnBtn.getText() + " ";
            needsLbl.setVisible(true);
        }
        if (assistCheckMnItem.isSelected()) {
            costOutLbl.setText("$" + String.format("%.2f", getAssistCost()));
            costLbl.setVisible(true);
            costOutLbl.setVisible(true);
            AssistTimeAmountMnBtn.setVisible(true);
        } else if (!assistCheckMnItem.isSelected()) {
            costMsg = "";
            costLbl.setVisible(false);
            costOutLbl.setVisible(false);
            AssistTimeAmountMnBtn.setVisible(false);
        }
        needsOutLbl.setText(itemsMsg);
        confirmedLbl.setVisible(true);
        needsOutLbl.setVisible(true);
        nextBtn.setDisable(false);
    }
}
