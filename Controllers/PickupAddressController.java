package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author josia
 */
public class PickupAddressController implements Initializable {

    @FXML
    private ImageView logo;
    @FXML
    private TextField specialInstructionsTxFld;
    @FXML
    private Button NxtBtn;
    @FXML
    private Button backBtn;
    @FXML
    private Label processingReqLbl;
    @FXML
    private Label selectCityLbl;
    @FXML
    private Label selectStateLbl;
    @FXML
    private MenuButton selectVendorMnBx;
    @FXML
    private MenuItem prvtSellerMnItem;
    @FXML
    private MenuItem commercialVendorMnItem;
    @FXML
    private AnchorPane anchor;
    @FXML
    private TextField vendorNameTxFld;
    @FXML
    private TextField streetNameTxFld;
    @FXML
    private TextField zipCodeTxFld;
    @FXML
    private TextField orderConfirmationTxFld;
    @FXML
    private Label orderProcessedMsgLbl;
    @FXML
    private ChoiceBox<?> selectCityChoiceBx;
    @FXML
    private ChoiceBox<?> selectStateChoiceBX;
    @FXML
    private Label selectVendorLbL;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void enterSpecialInstructions(ActionEvent event) {
    }

    @FXML
    private void enterVendor(ActionEvent event) {
    }

    @FXML
    private void enterStreetAddress(ActionEvent event) {
    }

    @FXML
    private void enterZipCode(ActionEvent event) {
    }

    @FXML
    private void goToNxtPage(ActionEvent event) {
    }

    @FXML
    private void goToPrvPage(ActionEvent event) {
    }

    @FXML
    private void enterOrderNumber(ActionEvent event) {
    }

    @FXML
    private void vendorSelected(ActionEvent event) {
    }
    
}
