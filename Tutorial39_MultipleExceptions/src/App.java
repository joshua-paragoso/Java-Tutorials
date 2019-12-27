import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

//throwing multiple excpetions from a methiod
//handling mutliple exceptions
public class App {

	// now it adds the exceptions from test.java
//	public static void main(String[] args) throws IOException, ParseException {
	public static void main(String[] args) {
		test test = new test();
//		try {
//			test.run();
//		} //whatever exception you have, it will 
//		//execute the approriate exceptuon
//		//will execute specific excetion
//		//will match the the actual exception
//		//thats beign thrown
//			catch (IOException e) {
//			e.printStackTrace();
//		} catch (ParseException e) {
//			System.out.println("Couldnt parse command file");
//		}

//		// single catch block but lists the two different exceptions
//		//can handle multiple exceptions in one catch block
//		try {
//			test.run();
//		} catch (IOException | ParseException e) {
//			e.printStackTrace();
//		}

		// pass a child class where a parent class is expected

		try {
			test.run();
		}
		// will catch any exception with a parent class
		// can use any child class
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			test.input();
			//we need fileNotException first 
			//will cause confusion with IO
			//if we ran IOExceptionfirst it will not
			//reach FileNotException
			//Always know that your handle child exception firs
			//before your handle parent exception
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
