package Controllers;

/**
 * Controls all action events on the Timer FXML file
 *
 * @author Marc Bittle Last Updated 11/12/2020
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ParallelTransition;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author Marc Bittle
 */
public class TimerController implements Initializable {

    @FXML
    private AnchorPane menuPane;
    @FXML
    private AnchorPane timerPane;
    @FXML
    private ComboBox<Integer> hoursInput;
    @FXML
    private ComboBox<Integer> minutesInput;
    @FXML
    private ComboBox<Integer> secondsInput;
    @FXML
    private Button startButton;
    @FXML
    private Text hoursTimer;
    @FXML
    private Text minutesTimer;
    @FXML
    private Text secondsTimer;
    @FXML
    private Button cancelBtn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObservableList<Integer> hoursList = FXCollections.observableArrayList();
        ObservableList<Integer> minutesAndSecondsList = FXCollections.observableArrayList();
        for (int i = 0; i <= 60; i++) {
            if (0 <= i && i <= 24) {
                hoursList.add(i);
            }
            minutesAndSecondsList.add(i);
        }
        hoursInput.setItems(hoursList);
        hoursInput.setValue(0);

        minutesInput.setItems(minutesAndSecondsList);
        minutesInput.setValue(0);

        secondsInput.setItems(minutesAndSecondsList);
        secondsInput.setValue(0);
    }

    @FXML
    private void startTimer(ActionEvent event) {
        scrollUp();
    }

    @FXML
    private void cancelTimer(ActionEvent event) {
        scrollDown();
    }

    private void scrollUp() {
        TranslateTransition trans1 = new TranslateTransition();
        trans1.setDuration(Duration.millis(100));
        trans1.setToX(0);
        trans1.setToY(-300);
        trans1.setNode(menuPane);

        TranslateTransition trans2 = new TranslateTransition();
        trans2.setDuration(Duration.millis(100));
        trans2.setFromX(0);
        trans2.setFromY(300);
        trans2.setToX(0);
        trans2.setToY(0);
        trans2.setNode(timerPane);

        ParallelTransition para1 = new ParallelTransition(trans1, trans2);
        para1.play();
    }

    private void scrollDown() {
        TranslateTransition trans1 = new TranslateTransition();
        trans1.setDuration(Duration.millis(100));
        trans1.setToX(0);
        trans1.setToY(300);
        trans1.setNode(timerPane);

        TranslateTransition trans2 = new TranslateTransition();
        trans2.setDuration(Duration.millis(100));
        trans2.setFromX(0);
        trans2.setFromY(300);
        trans2.setToX(0);
        trans2.setToY(0);
        trans2.setNode(menuPane);

        ParallelTransition para1 = new ParallelTransition(trans1, trans2);
        para1.play();
    }
}
