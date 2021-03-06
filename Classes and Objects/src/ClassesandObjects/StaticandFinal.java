package ClassesandObjects;

class Thing {
	// final is a JAVA version of Constant declaring,and we can't change it

	public final static int LUCKY_NUMBER = 7;
	public String name;
	// Static member variables belongs to class,and there is only one copy
	// because of only one class(Associated with class,so its called class
	// variables)
	public static String description;

	public static int count = 0;
	public int id;

	public Thing() {
		id = count;
		count++;
	}

	public void showName() {
		System.out.println("Object ID is : " + id + "," + description + " : "
				+ name);
	}

	public static void showInfo() {
		System.out.println("Hello");
		// Wont Work:System.out.println(name);

	}
}

public class StaticandFinal {
	public static void main(String[] args) {
		System.out.println("Before creating objects,Count is :" + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		Thing.description = "I am a thing";
		System.out.println(Thing.description);

		thing1.name = "Bob";
		thing2.name = "Sue";

		System.out.println(thing1.name);
		System.out.println(thing2.name);

		System.out.println("After creating objects,Count is :" + Thing.count);

		thing1.showName();
		thing2.showName();

		// Static method is called by the class name and method
		Thing.showInfo();
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);
	}
}
