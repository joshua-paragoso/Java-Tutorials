//encapsulate the inner workings of that class
//stop people outside the class
//expose a public API for people to use
class Plant{
	
	//final means this cannot be changes
	//this is a constant
	public static final int ID = 7;
	
	private String name;
	
	public String getData() {
		String data = "Some data" + calcuateGrowthForecast();
		return data;
	}
	//keep a few methods defined public
	//prevent cross linkage
	//keep inside a class
	private int calcuateGrowthForecast() {
		return 9;
	}

	//these public methods can be used outside the class
	//as long as the methods dont change, anyone can
	//use it
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
public class App {

	public static void main(String[] args) {

	}

}
