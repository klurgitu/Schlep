package Controllers;

import Models.MoveScene;
import Models.PassCost;
import java.io.IOException;
import static java.lang.String.format;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class This is the controller for the BidPage view. This is
 * where the GPS data and other associated information is sent to the user
 *
 * @author Josiah Stadler Last updated 10/29/20, 11/13/20
 * @author Katelynn Urgitus Last Updated 11/05/2020
 */

public class BidPageController extends PassCost implements Initializable {
    //Variables to hold data for imulation of gps API
    private static final String Hr = " Hr";    
    private int numOfBids = 6;  

    @FXML
    private ImageView logo;
    
    @FXML
    private Label driver1Lbl;

    @FXML
    private Button schlepItBtn1;

    @FXML
    private Label rating1Lbl;

    @FXML
    private Label BidLbl;
    @FXML
    private Label driver2Lbl;

    @FXML
    private Button schlepItBtn2;
    @FXML
    private Label rating2Lbl;

    @FXML
    private Label driver3Lbl;

    @FXML
    private Button schlepItBtn3;
    @FXML
    private Label rating3Lbl;

    @FXML
    private Label driver4Lbl;

    @FXML
    private Button schlepItBtn4;
    @FXML
    private Label rating4Lbl;

    @FXML
    private Label driver5Lbl;

    @FXML
    private Button schlepItBtn5;
    @FXML
    private Label rating5Lbl;

    @FXML
    private Label driver6Lbl;

    @FXML
    private Button schlepItBtn6;
    @FXML
    private Label rating6Lbl;

    @FXML
    private Button backBtn;
    @FXML
    private Button nextBtn;
    @FXML
    private Label costLbl1;
    @FXML
    private Label costLbl2;
    @FXML
    private Label costLbl3;
    @FXML
    private Label costLbl4;
    @FXML
    private Label costLbl5;
    @FXML
    private Label costLbl6;
    @FXML
    private Label etaLbl1;
    @FXML
    private Label etaLbl2;
    @FXML
    private Label etaLbl3;
    @FXML
    private Label etaLbl4;
    @FXML
    private Label etaLbl5;
    @FXML
    private Label etaLbl6;
    public Button[] btnArray;

    /**
     * Initializes the controller class.
     * @param _url
     * @param _rb
     */
    @Override
    public void initialize(URL _url, ResourceBundle _rb) {

        initializeButtonArray();
        //Creates bids with all need info
        PassCost bidOne = new PassCost("Rick", "3:5", 20.52, 65, 25.00,2);
        PassCost bidTwo = new PassCost("John", "4:5", 120.52, 75, 0,0);
        PassCost bidThree = new PassCost("Shawn", "2:5", 40.52, 25, 25.00,3);
        PassCost bidFour = new PassCost("Jenny", "5:5", 220.52, 85, 25.00,1);
        PassCost bidFive = new PassCost("Kat", "10:5", 85.50, 65, 25.00,3);
        PassCost bidSix = new PassCost("Carlie", "3:5", 2.52, 35, 0,0);      
        driver1Lbl.setText(bidOne.getDriverName());
        driver2Lbl.setText(bidTwo.getDriverName());
        driver3Lbl.setText(bidThree.getDriverName());
        driver4Lbl.setText(bidFour.getDriverName());
        driver5Lbl.setText(bidFive.getDriverName());
        driver6Lbl.setText(bidSix.getDriverName());
        etaLbl1.setText(format("%.2f", bidOne.getEta()) + Hr);
        etaLbl2.setText(format("%.2f", bidTwo.getEta()) + Hr);
        etaLbl3.setText(format("%.2f", bidThree.getEta()) + Hr);
        etaLbl4.setText(format("%.2f", bidFour.getEta()) + Hr);
        etaLbl5.setText(format("%.2f", bidFive.getEta()) + Hr);
        etaLbl6.setText(format("%.2f", bidSix.getEta()) + Hr);        
        costLbl1.setText("$" + format("%.2f", bidOne.getTotal()));
        costLbl2.setText("$" + format("%.2f", bidTwo.getTotal()));
        costLbl3.setText("$" + format("%.2f", bidThree.getTotal()));
        costLbl4.setText("$" + format("%.2f", bidFour.getTotal()));
        costLbl5.setText("$" + format("%.2f", bidFive.getTotal()));
        costLbl6.setText("$" + format("%.2f", bidSix.getTotal()));        
        rating1Lbl.setText(bidOne.getRating());
        rating2Lbl.setText(bidTwo.getRating());
        rating3Lbl.setText(bidThree.getRating());
        rating4Lbl.setText(bidFour.getRating());
        rating5Lbl.setText(bidFive.getRating());
        rating6Lbl.setText(bidSix.getRating());

    }

    public void initializeButtonArray() {
        btnArray = new Button[numOfBids];
        for (int i = 0; i < numOfBids; i++) {

        }
    }

    @FXML
    private void acceptBid(ActionEvent _event) {
        Button source = (Button) _event.getSource();
        //if !source visible = false
        nextBtn.setDisable(false);

    }

    @FXML
    private void moveToPrvPage(ActionEvent _event) throws IOException {
        MoveScene.getInstance().Move("PickupAddress.fxml", backBtn);
    }

    @FXML
    private void moveToNextPage(ActionEvent _event) throws IOException {
        MoveScene.getInstance().Move("GPSView.fxml", nextBtn);
    }
}
