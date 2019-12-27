//annoymous classes extends an exisiting class or implementing
//an interface

//parent class
//instance
class Machine {
	public void start() {
		System.out.println("Startin machine");
	}
}

interface Plant {
	public void grow();
}

public class App {

	public static void main(String[] args) {
		// overriding methods
		Machine machine1 = new Machine() {
			@Override
			public void start() {
				System.out.println("Camera snaping");
			}
		};

		machine1.start();

		Plant plant = new Plant() {

			@Override
			public void grow() {
				System.out.println("Plant growin");
			}

		};
		plant.grow();
	}

}
