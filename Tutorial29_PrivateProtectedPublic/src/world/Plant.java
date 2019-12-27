package world;

public class Plant {

	// if declared public, you can access variable anywhere
	// though this is bad practice
	// you want to encapculate them
	// have them access through methods
	public String name;

	// final means it cant be changed
	// this is acceptable practice
	public final static int ID = 8;

	// private means you can only access in this class only
	private String type;
	
	//proctected can access variable within class
	//can access within the same class/package
	//sub-classes can access protected variables
	protected String size;
	
	//no access modifier
	//package level visibility
	int height;

	public Plant() {
		
		this.name = "I am a plant";
		this.type = "Plant";
		this.size = "Large";
		this.height = 8;
		
	}

}
