//passing parameters to methods

class Robot{
	//speak receives string in parameter
	public void speak(String word) {
		System.out.println(word);
	}
	//jump recevies a int
	public void jump(int height) {
		System.out.println("Jumping: " + height);
	}
	//move recevies multiple parameters
	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " miles due " + direction);
	}
}
public class App {

	public static void main(String[] args) {
	 
	 //create new robot object
	 Robot sam = new Robot();
	 
	 //sam passes message to speak
	 sam.speak("Hi im sam.");
	 sam.jump(7);
     //when deaign with multiple parameters, separate by commas
	 sam.move("West",12.2);
	 
	 //creating a string variable
	 String greeting = "Hello there";
	 //passing varaible to speak
	 sam.speak(greeting);
	 
	 int value = 14;
	 sam.jump(value);

	}

}
