package at.fhv.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

import at.fhv.pokedex.model.History;
import at.fhv.pokedex.model.Pokemon;

/*package*/ class PokedexController {
	/**
	 * Description of the property history.
	 */
	public at.fhv.pokedex.model.History history = History.getInstance();
	
	/**
	 * Description of the property restcontroller.
	 */
	public at.fhv.pokedex.controller.RestController restcontroller = RestController.getInstance();
	
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
		Pokemon poke = null;
		if(History.getInstance().containsPokemon(pokeName)){
			poke = History.getInstance().getPokemonByName(pokeName);
		} else {
			RestController.getInstance().requestPokemon(pokeName);
		}
		History.getInstance().addPokemon(poke);
		// End of user code
	}
	
	public at.fhv.pokedex.model.History getHistory() throws Exception {
		// Start of user code getHistory
		
		// End of user code
	}
	
	private void addToHistory(at.fhv.pokedex.model.Pokemon pokemon) throws Exception {
		// Start of user code addToHistory

		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
