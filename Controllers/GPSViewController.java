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

    private Media video = new Media("C:/Users/josia/OneDriv/Documents/NetBeansProjects/Schlep/src/Documents/GPS_Stub.mp4");

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        /**
         * MediaPlayer player = new MediaPlayer(video);
         * player.setAutoPlay(true); MediaView tracking = new MediaView(player);
         */
    }

}
