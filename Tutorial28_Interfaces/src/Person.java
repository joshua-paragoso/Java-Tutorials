
public class Person implements Info {

	private String name;

	// constructor to set name
	public Person(String name) {
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello there");
	}

	//added method form Info
	public void showInfo() {
		System.out.println("Persons name is " + name);
	}
}
