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
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;

/**
 * FXML Controller class
 *
 * @author Josiah Stadler
 * Last updated: 11/6/20,11/17/20
 */
public class GPSViewController implements Initializable {

    @FXML
    private AnchorPane anchor;
    @FXML
    private Label label;  
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;
    @FXML
    private WebView gpsWebview;

    /**
     * Initializes the controller class.
     * @param _url
     * @param _rb
     */
    @Override
    public void initialize(URL _url, ResourceBundle _rb) {
       
        gpsWebview.getEngine().load("https://www.youtube.com/embed/Eb4wdnXb7cU?autoplay=1&rel=0");
       
    }    

    @FXML
    private void moveToNextPage(ActionEvent _event) throws IOException {
         MoveScene.getInstance().Move("Timer.fxml", backBtn);
    }

    @FXML
    private void moveToPrvPage(ActionEvent _event) throws IOException {
         MoveScene.getInstance().Move("Billing.fxml", backBtn);
    }
    
}
