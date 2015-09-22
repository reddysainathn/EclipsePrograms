//It contains only unique elements.
//It may have not have any null key or value.
//It is synchronized.

package hashTable;

import java.util.*;

public class HashTablee {
	public static void main(String args[]) {

		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();

		hm.put(100, "Amit");
		hm.put(102, "Ravi");
		hm.put(101, "Vijay");
		hm.put(103, "Rahul");

		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}