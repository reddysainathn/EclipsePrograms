package iterators;

import java.util.Iterator;
import java.util.LinkedList;

public class Iteratorss {

	// In LinkedList we can use remove in middle as well,It is better to use for an Iterator
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> animals = new LinkedList<String>();

		animals.add("Fox");
		animals.add("Cat");
		animals.add("Dog");
		animals.add("Rabbit");

		// http://docs.oracle.com/javase/7/docs/api/java/lang/Iterable.html
		// Before JAVA 5
		Iterator<String> it = animals.iterator();

		// If we want to remove an item from list we have to use Iterator,we can't use for loop ,Exception raised ConcurrentModificationException
		// hasNext() will tell if there is an other Item in the list
		while (it.hasNext()) {

			// next() will point to the next item in the list
			String value = it.next();

			System.out.println(value);

			if (value.equals("Cat")) {
				it.remove();
			}
		}
		
		System.out.println();
		// /Modern Iteration ,Post JAVA5 and later

		for (String animal : animals) {
			System.out.println(animal);
			// Exception raised ConcurrentModificationException
			// animal.remove();
		}

	}

}
