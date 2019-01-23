package at.fhv.pokedex.model;

// Start of user code (user defined imports)

// End of user code

import java.util.Set;

public class History {
	/**
	 * Description of the property pokemonlist.
	 */
	public java.util.Set<at.fhv.pokedex.model.Pokemon> pokemonlist = new java.util.HashSet<at.fhv.pokedex.model.Pokemon>();
	
	// Start of user code (user defined attributes)

	private static History INSTANCE;

	public static History getInstance(){
		if(INSTANCE == null){
			INSTANCE = new History();
		}

		return INSTANCE;
	}

	public void addPokemon(Pokemon pokemon) {
		this.pokemonlist.add(pokemon);
	}

	public Set<Pokemon> getHistory() {
		return getPokemonlist();
	}

	// End of user code
	
	public java.util.Set<at.fhv.pokedex.model.Pokemon> getPokemonlist(){
		return this.pokemonlist;
	}
		
	public void setPokemonlist(java.util.Set<at.fhv.pokedex.model.Pokemon> pokemonlist){
	   this.pokemonlist = pokemonlist;
	}

	public Pokemon getPokemonByName(String name){
	    for(Pokemon p : pokemonlist){
	        if(p.getName().equals(name)){
	            return p;
            }
        }
        return null;
    }

	public boolean containsPokemon(String name){
	    for(Pokemon p : pokemonlist){
	        if(p.getName().equals(name)){
	            return true;
            }
        }
        return false;
    }
	
}
