class Machine {
	// constrcutors used for initialization

	private String name;
	private int code;
	// constructor has same name as class
	public Machine() {
		System.out.println("Constrcutor running");

		name = "Josh";
	}
	//constructor with string parameter
	public Machine(String name) {
		System.out.println("Second constructor running");
		this.name = name;
	}
	
	//constructor that accepts a string and an int
	public Machine(String name, int code) {
		System.out.println("Third constructor running");
		this.name = name;
		this.code = code;
	}
	
	//call a constructor within a constructor
	
}

public class App {

	public static void main(String[] args) {
		
		// create machine object
		Machine machine1 = new Machine();
		
		//invokes constructors
//		new Machine();
		
		//will look for constructor that accepts string
		Machine machine2 = new Machine("jake");
		
		//will look for constructor that accepts string and int
		Machine machine3 = new Machine("Jak", 2);
	}

}
