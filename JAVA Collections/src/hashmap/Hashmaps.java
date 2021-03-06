package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		// insert Key and element using put
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(2, "Two");

		map.put(6, "Hello");

		// We use get to get the output using the relative key of the element

		// Using Douplicate key ,it will override the previous key
		String text = map.get(6);

		System.out.println(map);

		System.out.println(text);

		// To get all keys and values

		for (Map.Entry<Integer, String> entry : map.entrySet()) {

			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key :" + key + " Value :" + value);

		}

	}
}
