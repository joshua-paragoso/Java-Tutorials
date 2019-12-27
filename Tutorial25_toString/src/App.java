//toString method tutorial
//tostring helps debug

class Frog {
	
	private String name;
	private int id;
	
	public Frog (String name, int id) {
		this.id = id;
		this.name = name;
	}
//toString method
	//creates a strign object
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(id).append(" ").append(name);
//		return id + ": " + name;
		
		//this avoid concatination
//		return sb.toString();
		
		//formats string
		return String.format("%d, %s",id, name);
		}
}

public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog("Josh", 1);
		Frog frog2 = new Frog("Jake", 2);
		//invokes toString method
		//without toString, your code will print a hass code
		// ex output: Frog@7852e922
        System.out.println(frog1);
        System.out.println(frog2);
	}

}
