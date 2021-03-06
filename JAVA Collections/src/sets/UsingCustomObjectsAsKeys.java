package sets;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person {
	private int id;
	private String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "{ID is :" + id + " And Name is  : "+ name +"}";
	}

	
	// HashCode will generate an individual ID for different Objects and same ID for same objects
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	//equals method will return equal if two objects are same and false if not same
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

public class UsingCustomObjectsAsKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//////////////using Custom Objects as keys
		Person p1 = new Person(0, "Bob");
		Person p2 = new Person(1, "Sue");
		Person p3 = new Person(2, "Mike");
		// p2 is same as p4
		Person p4 = new Person(1, "Sue");

		Map<Person, Integer> map = new LinkedHashMap<Person, Integer>();

		map.put(p1, 1);
		map.put(p2, 2);
		map.put(p3, 3);
		map.put(p4, 1);

		
		
		for (Person key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));

		}
		Set<Person> set = new LinkedHashSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);

		System.out.println(set);

		///////////Using LinkedHashMap and LinkeddHashSet 
		/*Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		// Keys are always Unique
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		for (String key : map.keySet()) {
			System.out.println(key + ":" + map.get(key));

		}
		Set<String> set = new LinkedHashSet<String>();
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("cat");

		System.out.println(set);
        */
	}

}
