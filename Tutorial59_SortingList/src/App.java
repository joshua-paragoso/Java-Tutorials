import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//sort list other than natural order
//create a class that implements the comparator interface

class StringLengthComparator implements Comparator<String> {

	// compares two sepereate inputs from list at a time
	@Override
	public int compare(String s1, String s2) {
		// if s1 = s2 returns 0
		// if s1 > s2 returns 1
		// if s1 < s2 returns -1

		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}

}

class AlphabeticalComparator implements Comparator<String> {

	// compares two sepereate inputs from list at a time
	@Override
	public int compare(String s1, String s2) {
		// compareTo is a method of the comparaiable interface
		return s1.compareTo(s2);
	}

}

class ReverseAlphabeticalComparator implements Comparator<String> {

	// compares two sepereate inputs from list at a time
	@Override
	public int compare(String s1, String s2) {
		// compareTo is a method of the comparaiable interface
		return -s1.compareTo(s2);
	}

}



//Sorting list in java
//how to sort list using compariables
public class App {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();

		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");

		// to sort in alphabetic order
		// use a static method from collection class
		Collections.sort(animals);
		System.out.println("Alphabetical order");
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
/////////this will sort based on string length///////////////////////
		Collections.sort(animals, new StringLengthComparator());
		System.out.println("Length size order");
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
/////////sort based on alphabetical compare/////////////////
		Collections.sort(animals, new AlphabeticalComparator());
		System.out.println("Alphabetical order 2");
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println();
//////////sort based on reverse alphabetical///////////////

		Collections.sort(animals, new ReverseAlphabeticalComparator());
		System.out.println("Reverse Alphabetical order");
		for (String animal : animals) {
			System.out.println(animal);
		}

		System.out.println();
		
/////////// sorting a list of integers/doubles////////////////////
		// its basically the same

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(10);
		numbers.add(1);
		numbers.add(832);
		numbers.add(34);

		Collections.sort(numbers, new Comparator<Integer>() {
			public int compare(Integer num1, Integer num2) {
				return num1.compareTo(num2);			}
		});

		for (int num : numbers) {
			System.out.println(num);
		}
	}

}
