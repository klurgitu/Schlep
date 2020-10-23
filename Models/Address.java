package Models;

import java.sql.SQLException;
import javafx.scene.control.TextField;
import javafx.scene.control.ChoiceBox;

/**
 * This is a class for the Address for a user
 * @author Katelynn Urgitus
 * Last Updated 10/08/2020
 */
public class Address extends DB.DataObject{

    protected String addressLine1;
    protected String addressLine2;
    protected String country;
    protected String state;
    protected String city;
    protected String zipcode;

    public Address() throws SQLException{
        this.setUuid(DB.DataObject.connectUUID());
    }

    public Address(TextField _addressLine1, TextField _addressLine2, ChoiceBox<String> _country, ChoiceBox<String> _state, ChoiceBox<String> _city, TextField _zipcode, String _UUID) {
        this.addressLine1 = _addressLine1.getText();
        this.addressLine2 = _addressLine2.getText();
        this.country = _country.getValue();
        this.state = _state.getValue();
        this.city = _city.getValue();
        this.zipcode = _zipcode.getText();
    }

// ================================ GETTERS ====================================

    public String getAddressLine1() {
        return addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipcode;
    }

// ================================ SETTERS ====================================

    public void setAddressLine1(String _addressLine1) {
        this.addressLine1 = _addressLine1;
    }

    public void setAddressLine2(String _addressLine2) {
        this.addressLine2 = _addressLine2;
    }

    public void setCountry(String _country) {
        this.country = _country;
    }

    public void setState(String _state) {
        this.state = _state;
    }

    public void setCity(String _city) {
        this.city = _city;
    }

    public void setZipcode(String _zipcode) {
        this.zipcode = _zipcode;
    }

}
