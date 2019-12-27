//String bufffer and string formatting
public class App {

	public static void main(String[] args) {
		
		//info set to empty string
		String info = "";
		
		//creating a new string and reassigning the info variable
		//not changing the original, just creating a new variable
		//this is inefficient
		info += "My name is josh";
		info += " ";
		info += " I am a builder";
		
		System.out.println(info);
		
		StringBuilder sb = new StringBuilder("");
		
		//apppending string
		//this is more efficient than the last method
		//append returns a reference
		sb.append("My name is jo");
		sb.append(" ");
		sb.append("I am a lion tamer");
		
		//getting text back
		System.out.println(sb.toString());
		
		//shortcut for append
		StringBuilder s = new StringBuilder("");
		s.append("My name is jake").append(" ").append("I am a sky diver");
		
		System.out.println(s.toString());
		
		//advance string
		//formating///////////////////////////////////////////
		System.out.println("Here is some text.\t that was a tab. \nthat is a new line ");
		//for quick way to print out system.out.print, type sysout then press ctrl + space
		System.out.println();
		
		System.out.println("More text");
		
		//printf doesnt print a new line
		System.out.printf("Total cost: %d",5);
	}

}
