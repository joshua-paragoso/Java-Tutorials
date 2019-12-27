package demo3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		try {
			openFile();
			//if youre throwing your exception in openFile
			//you can catch in main
		} catch (FileNotFoundException e) {
			//This message is too vague
			System.out.println("Couldnt open file");
		}

	}

	// openfile throws exception instead of main
	public static void openFile() throws FileNotFoundException {
		File filename = new File("test.txt");
		FileReader filereader = new FileReader(filename);
	}
}