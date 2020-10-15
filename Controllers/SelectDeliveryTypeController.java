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
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author josia
 */
public class SelectDeliveryTypeController implements Initializable {
    private static final MoveScene goToNextPage = new MoveScene();
    private static final MoveScene goToPrvPage = new MoveScene();
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
        // TODO
    }    

    @FXML
    private void setServiceType(Event event) {
        MenuItem source = (MenuItem) event.getSource();
        String id =source.getId();
        if(id.equals(scheduledDelveryMnuItem.getId())){
            selectServiceTypeMnuBtn.setText(source.getText());
        }
        else{
            selectServiceTypeMnuBtn.setText(instantDeliveryMnuItem.getText());
            
        }
       
    }

    @FXML
    private void goToNextPage(ActionEvent event) throws IOException {
        if(selectServiceTypeMnuBtn.getText().equals(instantDeliveryMnuItem.getText())){
            goToNextPage.Move("SelectDeliveryTime.fxml",nextBtn);
        }
        else if(selectServiceTypeMnuBtn.getText().equals(scheduledDelveryMnuItem.getText())){
            goToNextPage.Move("SelectDeliveryDate.fxml",nextBtn);
        }
    }

    @FXML
    private void goToPrvPage(ActionEvent event) throws IOException {
        goToPrvPage.Move("LoginView.fxml",backBtn);
    }
    
}
