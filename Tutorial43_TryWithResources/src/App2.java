import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//how this works with files
public class App2 {
//command + shift + o for implements imports
	public static void main(String[] args) {
		File file = new File("test.txt");
		
//		FileReader fr = new FileReader(file);
		//this is way better than how we did it in App2 in Tutorial 42
		//only works in java 7
		//much much better
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Cant find file " + file.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
		
	}

}
