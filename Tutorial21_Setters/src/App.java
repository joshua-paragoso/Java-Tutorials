//Setters a set methods
class Frog {
String name;
int age;

	// this.name refers to String name not parameter name
	public void setName(String name) {
		this.name = name;
	}

	// this.name refers to int age not parameter age
	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1 = new Frog();

		// setting name and age
		frog1.name = "Jake";
		frog1.age = 1;

		System.out.println("Initial Name: " + frog1.getName());
		System.out.println("Initial age: " + frog1.getAge());
		// encapsulation: hiding the instances variables
		// calls a method to set name to new variable
		frog1.setName("Jap");
		frog1.setAge(2);

		System.out.println("New name: " + frog1.getName());
		System.out.println("New age: " + frog1.getAge());
	}

}
