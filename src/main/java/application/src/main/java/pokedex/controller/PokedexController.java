package application.src.main.java.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

import application.src.main.java.pokedex.endpoint.APIController;
import application.src.main.java.pokedex.model.History;
import application.src.main.java.pokedex.model.Pokemon;

public class PokedexController {
	/**
	 * Description of the property history.
	 */
	public History history = null;
	
	/**
	 * Description of the property restcontroller.
	 */
	public RestController restcontroller = null;
	
	/**
	 * Description of the property apicontroller.
	 */
	public APIController apicontroller = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	

	private static PokedexController INSTANCE;
	
	private PokedexController(){
	    // singleton
	}
	
	public static PokedexController getInstance(){
	    if(INSTANCE == null){
	        INSTANCE = new PokedexController();
	    }
	
	    return INSTANCE;
	}
	
	private void respond(Pokemon pokemon) throws Exception {
		// Start of user code respond
		
		// End of user code
	}
	
	private void addToHistory(Pokemon pokemon) throws Exception {
		// Start of user code addToHistory
		
		// End of user code
	}
	
	public void request(String pokeName) throws Exception {
		// Start of user code request
		
		// End of user code
	}
	
	public void getHistory(History pokeHistory) throws Exception {
		// Start of user code getHistory
		
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
