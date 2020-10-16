package Controllers;


import Models.MoveScene;
import java.io.IOException;
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
 * @author Josiah Stadler
 * last updated 10/16/20
 */
public class PickupAddressController  implements Initializable  {
    
    
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    private String instructionStr;
    private String streetAddress;
    private String orderNumber;
    private String vendorName;
    private String zip;
    private String orderInfo; 
    private String selectedCity;
    private String selectedState;
    private String selectedCountry;
    

    @FXML
    private ImageView logo;
    @FXML
    private TextField specialInstructionsTxFld;
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;
    
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
    private ChoiceBox<String> selectCityChoiceBx;
    @FXML
    private ChoiceBox<String> selectStateChoiceBX;
    @FXML
    private Label selectVendorLbL;
    @FXML
    private Button confirmationBtn;
     @FXML
    private Label detailLbl;

  
  


    @FXML
    void confirmOrder(ActionEvent event) {
        instructionStr = specialInstructionsTxFld.getText();
        vendorName = vendorNameTxFld.getText();
        streetAddress = streetNameTxFld.getText();
        zip = zipCodeTxFld.getText();
        orderNumber = orderConfirmationTxFld.getText();
        orderInfo = "Vendor Name: " + vendorName + "\n" + "Address: " +
                streetAddress + "\n" + "ZipCode: " + zip + "\n" + "Order Number from seller: " +
                orderNumber + "\n" + "instructions: " + instructionStr;
        detailLbl.setText(orderInfo);
        orderProcessedMsgLbl.setVisible(true);
        detailLbl.setVisible(true);
        nextBtn.setDisable(false);
        
        

    }


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        /*
        *vendorName = vendorNameTxFld.getText();
        streetAddress = streetNameTxFld.getText();
        zip = zipCodeTxFld.getText();
        orderNumber = orderConfirmationTxFld.getText();
        orderInfo = "Vendor Name: " + vendorName + "\n" + "Address: " +
                streetAddress + "\n" + "ZipCode: " + zip + "\n" + "Order Number from seller: " +
                orderNumber + "\n" ;
        */
        
     
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
    private void goToNxtPage(ActionEvent event) throws IOException {
        goToNextPage.Move("BidPage.fxml", nextBtn);
    }

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        goToPrvPage.Move("AdditionalNeedsPer.fxml", backBtn);
    }

    @FXML
    private void enterOrderNumber(ActionEvent event) {
        
       
    }

    @FXML
    private void vendorSelected(ActionEvent event) {
        MenuItem source = (MenuItem) event.getSource();
        String vendorStr = source.getText();
        selectVendorMnBx.setText(vendorStr);
        
        
    }
    
}
