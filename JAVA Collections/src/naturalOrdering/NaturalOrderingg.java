package naturalOrdering;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

//To find natural order ,We shoulld implement comparable
class Person implements Comparable<Person> {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public String toString() {
		return name;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

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

	@Override
	public int compareTo(Person person) {

		// To compare with lenght of string
		int len1 = name.length();
		int len2 = person.name.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			//If we return 0,the compareTo and equals() method conflict when we use TreeSet(If the both strings have same length,it will return only one)
			//So,we use return name.compareTo(person.name);
			//
			//return 0;
			return name.compareTo(person.name);
		}
		// //To get in aplhabetical order
		// return name.compareTo(person.name);

		// To get in reverse aplhabetical order
		// return -name.compareTo(person.name);
	}
}

public class NaturalOrderingg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();

		// Treeset stores the elements in sorted natural order
		SortedSet<String> set = new TreeSet<String>();

		System.out.println("Adding Elements and showing them to the list");

		addElements(list);
		// It will sort List
		Collections.sort(list);

		showElements(list);

		System.out.println();
		System.out.println("Adding Elements and showing them to the set");
		addElements(set);
		showElements(set);

		System.out.println();

		List<Person> list1 = new ArrayList<Person>();

		SortedSet<Person> set1 = new TreeSet<Person>();

		System.out.println("Adding Elements and showing them to the list");

		addElement(list1);
		// It will sort List
		Collections.sort(list1);

		showElement(list1);

		System.out.println();
		System.out.println("Adding Elements and showing them to the set");
		addElement(set1);
		showElement(set1);

	}

	private static void addElements(Collection<String> collection) {

		collection.add("Joe");
		collection.add("Sue");
		collection.add("Juliet");
		collection.add("Clare");
		collection.add("Mike");

	}

	private static void showElements(Collection<String> collection) {

		for (String element : collection) {
			System.out.println(element);
		}

	}

	private static void addElement(Collection<Person> collection) {

		collection.add(new Person("Joe"));
		collection.add(new Person("Sue"));
		collection.add(new Person("Juliet"));
		collection.add(new Person("Clare"));
		collection.add(new Person("Mike"));

	}

	private static void showElement(Collection<Person> collection) {

		for (Person element : collection) {
			System.out.println(element);
		}

	}
}
