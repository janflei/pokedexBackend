package application.src.main.java.pokedex.model;

// Start of user code (user defined imports)

// End of user code

import application.src.main.java.pokedex.model.Pokemon;

public class History {
	/**
	 * Description of the property pokemon.
	 */
	public java.util.Set<Pokemon> pokemon = new java.util.HashSet<Pokemon>();

	// Start of user code (user defined attributes)

	// End of user code

	public java.util.Set<Pokemon> getPokemon(){
		return this.pokemon;
	}

	public void setPokemon(java.util.Set<Pokemon> pokemon){
		this.pokemon = pokemon;
	}


}
