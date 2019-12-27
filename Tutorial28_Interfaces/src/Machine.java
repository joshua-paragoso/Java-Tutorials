
public class Machine implements Info {

	private int id = 7;

	public void start() {
		System.out.println("Machine started");
	}

	//adds method from Info
	@Override
	public void showInfo() {
		System.out.println("Machine ID is " + id);
	}
}
