/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author josia
 */
public class GPSViewController implements Initializable {

    @FXML
    private AnchorPane anchor;
    @FXML
    private Label label;
    @FXML
    private MediaView gpsMedia;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL _url, ResourceBundle _rb) {
        // TODO
       /***
        * URL mediaUrl = getClass().getResource("./GPS_Stub.mp4");
        String mediaStringUrl = mediaUrl.toExternalForm();
        */
        
        Media media = new Media ("src/Documents/GPS_Stub.mp4");
        final MediaPlayer player = new MediaPlayer(media);
        //gpsMedia = new MediaView(player);
        
        //MediaPlayer player = new MediaPlayer(video);
        
        player.setAutoPlay(true);
        player.play();
         
       
    }    
    
}
