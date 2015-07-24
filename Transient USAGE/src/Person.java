import java.io.Serializable;

public class Person implements Serializable {

	/**
	 * serialVersionUID is a check,whether we can Serializable and
	 * de-Serializable of the Object or class is dones with same code or not
	 */
	private static final long serialVersionUID = 754373431707330964L;
	// By using transient keyword,the elements are not involved in Serializable
	private transient int id;
	private String name;

	// Static fields are not Serializable ,because there is no need to
	// Serializable for static fields
	private static int count;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Person.count = count;
	}

	public Person() {
		System.out.println("Default Constructor");
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;

		System.out.println("Two-argument constructor");
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
		return "Person [id=" + id + ", name=" + name + "] Count is :" + count;
	}

}
