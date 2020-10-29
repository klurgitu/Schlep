package Models;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import static javafx.scene.input.DataFormat.URL;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
// import static sun.net.www.http.HttpClient.New;

/**
 *
 * @author josiah Stadler
 * Last updated 10/8/20
 */
public class RunAdditionalItems extends Application {

    Stage window;
    Scene scene;

    @Override
    public void start(Stage stage) throws Exception {
        //String path = "C:/Users/josia/OneDriv/Documents/NetBeansProjects/Schlep/src/Documents/GPS_Stub.mp4";
        //Media media = new Media(new File(path).toURI().toString());

        //MediaPlayer player = new MediaPlayer(media);
        //MediaView view = new MediaView(player);
        //player.setAutoPlay(true);
        //window = stage;
        //window.setTitle("Delivery in roue");
        //URL file = new File("src/View/GPSView.fxml").toURI().toURL();
        //Parent root = FXMLLoader.load(file);
        //scene = new Scene(root);
        //window.setScene(scene);
        //window.show();
        window = stage;
        window.setTitle("Additional Needs");
        URL file = new File("src/View/AdditionalNeedsPer.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(file);
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }

    public static void main(String args[]) {
        launch(args);
    }

}

/*
 window = stage;
        window.setTitle("");
        URL file = new File("src/View/DeliveryInfo.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(file);
        scene = new Scene(root);
        window.setScene(scene);
        window.show();
 */
