//reading text file using scanner
import java.io.*;
import java.util.Scanner;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
	
		String filename = "/Users/joshypuu/Desktop/example3.rtf";
	
		File textfile = new File(filename);
		
		Scanner input = new Scanner(textfile);
		
//		//reads in number
//		int value = input.nextInt();
//		System.out.println("Read value: " + value);
		input.nextLine();
		//reads in string
		int count = 1;
		while(input.hasNextLine()) {
		
			String line = input.nextLine();
			System.out.println(count + ": " + line);
			count++;
		}
		input.close();
	}

}
