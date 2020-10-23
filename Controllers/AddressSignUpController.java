package Controllers;

import API.BaseAddressAPIClass;
import DB.DataObject;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import Models.MoveScene;
import Models.Address;
import DB.MySQLConnector;
import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * This is a Controller for user entering their address
 *@author Katelynn Urgitus
 * Last Updated 10/15/2020
 */
public class AddressSignUpController extends BaseAddressAPIClass implements Initializable {
    private String selectedCountry;
    private String selectedState;
    private final MoveScene moveToOffloading = new MoveScene();
    private final DB.MySQLConnector con = new DB.MySQLConnector();

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
    private Button nextBtn;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        countryBox.getItems().addAll(universalAPI.getCountryList());
        countryBox.valueProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue ov, String oldValue, String newValue) {
                if (newValue == null) {
                    selectedCountry = oldValue;

                } else {
                    selectedCountry = newValue;

                }
                stateBox.getItems().addAll(universalAPI.getStateList(selectedCountry));
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
                cityBox.getItems().addAll(universalAPI.getCityList(selectedState));
            }
        });
    }
/**
 * Will save the User input data into the Schlep Database
 * and move to the Offloading Screen
 * @param event
 * @throws IOException
 */
    @FXML
    private void saveAddressAndMove(ActionEvent event) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, SQLException {
        Address userAddress = new Address();
        HashMap<String, String> pairs = new HashMap();
        pairs.put("addressLine1", addressLine1.getText());
        pairs.put("addressLine2", addressLine2.getText());
        pairs.put("country", countryBox.getValue());
        pairs.put("state", stateBox.getValue());
        pairs.put("city", cityBox.getValue());
        pairs.put("zipcode", zipcode.getText());
        pairs.put("UUID", userAddress.getUuid());
        con.createObject(pairs, "address");
        Map<String, String> map = new HashMap();
        map.put("address_id", "address.UUID");
        con.updateObject(map, userAddress.getUuid(), "user", "address");
        moveToOffloading.Move("Billing.fxml", nextBtn);

    }
}
