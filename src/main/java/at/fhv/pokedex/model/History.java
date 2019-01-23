package at.fhv.pokedex.model;

// Start of user code (user defined imports)

// End of user code

public class History {
	/**
	 * Description of the property pokemonlist.
	 */
	public java.util.Set<at.fhv.pokedex.model.Pokemon> pokemonlist = new java.util.HashSet<at.fhv.pokedex.model.Pokemon>();
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public java.util.Set<at.fhv.pokedex.model.Pokemon> getPokemonlist(){
		   return this.pokemonlist;
		}
		
		public void setPokemonlist(java.util.Set<at.fhv.pokedex.model.Pokemon> pokemonlist){
		   this.pokemonlist = pokemonlist;
		}
		
	
}
