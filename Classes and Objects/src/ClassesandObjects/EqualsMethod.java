package ClassesandObjects;

/*
 * Equals method compares meaning (Preferable)
 * == compare if it contain same object or not
 */
class Persns {
	private int id;
	private String name;

	public Persns(int id, String name) {

		this.id = id;
		this.name = name;

	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	// Hash-codes are Unique ID's for an Object
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	// this method for Equals Compares two objects
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persns other = (Persns) obj;
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

public class EqualsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// OUTPUT::::java.lang.Object@61e717c2
		// Here java.lang.Object is the class with library
		// 61e717c2 is a memory address or hash-code of the object

		System.out.println(new Object());

		Persns person1 = new Persns(5, "Bob");
		Persns person2 = new Persns(5, "Bob");
		Persns person3 = new Persns(7, "Sen");

		System.out.println(person1.toString());

		// Checking whether the pointing is to same Object or not
		System.out.println(person1 == person2);

		System.out.println(person1.equals(person2));
		System.out.println(person1.equals(person3));

		Double value1 = 7.2;
		Double value2 = 7.2;
		System.out.println(value1 == value2);
		System.out.println("Using Equals in int");
		System.out.println(value1.equals(value2));

		System.out.println();

		Integer number1 = 6;
		Integer number2 = 6;
		System.out.println(number1 == number2);
		System.out.println("using Equals in Double");
		System.out.println(number1.equals(number2));

		System.out.println();

		String text1 = "Hello";
		String text2 = "Hellojdsjkhd".substring(0, 5);
		System.out.println(text2);
		System.out.println(text1 == text2);
		System.out.println("Using Equals Methos in String");
		System.out.println(text1.equals(text2));

	}

}
