package at.fhv.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

/*package*/ class PokedexController {
	/**
	 * Description of the property history.
	 */
	public at.fhv.pokedex.model.History history = null;
	
	/**
	 * Description of the property restcontroller.
	 */
	public at.fhv.pokedex.controller.RestController restcontroller = null;
	
	/**
	 * Description of the property apicontroller.
	 */
	public at.fhv.pokedex.endpoint.APIController apicontroller = null;
	
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
	
	public void request(String pokeName) throws Exception {
		// Start of user code request
		
		// End of user code
	}
	
	public void getHistory(at.fhv.pokedex.model.History pokeHistory) throws Exception {
		// Start of user code getHistory
		
		// End of user code
	}
	
	private void addToHistory(at.fhv.pokedex.model.Pokemon pokemon) throws Exception {
		// Start of user code addToHistory
		
		// End of user code
	}
	
	private void respond(at.fhv.pokedex.model.Pokemon pokemon) throws Exception {
		// Start of user code respond
		
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
