package at.fhv.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

import at.fhv.pokedex.model.Pokemon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


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
        try {

            URL url = new URL(restURL + pokeName);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));


            System.out.println("Output from Server .... \n");
            String line;
            while ((line = br.readLine()) != null) {
                output.append(line);
            }

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();
        }
		// End of user code
        return parseResponse(output.toString());
	}
	
	public String getRestURL() throws Exception {
        // Start of user code getRestURL
        return restURL;

    }
	private at.fhv.pokedex.model.Pokemon parseResponse(String response) throws Exception {
		// Start of user code parseResponse
        return new Pokemon();
		// End of user code
	}

	
}
