
//reading files from java using file reader
//old way of reading files
//scanner is better though
//good to learn though
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App {

	public static void main(String[] args) {

		// file represents file
		File file = new File("test2.trc");
		BufferedReader buffRead = null;
		
		// file reader reads file
		try {
			FileReader fileReader = new FileReader(file);
			// save up the chars that we read from the file
			buffRead = new BufferedReader(fileReader);
			//NOTE: Need to close bufferReader
			String line;
			
			//reads through the entire file
			while ((line = buffRead.readLine()) != null) {
				System.out.println(line);
			}
			

		//catches exception when file not found
		} catch (FileNotFoundException e) {
			System.out.println("File not found " + file.toString());
		}
		//catches exception when file could not be read
		  catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
		//finally is always going to be executed
		finally {
			
		try {
			buffRead.close();
		}catch(IOException e) {
			System.out.println("Unable to close file " + file.toString());
		}
		catch(NullPointerException ex) {
			//Fill was probably never opened
		}
		}
		
		
	}

}
