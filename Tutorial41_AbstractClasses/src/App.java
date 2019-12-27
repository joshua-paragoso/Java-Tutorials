//abstacr classes: can use whne you wants to start 
//creating classes hieracrhy
//acts as a face for other classes
public class App {

	public static void main(String[] args) {
		Camera cam1 = new Camera();
		cam1.setId(5);
			
		Car car1 = new Car();
		car1.setId(4);
		
		//base class that implements some funcitonaloty between car and camera
		//if machine is abstract,this wont work
//		Machine machine1 = new Machine();
		
		car1.run();
	}
}
