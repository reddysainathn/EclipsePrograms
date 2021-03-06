package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setss {
	public static void main(String[] args) {
		// A set is a kind of collection that stores only Unique elements
		// hashSet does not retain(Maintain) Order
		// Set<String> set1 = new HashSet<String>();

		// LinkedHashSet remebers the order of items we added in.

		// Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet Will add elements in natural order.
		// For Strings the natuaral order is alphabatical order.

		Set<String> set1 = new TreeSet<String>();
		if (set1.isEmpty()) {
			System.out.println("Set is Empty at start");
		}
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		// Adding duplicate items does nothing

		set1.add("mouse");

		System.out.println(set1);

		// ////////Iteration////////////////

		for (String element : set1) {
			System.out.println(element);
		}

		// //////////////////Does set contain a given
		// item?//////////////////////
		if (set1.contains("aadvack")) {
			System.out.println("contains aadvack");
		}
		if (set1.contains("cat")) {
			System.out.println("contains cat");
		}

		if (set1.isEmpty()) {
			System.out.println("Set is empty after adding");
		}

		// /////////////////////////Intersection//////////////////////////////
		// set2 contains some common elements with set1 and some new.
		Set<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffee");
		set2.add("monkey");
		set2.add("ant");

		// Below Statement does a copy of set1

		Set<String> intersection = new HashSet<String>(set1);

		System.out.println("copying set1 elements");
		System.out.println(intersection);
		System.out.println();

		System.out.println("Intersection:Finding same Elements");
		intersection.retainAll(set2);

		System.out.println(intersection);

		// //////////////////Difference//////////////////////////

		Set<String> difference = new HashSet<String>(set2);

		difference.removeAll(set1);
		System.out.println();
		System.out
				.println("Difference:finding elements which are not present in set1 but present in set2");
		System.out.println(difference);

	}
}
