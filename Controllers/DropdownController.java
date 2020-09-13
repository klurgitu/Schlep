package Controllers;

/**
 * This is a Controller for a drop-down selecting Country
 * @author Katelynn Urgitus
 * Last Updated 09/12/2020
 */
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import Models.CountryStateCityDropdownAPI;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;

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
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        x = new CountryStateCityDropdownAPI();
        countryBox.getItems().addAll(x.country());
        countryBox.valueProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue ov, String t, String t1) {
            if (t1 == null){
                selectedCountry = t;

            }
            else{
                selectedCountry = t1;

            }
            stateBox.getItems().addAll(x.state(selectedCountry));
        }
    });
        stateBox.valueProperty().addListener(new ChangeListener<String>() {
        @Override public void changed(ObservableValue ov, String t, String t1) {
            if (t1 == null){
                selectedState = t;

            }
            else{
                selectedState = t1;
                            }
            cityBox.getItems().addAll(x.city(selectedState));
        }
    });
    }

    public String getSelectedCountry() {
        return selectedCountry;
    }

    public String getSelectedState() {
        return selectedState;
    }

}
