//car is derives/inherents from machine
//car now has all the methods of machine
public class Car extends Machine {

//	public void start() {
//		System.out.println("Car started");
//	}

	public void whipWindShield() {
		System.out.println("Wiped wind shield");
	}

//overrides start from machine
	// @Override is a class name
	// it will check if its an override
	@Override
	public void start() {

		super.start();
	}

//	public void end() {
//		System.out.println("Car ended");
//	}

	public void showInfo() {

		System.out.println("Car name: " + name);
	}
}
