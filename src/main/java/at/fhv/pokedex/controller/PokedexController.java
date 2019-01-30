package at.fhv.pokedex.controller;

// Start of user code (user defined imports)

// End of user code

import at.fhv.pokedex.model.History;
import at.fhv.pokedex.model.Pokemon;

public class PokedexController {
	/**
	 * Description of the property history.
	 */
	public static at.fhv.pokedex.model.History history = History.getInstance();
	
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
	
	public Pokemon request(String pokeName) throws Exception {
		// Start of user code request
		Pokemon poke = null;
		if(History.getInstance().containsPokemon(pokeName)){
			poke = history.getPokemonByName(pokeName);
		} else {
			poke = RestController.getInstance().requestPokemon(pokeName);
		}
		if(poke != null) {
            addToHistory(poke);
        }
		return poke;
		// End of user code
	}
	
	public at.fhv.pokedex.model.History getHistory() throws Exception {
		// Start of user code getHistory
		return history;
		// End of user code
	}
	
	private void addToHistory(at.fhv.pokedex.model.Pokemon pokemon) throws Exception {
		// Start of user code addToHistory
        if(!history.containsPokemon(pokemon.getName())){
            history.addPokemon(pokemon);
        }
		// End of user code
	}
	
	// Start of user code (user defined operations)
	
	// End of user code
	
}
