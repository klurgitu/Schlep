package Models;

/**
 * This is an API for a drop-down selecting Country, State, and then City
 *
 * @author Katelynn Urgitus Last Updated 09/11/2020
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.*;

public class CountryStateCityDropdownAPI {

    public CountryStateCityDropdownAPI() {
    }

    public static String getAuthToken(String apiKey, String email) {
        String baseUrl = "https://www.universal-tutorial.com";
        String callAction = "/api/getaccesstoken";
        URL url;
        try {
            url = new URL(baseUrl + callAction);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("api-token", apiKey);
            con.setRequestProperty("user-email", email);

            int status = con.getResponseCode();
            System.out.println("Response Code: " + status);
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            System.out.println("Output: " + content.toString());
            JSONObject obj = new JSONObject(content.toString());

            String authToken = obj.getString("auth_token");
            return authToken;
        } catch (Exception ex) {
            Logger.getLogger(CountryStateCityDropdownAPI.class.getName()).log(Level.SEVERE, null, ex);
            return "fail";
        }

    }

    private void country() {
        String baseUrl = "https://www.universal-tutorial.com";
        String callAction = "/api/countries/";
        String apiKey = "Zpsw77iAWu38UL09ho0j3_e2v5SYkWeGttihzA6HB_sx7JcAuWZz7IGWbm4DDx_60fc";
        String urlString = baseUrl + callAction;
        URL url;
        String authToken = getAuthToken(apiKey, "katelynn.urgitus@yahoo.com");

        try {
            url = new URL(urlString);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer " + authToken);
            con.setRequestProperty("Accept", "application/json");
            int status = con.getResponseCode();
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            con.disconnect();
            JSONArray obj = new JSONArray(content.toString());
            for (int i = 0; i < obj.length() - 1; i++) {
                JSONObject temp = new JSONObject(obj.get(i).toString());
            }

        } catch (Exception ex) {
            Logger.getLogger(CountryStateCityDropdownAPI.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
    }

}
