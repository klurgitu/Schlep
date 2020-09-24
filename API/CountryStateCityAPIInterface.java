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
public interface CountryStateCityAPIInterface {
    public ArrayList<String> getCountryList();
    public ArrayList<String> getStateList(String country);
    public ArrayList<String> getCityList(String state);
}
