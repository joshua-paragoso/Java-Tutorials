class Machine{
	public void start() {
		System.out.println("Machine started");
	}
}
class Camera extends Machine{
	public void start() {
		System.out.println("Camera started");
	}
	public void snap() {
		System.out.println("Photo taken");
	}
}
public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		//Upcasting////////////////////
		System.out.println("Upcasting");
		//machine is parent class
//		Machine machine2 = new Camera();
		//could also do
		//machine2 now refers to camera
		Machine machine2 = camera1;
		//machine2 can now use methods from 
		//camera
		machine2.start();
		//cant do snap because the variable 
		//decides which variabel to call
		//Machine will only allow start
		
		//this wont work
		//machine2.snap();
		
		//Downcasting/////////////
		System.out.println("Downcasting");
		Machine machine3 = new Camera();
		//when you downcast, java wants confirmation 
		//that you know what youre doing
		//you have to cast it
		//want to make sure that the variable that youre
		//downcasting really refers to the variable that 
		//youre downcasting to
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		
		//NOTE: downcasting is unsafe
		//cannot do this because  the natural object is a machine
		Machine machine4 = new Machine();
//		Camera camera3 = (Camera)machine4;
//		camera3.start();
		
		

	}

}
