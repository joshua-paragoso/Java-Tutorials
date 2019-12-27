import java.util.Iterator;
import java.util.LinkedList;

//using iterators at the iterable interface
public class App {

	public static void main(String[] args) {

		LinkedList<String> animals = new LinkedList<String>();

		animals.add("Frog");
		animals.add("Cat");
		animals.add("Chicke");

		/////////////////////////////////////////////
		// pre java 5 using iterator
		// iterable object
		Iterator<String> it = animals.iterator();
		
		//while loop prints out items based on if it has a nexted object
		while (it.hasNext()) {
			String value = it.next();
			// will print out the first input of linked
			System.out.println(value);
			// when you call next, it will move on to the next item
			
			//removes items from linked list
			if(value.equals("Cat")) {
				it.remove();
			}
		}
		System.out.println();
		/////////////////////////////////////////////////
		// modern iteration, post java 5
		//for each uses iterators behind the scenes
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		//if you want to remove items from list while iterating
        //you have to use iterator 
	}

}
