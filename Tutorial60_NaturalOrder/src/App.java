import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	//hashcode developes this
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//returns true if names are equal
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	//IMPORTANT: MAKE SURE THAT EQUALTO & COMPARETO ARE EQUALING THE SAME THING
	//this works like the compare method in comparable interface
	//return -1 if  person1 is less than name
	//return 1 if person1 id greater than name
	//return 0 if person1 and name are equal
	@Override 
	public int compareTo(Person person1) {
//		return this.name.compareTo(person1.name);
		//now we want to sort numerically by length
		int len1 = name.length();
		int len2 = person1.name.length();
		
		if(len1 > len2) {
			return 1;
		}else if(len1 < len2){
			return -1;
		}else {
			return 0;
		}
	}

}

//natural  order
//sorting arrays
//tree sets
//tree order
//define your own natural order
public class App {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>();
//		
//		//numerical order
//		
//		//SortedSet
//		//store it in natural order
//		SortedSet<String> set = new TreeSet<String>();

		//Now were gonna sort our own object
		List<Person> list = new ArrayList<Person>();
		SortedSet<Person> set = new TreeSet<Person>();

		addElements(list);
		addElements(set);

		// sorts in alphabetical order
		//since person is not a defined object, sort wont work
//		Collections.sort(list);
		
		//in order to sort object, you need to define natural order

		showElements(list);
		System.out.println();
		showElements(set);

	}

	// for parameter if you dont know if youre using list or set
	// use collection type
	private static void addElements(Collection<Person> col) {
		col.add(new Person("j"));
		col.add(new Person("su"));
		col.add(new Person("jak"));
		col.add(new Person("jake"));
		col.add(new Person("sully"));

	}

	// display elements
	private static void showElements(Collection<Person> col) {
		for (Person element : col) {
			System.out.println(element);
		}
	}
}
