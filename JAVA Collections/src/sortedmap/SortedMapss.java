package sortedmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

public class SortedMapss {
	public static void main(String[] args) {
		// We get HashCode for Temp()
		System.out.println(new Temp());
		// HashMap does not maintain particular order for keys and values so ,we
		// move to other Framework Collections
		// Map is the Upper-class for Hashmap,LinkedhashMap,TreeMap

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		// To keep Keys and values in Order we use LinkedHashMap and TreeMap

		LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();

		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();

		// No guarantee on HashMap
		testMap(hashmap);

		
		System.out
				.println("LinkedHashMap Will print the exact order we gave at Input");
		// LinkedHashMap Will print the exact order we gave at Input
		testMap(linkedhashmap);
		
		System.out.println("TreeMap will sort the keys in the Natural order");
		// TreeMap will sort the keys in the Natural order
		testMap(treemap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "Fox");
		map.put(4, "Cat");
		map.put(8, "Dog");
		map.put(1, "Giraffee");
		map.put(0, "Swan");
		map.put(15, "Bear");
		map.put(6, "Snake");

		for (Integer key : map.keySet()) {
			String Value = map.get(key);
			System.out.println(key + ":" + Value);
		}
	}
}
