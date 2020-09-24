package Controllers;

import java.io.File;
import java.net.URL;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Marc Bittle
 */
public class CreateAccountController implements Initializable {

    @FXML
    private TextField firstName;

    @FXML
    private TextField lastName;

    @FXML
    private Label welcomeMSG;

    /**
     * When a user makes a new account, prints a welcome message with the users
     * first and last name
     */
    public void activateAcctButtonPushed() {
        String welcome = "Welcome, ";
        welcome += firstName.getText() + " ";
        welcome += lastName.getText();
        this.welcomeMSG.setText(welcome);
    }

    /**
     * If user already has an account, change scene to login screen
     *
     * @param event read from button to get the stage
     * @throws Exception for IO
     */
    public void changeToLoginScreen(ActionEvent event) throws Exception {
        URL urlForDropdownFX = new File("src/view/LoginView.fxml").toURI().toURL();
        Parent parent = FXMLLoader.load(urlForDropdownFX);
        Scene scene = new Scene(parent);

        // Gets stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();

    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        welcomeMSG.setText("");
    }

}
