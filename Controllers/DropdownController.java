package Controllers;

/**
 * This is a Controller for a drop-down selecting Country
 * @author Katelynn Urgitus
 * Last Updated 09/15/2020
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import Models.CountryStateCityDropdownAPI;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;


public class DropdownController implements Initializable {
    private String selectedCountry;
    private String selectedState;
    CountryStateCityDropdownAPI x;
    @FXML
    private ChoiceBox<String> countryBox;
    @FXML
    private ChoiceBox<String> stateBox;
    @FXML
    private ChoiceBox<String> cityBox;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        x = new CountryStateCityDropdownAPI();
        countryBox.getItems().addAll(x.country());
        countryBox.valueProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue ov, String oldValue, String newValue) {
            if (newValue == null){
                selectedCountry = oldValue;

            }
            else{
                selectedCountry = newValue;

            }
            stateBox.getItems().addAll(x.state(selectedCountry));
        }
    });
        stateBox.valueProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue ov, String oldValue, String newValue) {
            if (newValue == null){
                selectedState = oldValue;

            }
            else{
                selectedState = newValue;
                            }
            cityBox.getItems().addAll(x.city(selectedState));
        }
    });
    }
}
