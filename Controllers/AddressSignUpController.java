package Controllers;

/**
 * This is a Controller for user entering their address
 *@author Katelynn Urgitus
 * Last Updated 09/22/2020
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import Models.CountryStateCityDropdownAPI;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddressSignUpController implements Initializable {
    Scene scene;
    private String selectedCountry;
    private String selectedState;
    CountryStateCityDropdownAPI x;

    @FXML
    private ChoiceBox<String> countryBox;

    @FXML
    private ChoiceBox<String> stateBox;

    @FXML
    private ChoiceBox<String> cityBox;

    @FXML
    private TextField addressLine1;

    @FXML
    private TextField addressLine2;

    @FXML
    private TextField zipcode;

    @FXML
    private Button nextAddressButton;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        x = new CountryStateCityDropdownAPI();
        countryBox.getItems().addAll(x.country());
        countryBox.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String oldValue, String newValue) {
                if (newValue == null) {
                    selectedCountry = oldValue;

                } else {
                    selectedCountry = newValue;

                }
                stateBox.getItems().addAll(x.state(selectedCountry));
            }
        });
        stateBox.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String oldValue, String newValue) {
                if (newValue == null) {
                    selectedState = oldValue;

                } else {
                    selectedState = newValue;
                }
                cityBox.getItems().addAll(x.city(selectedState));
            }
        });
    }

    @FXML
    private void saveAddressAndMove(ActionEvent event) throws SQLException, IOException {
        Stage stageTheLabelBelongs = (Stage) nextAddressButton.getScene().getWindow();
        URL urlForDropdownFX = new File("src/View/OffloadingItems.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(urlForDropdownFX);
        scene = new Scene(root);
        stageTheLabelBelongs.setScene(scene);
    }
}