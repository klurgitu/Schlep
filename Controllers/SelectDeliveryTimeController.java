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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Josiah Stadler
 * Last updated: 10/16/20
 * Controls SelectDeliveryTime.fxml. This will be used to select a time for
 * an instant delivery
 */
public class SelectDeliveryTimeController implements Initializable {
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    private String timeWindow = "You have selected the following delivery window: ";
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private VBox verticalBox;
    @FXML
    private ImageView logo;
    @FXML
    private MenuButton selectTimeMnBtn;
    @FXML
    private MenuItem selectedTime10_12MnItem;
   
    @FXML
    private MenuItem selectedTime1_3MnItem;
   
    @FXML
    private MenuItem selectedTime3_5MnItem;
    @FXML
    private MenuItem SelectedTime5_7MnItem;
    @FXML
    private MenuItem selectedTime7_9MnItem;
    @FXML
    private MenuItem selectedTime9_11MnItem;
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;
    @FXML
    private Label outputLbl;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*
        * Stage window = new Stage();
        Scene scene;
        Parent root = anchorPane;
        scene = new Scene(root);
        window.setScene(scene);
        timeWindow = "You have selected the following delivery window: ";        
        selectTimeMnBtn.setText(selectTimeMnBtn.getText());
         */
       
        
    }    

    @FXML
    private void setTime(ActionEvent event) {
        MenuItem source = (MenuItem) event.getSource();
        
        switch(source.getId()){
            case "time10_12":
                selectTimeMnBtn.setText(source.getText());
                timeWindow += "10:00 a.m. - 12:00 p.m.";
                break;
            case "time1_3":
                selectTimeMnBtn.setText(source.getText());
                timeWindow += "1:00 p.m. - 3:00 p.m.";
                break;
            case "time3_5":
                selectTimeMnBtn.setText(source.getText());
                timeWindow += "3:00 p.m. - 5:00 p.m.";
                break;
            case "time5_7":
                selectTimeMnBtn.setText(source.getText());
                timeWindow += "5:00 p.m. - 7:00 p.m.";
                break;  
            case "time7_9":
                selectTimeMnBtn.setText(source.getText());
                timeWindow += "7:00 p.m. - 9:00 p.m.";
                break; 
            case "time9_11":
                selectTimeMnBtn.setText(source.getText());
                timeWindow += "9:00 p.m. - 11:00 p.m.";
                break; 
            default:
                selectTimeMnBtn.setText(selectTimeMnBtn.getText());
                timeWindow = "";
                
        }
    }

    @FXML
    private void moveToNextPage(ActionEvent event) throws IOException {
        goToNextPage.Move("PickupAddress.fxml", nextBtn);
    }

    @FXML
    private void moveToPrvPage(ActionEvent event) throws IOException {
        goToPrvPage.Move("SelectDeliveryType.fxml",backBtn);
    }
    
}
