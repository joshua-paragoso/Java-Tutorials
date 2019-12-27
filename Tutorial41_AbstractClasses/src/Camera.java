
public class Camera extends Machine{

	@Override
	public void start() {
		System.out.println("Starting camera");
	}

	@Override
	public void doStuff() {
		System.out.println("Camera is running");
	}

	@Override
	public void shutDown() {
		System.out.println("Shutdown camera");
	}

}
