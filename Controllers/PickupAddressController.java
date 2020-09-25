package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private TextField vendorNameTxBx;
    @FXML
    private TextField streetNaameTxBx;
    @FXML
    private TextField zipcodeTxBx;
    @FXML
    private Button NxtBtn;
    @FXML
    private Button backBtn;
    @FXML
    private TextField orderConfirmationtxBX;
    @FXML
    private Label processingReqLbl;
    @FXML
    private Label orderProcessedMsg;
    @FXML
    private Label selectCityLbl;
    @FXML
    private Label selectStateLbl;
    @FXML
    private Label selectVendorLBL;
    @FXML
    private MenuButton selectVendorMnBx;
    @FXML
    private MenuItem prvtSellerMnItem;
    @FXML
    private MenuItem commercialVendorMnItem;
    @FXML
    private AnchorPane anchor;

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
