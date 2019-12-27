package demo1;

//handling exceptions
//error handling mechanism
import java.io.*;

public class App {

	public static void main(String[] args) throws FileNotFoundException {

		File filename = new File("test.txt");

		// file reader object
		// gives an error because test.txt doesnt exist
		FileReader filereader = new FileReader(filename);
	}
}
