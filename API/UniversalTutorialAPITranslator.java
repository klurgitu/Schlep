/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.ArrayList;

/**
 *
 * @author katel
 */
public class UniversalTutorialAPITranslator extends UniversalTutorialAPI implements CountryStateCityAPIInterface{
    protected String country;
    protected String state;

    @Override
    public ArrayList<String> getCountryList() {
        return this.getDataFromAPI("country", "");
    }

    @Override
    public ArrayList<String> getStateList(String selectedCountry) {
        this.country = selectedCountry;
        return this.getDataFromAPI("state", country);
    }

    @Override
    public ArrayList<String> getCityList(String selectedState) {
        this.state = selectedState;
        return this.getDataFromAPI("city", state);
    }
}
