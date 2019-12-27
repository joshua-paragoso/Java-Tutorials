
public class Car extends Machine {

	@Override
	public void start() {
		System.out.println("Starting car");
	}

	@Override
	public void doStuff() {
		System.out.println("Car is running");
	}

	@Override
	public void shutDown() {
		System.out.println("Car is shutting down");
	}

}
