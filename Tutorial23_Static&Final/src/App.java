//difference between static and final
class Thing {
	// constant
	// final is constant
	// if final, cannot reassign
	public final static int LUCKY_NUMBER = 7;
	// after creating the value, cannot reassign it

	public static int count = 0;
	
	//id is set to 0
	//id will be unique to each object
	public int id;

	public Thing() {
		// count belongs to thing not object
		//keeps record of what count was
		id = count;
		count++;
	}

	public String name;
	// static varibles only belongs to class\
	// one copy, one class
	public static String description;

	// instances method that will print name
	public void showName() {
		// instances methods can access static data
		System.out.println("Object id: " + id + ", " + description + ":" + name);
	}

	// static method that prints hello
	public static void showInfo() {
		System.out.println(description);
		// static methods cannot output instances variables
//		System.out.println(name); (wont work)
	}

	// static methods can access static data because both belong to class

}

public class App {

	public static void main(String[] args) {

		Thing.description = "I am a thing ";

//		System.out.println(Thing.description);

		// runs static method
		Thing.showInfo();

		System.out.println("Before creating objects: " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		// after creating objects it counts by incrementing
		// count can help with assigning values
		System.out.println("After creating objects: " + Thing.count);

		thing1.name = "bob";
		thing2.name = "kevin";

//		System.out.println(thing1.name);
//		System.out.println(thing2.name);

		thing1.showName();
		thing2.showName();

		// accessing constant
		// PI is constant/unchangable
		// constant values are represented as Uppercase letter
		System.out.println(Math.PI);

		// achieing constant
		System.out.println(Thing.LUCKY_NUMBER);

	}

}
