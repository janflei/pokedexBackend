package application.src.main.java.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

public class RestController {
	/**
	 * Description of the property restURL.
	 */
	private String restURL = null;
	
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
		
		// End of user code
	}
	
	private void parseResponse(String response) throws Exception {
		// Start of user code parseResponse
		
		// End of user code
	}
	
	public void requestPokemon(String pokeName) throws Exception {
		// Start of user code requestPokemon
		
		// End of user code
	}
	
	public void getRestURL() throws Exception {
		// Start of user code getRestURL
		
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
