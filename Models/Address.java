package Models;

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
    protected int zipcode;


    public Address() {

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

    public int getZipcode() {
        return zipcode;
    }

// ================================ SETTERS ====================================

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

}
