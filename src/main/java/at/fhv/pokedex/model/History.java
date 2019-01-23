package at.fhv.pokedex.model;

// Start of user code (user defined imports)

// End of user code

public class History {
	/**
	 * Description of the property pokemon.
	 */
	public java.util.Set<at.fhv.pokedex.model.Pokemon> pokemon = new java.util.HashSet<at.fhv.pokedex.model.Pokemon>();
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public java.util.Set<at.fhv.pokedex.model.Pokemon> getPokemon(){
		   return this.pokemon;
		}
		
		public void setPokemon(java.util.Set<at.fhv.pokedex.model.Pokemon> pokemon){
		   this.pokemon = pokemon;
		}
		
	
}
