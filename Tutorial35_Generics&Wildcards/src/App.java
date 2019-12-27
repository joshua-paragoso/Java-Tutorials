import java.util.*;

class Machine {

	@Override
	public String toString() {
		return "I am a machine";
	}

	public void start() {
		System.out.println("Machine starting");
	}

}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a camera";
	}

	public void snap() {
		System.out.println("snap!");
	}
}

public class App {

	public static void main(String[] args) {

		// array list to stroe values
		// NOTE: You can change Machine in parameters
		// to type string
//		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Machine> list1 = new ArrayList<Machine>();
		list1.add(new Machine());
		list1.add(new Machine());

//		showList(list1);

		// another list with camera
		ArrayList<Camera> list2 = new ArrayList<Camera>();
		list2.add(new Camera());
		list2.add(new Camera());

		// cant past to showList isA show lsit
		// takes an array list of machine type
		showList(list2);
		showList2(list1);

	}

	// question mark is wildcard,pass an array list with any type
	// of parameter
	// disdavantage: only treat object in inside list as an object
	// cant call an specific objects
//	public static void showList(ArrayList<?> list) {
//		for (Object value : list) {
//			System.out.println(value);
//		}
//	}
	// specify an upper bound
	// applies to any paramertized classes
	public static void showList(ArrayList<? extends Machine> list) {
		for (Machine value : list) {
			System.out.println(value);
			value.start();
			// cant call value.snap
			// only does machine
			// value.snap();
			// only knows its some type of machine
		}
	}

	public static void showList2(ArrayList<? super Camera> list) {
		for (Object value : list) {
			System.out.println(value);	
		}
	}
}
