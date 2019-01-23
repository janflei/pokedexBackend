package pokedex.model;

// Start of user code (user defined imports)

// End of user code

public class Pokemon {
	/**
	 * Description of the property name.
	 */
	private String name = null;
	
	/**
	 * Description of the property moves.
	 */
	private java.util.Set<String> moves = new java.util.HashSet<String>();
	
	/**
	 * Description of the property abilities.
	 */
	private java.util.Set<String> abilities = new java.util.HashSet<String>();
	
	/**
	 * Description of the property types.
	 */
	private java.util.Set<String> types = new java.util.HashSet<String>();
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getName(){
		   return this.name;
		}
		
		public void setName(String name){
		   this.name = name;
		}
		
		public java.util.Set<String> getMoves(){
		   return this.moves;
		}
		
		public void setMoves(java.util.Set<String> moves){
		   this.moves = moves;
		}
		
		public java.util.Set<String> getAbilities(){
		   return this.abilities;
		}
		
		public void setAbilities(java.util.Set<String> abilities){
		   this.abilities = abilities;
		}
		
		public java.util.Set<String> getTypes(){
		   return this.types;
		}
		
		public void setTypes(java.util.Set<String> types){
		   this.types = types;
		}
		
	
}
