
//template for creating objects
// represents a person
class Person {
	// Instances variables (data or states) represents data that you want to attach to object

	String name;
	int age;

	// classes can contain

	// 1. data
	// 2. Subroutines (methods)

	// methods should have first letter lower case
	void speak() {
		for (int i = 0; i < 3; i++) {
			System.out.println("My name is " + name + " and I am " + age + " years old");
		}
	}
	
	void sayHello() {
		System.out.println("Hello there!");
	}
}

public class App {

	public static void main(String[] args) {

		// create a person object using the person class
		Person person1 = new Person();
		person1.name = "josh paragoso";
		person1.age = 24;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();
		person2.name = "jak paragoso";
		person2.age = 12;
		person2.speak();
		person2.sayHello();
		
		System.out.println(person1.name);
	}

}
