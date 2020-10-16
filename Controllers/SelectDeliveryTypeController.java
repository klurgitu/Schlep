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
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author josiah Stadler
 * last updated: 10/16/20
 * controller for SelectDeliveryType.fxml view
 */
public class SelectDeliveryTypeController implements Initializable {
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
    private String nextPage;
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private ImageView logo;
    @FXML
    private MenuButton selectServiceTypeMnuBtn;
    @FXML
    private MenuItem scheduledDelveryMnuItem;
    @FXML
    private MenuItem instantDeliveryMnuItem;
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*
        * Stage window = new Stage();
        window.setTitle("Delivery Type");
        Scene scene;
        Parent root = anchorPane;
        scene = new Scene(root);
        window.setScene(scene);
        nextBtn.setDisable(true);
        */
       
        
    }    

    @FXML
    private void setServiceType(Event event) throws IOException {
        MenuItem source = (MenuItem) event.getSource();
        String id =source.getId();
        if(id.equals(scheduledDelveryMnuItem.getId())){
            selectServiceTypeMnuBtn.setText(source.getText());
            nextPage = "ScheduleDeliveryDate.fxml";
           
           
        }
        else{
            selectServiceTypeMnuBtn.setText(instantDeliveryMnuItem.getText());
            nextPage = "SelectDeliveryTime.fxml";
            
        }
        nextBtn.setDisable(false);
       
    }

    
    @FXML
    private void goToNextPage(ActionEvent event) throws IOException {
        goToNextPage.Move(nextPage,nextBtn);
       
    }
    
    

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        goToPrvPage.Move("LoginView.fxml",backBtn);
    }
    
}
