package application.src.main.java.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

public class PokedexController {
	/**
	 * Description of the property history.
	 */
	public model.History history = null;
	
	/**
	 * Description of the property history.
	 */
	public model.History history = null;
	
	/**
	 * Description of the property restcontroller.
	 */
	public controller.RestController restcontroller = null;
	
	/**
	 * Description of the property apicontroller.
	 */
	public endpoint.APIController apicontroller = null;
	
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
	
	private void respond(model.Pokemon pokemon) throws Exception {
		// Start of user code respond
		
		// End of user code
	}
	
	private void addToHistory(model.Pokemon pokemon) throws Exception {
		// Start of user code addToHistory
		
		// End of user code
	}
	
	public void request(String pokeName) throws Exception {
		// Start of user code request
		
		// End of user code
	}
	
	public void getHistory(model.History pokeHistory) throws Exception {
		// Start of user code getHistory
		
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
