package API;
/**
 * This is a Translator for the Universal Tutorial API
 * @author Katelynn Urgitus
 * Last Updated 09/24/2020
 */
import java.util.ArrayList;
public class UniversalTutorialAPITranslator extends UniversalTutorialAPI implements CountryStateCityAPIInterface{
    protected String country;
    protected String state;
/**
 *
 * @return The entire list of countries provided by the API
 */
    @Override
    public ArrayList<String> getCountryList() {
        return this.getDataFromAPI("country", "");
    }
/**
 *
 * @param selectedCountry the country selected by the user
 * @return the entire list of states for the selected country
 */
    @Override
    public ArrayList<String> getStateList(String selectedCountry) {
        this.country = selectedCountry;
        return this.getDataFromAPI("state", country);
    }
/**
 *
 * @param selectedState the state selected by the user
 * @return the entire list of cities for the selected state
 */
    @Override
    public ArrayList<String> getCityList(String selectedState) {
        this.state = selectedState;
        return this.getDataFromAPI("city", state);
    }
}
