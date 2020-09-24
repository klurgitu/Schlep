package API;

/**
 * This is an API for a drop-down selecting Country, State, and then City
 * @author Katelynn Urgitus
 * Last Updated 09/15/2020
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

public class UniversalTutorialAPI {

    private final String apiKey;
    private URL url;
    private String authToken;
    

    /**
     * Constructor for the CountryStateCityDropdownAPI class
     */
    public UniversalTutorialAPI() {
        this.apiKey = "Zpsw77iAWu38UL09ho0j3_e2v5SYkWeGttihzA6HB_sx7JcAuWZz7IGWbm4DDx_60fc";
        this.authToken = setAuthToken(this.apiKey, "katelynn.urgitus@yahoo.com");
    }
    
/**
 *
 * @param type
 * @return an array list for the given type
 */
    protected ArrayList<String> getDataFromAPI(String type, String selected){
        String callAction = "";
        switch (type){
            case "country":
                callAction = "/api/countries/";
                break;
            case "state":
                callAction = "/api/states/" + selected;
                break;
            case "city":
                callAction = "/api/cities/" + selected;
                break;
            default:
                throw new IllegalStateException("Unexpected Value: " + type + ". Try again.");
        }

        String baseUrl = "https://www.universal-tutorial.com";
        String urlString = baseUrl + callAction;
        ArrayList<String> notSoEmptyList = new ArrayList();
        try {
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer " + authToken);
            con.setRequestProperty("Accept", "application/json");
            StringBuffer content;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
            }
            con.disconnect();
            JSONArray obj = new JSONArray(content.toString());

            for (int i = 0; i < obj.length() - 1; i++) {
                JSONObject temp = new JSONObject(obj.get(i).toString());
                notSoEmptyList.add(temp.getString(type + "_name"));

            }
        } catch (IOException | JSONException ex) {
            Logger.getLogger(UniversalTutorialAPI.class.getName()).log(Level.SEVERE, null, ex);
        }
        return notSoEmptyList;
    }

    /**
     *
     * @param apiKey
     * @param email
     * @return the authorization token needed to access the countries, states,
     * and cities
     */
    private String setAuthToken(String apiKey, String email) {
        String baseUrl = "https://www.universal-tutorial.com";
        String callActionAuth = "/api/getaccesstoken";
        URL urlAuth;
        try {
            urlAuth = new URL(baseUrl + callActionAuth);
            HttpURLConnection con = (HttpURLConnection) urlAuth.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("api-token", apiKey);
            con.setRequestProperty("user-email", email);
            StringBuffer content;
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                content = new StringBuffer();
                while ((inputLine = in.readLine()) != null) {
                    content.append(inputLine);
                }
            }
            con.disconnect();

            JSONObject obj = new JSONObject(content.toString());
            authToken = obj.getString("auth_token");
            return authToken;
        } catch (IOException | JSONException ex) {
            Logger.getLogger(UniversalTutorialAPI.class.getName()).log(Level.SEVERE, null, ex);
            return "failed to connect";
        }
    }
}
