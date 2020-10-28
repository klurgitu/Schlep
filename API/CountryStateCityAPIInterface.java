package API;
/**
 * This is our API Interface for the Country, State, City API
 * @author Katelynn Urgitus
 * Last Updated 10/23/2020
 */
import java.util.ArrayList;
public interface CountryStateCityAPIInterface {
    public ArrayList<String> getCountryList();
    public ArrayList<String> getStateList(String _country);
    public ArrayList<String> getCityList(String _state);
}
