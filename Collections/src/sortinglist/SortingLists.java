package sortinglist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}
}

class StringLenghtComparator implements Comparator<String> {
	// If two strings are equal it will return +1
	// If two strings are not equal it will return -1
	@Override
	public int compare(String s1, String s2) {

		int len1 = s1.length();
		int len2 = s2.length();
		if (len1 > len2) {
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			return 0;

		}
	}

}

class AlphabeticalOrderComparator implements Comparator<String> {
	// If one string is alphabetically higher it will return +1
	// If one string is alphabetically not higher it will return +1
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);

	}

}

class ReverseAlphabeticalOrderComparator implements Comparator<String> {
	// If one string is reverse alphabetically higher it will return +1
	// If one string is reverse alphabetically not higher it will return +1
	@Override
	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);

	}

}

public class SortingLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals = new ArrayList<String>();
		animals.add("tiger");
		animals.add("lion");
		animals.add("cat");
		animals.add("snake");
		animals.add("mangoose");
		animals.add("elephant");

		// ///////////////////Sorting Strings///////////////////////////////////

		// Sorting the animals
		// Collections.sort(animals, new StringLenghtComparator());

		// AlphabeticalOrder
		// Collections.sort(animals, new AlphabeticalOrderComparator());

		// Reverse AlphabeticalOrder
		Collections.sort(animals, new ReverseAlphabeticalOrderComparator());

		for (String animal : animals) {
			System.out.println(animal);
		}

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);

		// ///////////////////Sorting Numbers///////////////////////////////////

		// Sorting numbers
		// Collections.sort(numbers);
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub

				// For ascending order of numbers
				return num1.compareTo(num2);

				// For descending order of numbers we add negative sign to num1
				// return -num1.compareTo(num2);

			}
		});
		System.out.println("Sorting Numbers in Natural order");
		for (Integer number : numbers) {
			System.out.println(number);
		}

		// ////////////Sorting Arbitrary objects///////////////////

		List<Person> people = new ArrayList<Person>();
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Bob"));
		people.add(new Person(4, "Clare"));
		people.add(new Person(2, "Sue"));

		// sort in order of ID

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		System.out.println("Sorting Arbitrary Objects with ID \n");

		for (Person person : people) {
			System.out.println(person);
		}

		// sort in order of name

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				return p1.getName().compareTo(p2.getName());
			}

		});

		System.out.println("Sorting Arbitrary Objects with name\n");

		for (Person person : people) {
			System.out.println(person);
		}
	}

}
