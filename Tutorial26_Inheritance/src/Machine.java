//should only ovveride methods not variables
public class Machine {
	
	//can only be accessed by machine
	protected String name = "Machine type 1";
	public void start() {
		System.out.println("Machine started");
	}

	public void end() {
		System.out.println("Machine ended");
	}
}
