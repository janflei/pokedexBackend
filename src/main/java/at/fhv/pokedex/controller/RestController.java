package at.fhv.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

import at.fhv.pokedex.model.Pokemon;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.boot.json.GsonJsonParser;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;


public class RestController {
	/**
	 * Description of the property restURL.
	 */
	private String restURL = "https://pokeapi.co/api/v2/pokemon/";
	
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static RestController INSTANCE;

	private RestController(){
	    // singleton
	}
	
	public static RestController getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new RestController();
	    }
	
	    return INSTANCE;
	}
	
	public void setRestURL(String restURL) throws Exception {
		// Start of user code setRestURL
        this.restURL = restURL;
		// End of user code
	}

	
	public at.fhv.pokedex.model.Pokemon requestPokemon(String pokeName) throws Exception {
		// Start of user code requestPokemon
        StringBuilder output = new StringBuilder();
        HttpURLConnection conn = null;
        try {

            URL url = new URL(restURL + pokeName);
            conn = (HttpsURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", "Mozilla/5.0");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));


            //System.out.println("Output from Server .... \n");
            String line;
            while ((line = br.readLine()) != null) {
                output.append(line);
            }
            br.close();
            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            conn.disconnect();
        }

		// End of user code
        return parseResponse(output.toString());
	}
	
	public String getRestURL() throws Exception {
        // Start of user code getRestURL
        return restURL;
        // End of user code
    }
	private at.fhv.pokedex.model.Pokemon parseResponse(String response) throws Exception {
		// Start of user code parseResponse
        System.out.println(response);
        JSONObject json = new JSONObject(response);
        Pokemon pokemon = new Pokemon();
        pokemon.setBaseexp(json.getInt("base_experience") + "");
        pokemon.setHeight(json.getInt("height") + "");
        pokemon.setImageurl(json.getJSONObject("sprites").getString("front_default"));
        pokemon.setName(json.getString("name"));
        pokemon.setOrder(json.getInt("order")+"");
        pokemon.setWeight(json.getInt("weight")+"");
        JSONArray arr = json.getJSONArray("types");
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < arr.length(); i++) {
            set.add(arr.getJSONObject(i).getJSONObject("type").getString("name"));
        }
        pokemon.setTypes(set);
        return pokemon;
		// End of user code
	}

	
}
