package ClassesandObjects;

class Frogs {
	private int id;
	private String name;

	public Frogs(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public String toString() {

		return String.format("%-4d: %s", id, name);
		// Efficient way
		/*
		 * StringBuilder sb = new StringBuilder();
		 * sb.append(id).append(" : ").append(name); return sb.toString();
		 */

		// Inefficient
		// return id+"; "+name;
	}

}

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frogs frog1 = new Frogs(7, "Bob");
		System.out.println(frog1);
		Frogs frog2 = new Frogs(5, "Roger");
		System.out.println(frog2);
	}

}
