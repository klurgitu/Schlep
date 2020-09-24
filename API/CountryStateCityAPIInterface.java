package API;
/**
 * This is our API Interface for the Country, State, City API
 * @author Katelynn Urgitus
 * Last Updated 09/24/2020
 */
import java.util.ArrayList;
public interface CountryStateCityAPIInterface {
    public ArrayList<String> getCountryList();
    public ArrayList<String> getStateList(String country);
    public ArrayList<String> getCityList(String state);
}
