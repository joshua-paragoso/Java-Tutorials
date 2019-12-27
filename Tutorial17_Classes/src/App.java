
//template for creating objects
// represents a person
class Person {
	//Instances variables (data or states)
	// represents data that you want to attach to object
	
	String name;
	int age;
	//classes can contain
	//1. data
	//2. Subroutines
}
public class App {

	public static void main(String[] args) {
		
	 Person person1 = new Person();
	 person1.name = "josh paragoso";
	 person1.age = 24;
	 
	 Person person2 = new Person();
	 person2.name = "jak paragoso";
	 person2.age = 12;
	 
	 System.out.println(person1.name);
	}

}
