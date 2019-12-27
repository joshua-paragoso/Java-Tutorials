import java.util.*;
class Animal{
	
}
//generic class is a class that can work with other objects 
//can specify what type this object works with
public class App {

	public static void main(String[] args) {
		
		//array list manages an array internally
		////Before java 5///////////////////
		ArrayList list = new ArrayList();
		
		list.add("apple");
		list.add("banana");
		list.add("orange");
		
		//get an item from list
		String fruit = (String)list.get(2);
		
		System.out.println(fruit);
		
		//Mordern style//////
		//Generic: if you have a class that works
		//with some particular type of objects, then you
		//can specify using objects
		
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("cat");
		strings.add("dog");
		strings.add("duck");
		
		//get an item from list
		String animal = strings.get(1);
		
		System.out.println(animal);
		
		////There can be more than one type arguement///
		//hashMap
		
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		
		////////java 7 style////////////////
		//java 7 misses out the second type of declaration
		//works with any type of class
		ArrayList<Animal> someList = new ArrayList<>();
	}

}
