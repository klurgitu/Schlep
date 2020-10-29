package Controllers;

import Models.MoveScene;
import java.io.IOException;
import static java.lang.String.format;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author josia
 */
public class BidPageController implements Initializable {

    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    private static final double costPerMile = .55;
    private static final double rateOfSpeed = 65;
    private static final String Hr = " Hr";

//Variables to hold data for imulation of gps API
    private String driver1 = "Carl1";
    private String driver2 = "Carl2";
    private String driver3 = "Carl3";
    private String driver4 = "Carl4";
    private String driver5 = "Carl5";
    private String driver6 = "Carl6";
    private String rating1 = "3:5";
    private String rating2 = "1:5";
    private String rating3 = "2:5";
    private String rating4 = "5:5";
    private String rating5 = "4:5";
    private String rating6 = "2:5";
    private double distance1 = 8.78;
    private double distance2 = 6.5;
    private double distance3 = 8.9;
    private double distance4 = 10.9;
    private double distance5 = 11.5;
    private double distance6 = 14.5;
    private double time1 = (distance1 / rateOfSpeed);
    private double time2 = distance2 / rateOfSpeed;
    private double time3 = distance3 / rateOfSpeed;
    private double time4 = distance4 / rateOfSpeed;
    private double time5 = distance5 / rateOfSpeed;
    private double time6 = distance6 / rateOfSpeed;
    private double price1 = costPerMile * distance1;
    private double price2 = costPerMile * distance2;
    private double price3 = costPerMile * distance3;
    private double price4 = costPerMile * distance4;
    private double price5 = costPerMile * distance5;
    private double price6 = costPerMile * distance6;

    @FXML
    private ImageView logo;
    @FXML
    private Label driver1Lbl;
    @FXML
    private TextField hourEst1TxFld;
    @FXML
    private Button schlepItBtn1;
    @FXML
    private Label rating1Lbl;
    @FXML
    private TextField price1TxtFld;
    @FXML
    private Label BidLbl;
    @FXML
    private Label driver2Lbl;
    @FXML
    private TextField hourEst2TxFld;
    @FXML
    private Button schlepItBtn2;
    @FXML
    private Label rating2Lbl;
    @FXML
    private TextField price2TxtFld;
    @FXML
    private Label driver3Lbl;
    @FXML
    private TextField hourEst3TxFld;
    @FXML
    private Button schlepItBtn3;
    @FXML
    private Label rating3Lbl;
    @FXML
    private TextField price3TxtFld;
    @FXML
    private Label driver4Lbl;
    @FXML
    private TextField hourEst4TxFld;
    @FXML
    private Button schlepItBtn4;
    @FXML
    private Label rating4Lbl;
    @FXML
    private TextField price4TxtFld;
    @FXML
    private Label driver5Lbl;
    @FXML
    private TextField hourEst5TxFld;
    @FXML
    private Button schlepItBtn5;
    @FXML
    private Label rating5Lbl;
    @FXML
    private TextField price5TxtFld;
    @FXML
    private Label driver6Lbl;
    @FXML
    private TextField hourEst6TxFld;
    @FXML
    private Button schlepItBtn6;
    @FXML
    private Label rating6Lbl;
    @FXML
    private TextField price6TxtFld;
    @FXML
    private Button backBtn;
    @FXML
    private Button nextBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODOformat("%.2f",Double.toString(driver1
        driver1Lbl.setText(driver1);
        driver2Lbl.setText(driver2);
        driver3Lbl.setText(driver3);
        driver4Lbl.setText(driver4);
        driver5Lbl.setText(driver5);
        driver6Lbl.setText(driver6);
        hourEst1TxFld.setText(format("%.2f", time1) + Hr);
        hourEst2TxFld.setText(format("%.2f", time2) + Hr);
        hourEst3TxFld.setText(format("%.2f", time3) + Hr);
        hourEst4TxFld.setText(format("%.2f", time4) + Hr);
        hourEst5TxFld.setText(format("%.2f", time5) + Hr);
        hourEst6TxFld.setText(format("%.2f", time6) + Hr);
        price1TxtFld.setText("$" + format("%.2f", price1));
        price2TxtFld.setText("$" + format("%.2f", price2));
        price3TxtFld.setText("$" + format("%.2f", price3));
        price4TxtFld.setText("$" + format("%.2f", price4));
        price5TxtFld.setText("$" + format("%.2f", price5));
        price6TxtFld.setText("$" + format("%.2f", price6));
        rating1Lbl.setText(rating1);
        rating2Lbl.setText(rating2);
        rating3Lbl.setText(rating3);
        rating4Lbl.setText(rating4);
        rating5Lbl.setText(rating5);
        rating6Lbl.setText(rating6);

    }

    @FXML
    private void acceptBid(ActionEvent event) {

    }

    @FXML

    private void moveToPrvPage(ActionEvent _event) throws IOException {
        goToPrvPage.Move("PickupAddress.fxml", backBtn);
    }

    @FXML
    private void moveToNextPage(ActionEvent _event) throws IOException {
        //Needs to be a different fxml, not sure where we go from here
        goToNextPage.Move("GPSView.fxml", nextBtn);

    }

}
