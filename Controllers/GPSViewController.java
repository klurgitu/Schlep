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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author Josiah Stadler
 * Last updated: 11/6/20
 */
public class GPSViewController implements Initializable {

    @FXML
    private AnchorPane anchor;
    @FXML
    private Label label;
    @FXML
    private MediaView gpsMediaView;
    @FXML
    private Button nextBtn;
    @FXML
    private Button backBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL _url, ResourceBundle _rb) {
        // TODO
        String videoUrl = "file:/C:/Users/josia/OneDrive/Documents/NetBeansProjects/Schlep/src/Documents/GPS_Stub.mp4";
        Media media = new Media(videoUrl);
        MediaPlayer player = new MediaPlayer(media);
        gpsMediaView.setMediaPlayer(player);
        player.setAutoPlay(true);
        player.play();       
    }    

    @FXML
    private void moveToNextPage(ActionEvent _event) {
    }

    @FXML
    private void moveToPrvPage(ActionEvent _event) throws IOException {
         MoveScene.getInstance().Move("Billing.fxml", backBtn);
    }
    
}
