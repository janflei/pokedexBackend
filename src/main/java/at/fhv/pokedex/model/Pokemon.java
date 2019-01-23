package at.fhv.pokedex.model;

// Start of user code (user defined imports)

// End of user code

public class Pokemon {
	/**
	 * Description of the property name.
	 */
	private String name = null;
	
	/**
	 * Description of the property types.
	 */
	private java.util.Set<String> types = new java.util.HashSet<String>();
	
	/**
	 * Description of the property imageurl.
	 */
	private String imageurl = null;
	
	/**
	 * Description of the property baseexp.
	 */
	private String baseexp = null;
	
	/**
	 * Description of the property height.
	 */
	private String height = null;
	
	/**
	 * Description of the property order.
	 */
	private String order = null;
	
	/**
	 * Description of the property weight.
	 */
	private String weight = null;
	
	// Start of user code (user defined attributes)
	
	// End of user code
	
		public String getName(){
		   return this.name;
		}
		
		public void setName(String name){
		   this.name = name;
		}
		
		public java.util.Set<String> getTypes(){
		   return this.types;
		}
		
		public void setTypes(java.util.Set<String> types){
		   this.types = types;
		}
		
		public String getImageurl(){
		   return this.imageurl;
		}
		
		public void setImageurl(String imageurl){
		   this.imageurl = imageurl;
		}
		
		public String getBaseexp(){
		   return this.baseexp;
		}
		
		public void setBaseexp(String baseexp){
		   this.baseexp = baseexp;
		}
		
		public String getHeight(){
		   return this.height;
		}
		
		public void setHeight(String height){
		   this.height = height;
		}
		
		public String getOrder(){
		   return this.order;
		}
		
		public void setOrder(String order){
		   this.order = order;
		}
		
		public String getWeight(){
		   return this.weight;
		}
		
		public void setWeight(String weight){
		   this.weight = weight;
		}
		
	
}
