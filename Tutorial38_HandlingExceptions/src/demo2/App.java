package demo2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws FileNotFoundException {

		File filename = new File("test.txt");
		// try to do this code
		// if it throws an exception
		// catch code is executed
		// no code doesnt throw exception
		// it will continue on
		try {
			FileReader filereader = new FileReader(filename);

			// This will not be executed if an exception is thrown
			System.out.println("File is found: " + filename.toString());
		}
		// you can put whatever code you want
		// Dont always net the e.printStackTrace
		catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("File not found: " + filename.toString());
		}
		System.out.println("Finished");
	}

}
