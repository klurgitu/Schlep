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
 * FXML Controller class Handles launched from hitting the next button on
 * previous page This is a place holder video used to simulate GPS tracking of
 * driver progress after picking up the item.
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
    private MediaView gpsMedia;
    private MediaPlayer mediaPlayer;
    private static final String MEDIA_URL = "GPS_Stub.mp4";

    //private Media video = new Media("/Documents/GPS_Stub.mp4");
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println(url.toString());
        System.out.println(this.getClass().getResource(MEDIA_URL).toExternalForm());
        mediaPlayer = new MediaPlayer(new Media(this.getClass().getResource(MEDIA_URL).toExternalForm()));
        mediaPlayer.setAutoPlay(true);
        gpsMedia.setMediaPlayer(mediaPlayer);

        /**
         * *
         * URL mediaUrl = getClass().getResource("GPS_stub.mp4"); String
         * mediaStringUrl = mediaUrl.toExternalForm(); Media media = new Media
         * (mediaStringUrl); final MediaPlayer player = new MediaPlayer(media);
         * gpsMedia = new MediaView(player); //MediaPlayer player = new
         * MediaPlayer(video); player.setAutoPlay(true); player.play();
         * //MediaView tracking = new MediaView(player);
         *
         */
    }

}
