package ClassesandObjects;

class Persons {
	// Instance variables(data or "State")
	String name;
	int age;

	// classes can contain

	// 1.Data
	// 2.Subroutines(Methods)
	void speak() {

		System.out.println("Hello");
		for (int i = 0; i < 3; i++) {
			System.out.println("My Name is : " + name + " And I am " + age
					+ " Years Old");
		}
	}

	void sayHello() {
		System.out.println("Hello There");
	}
}

public class ClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("Hello  There");
		Persons person1 = new Persons();
		person1.name = "Joe Blogs";
		person1.age = 37;
		/*
		 * System.out.println(person1.name); System.out.println(person1.age);
		 * System.out.println("Speak Called");
		 */
		person1.speak();
		person1.sayHello();
		Persons person2 = new Persons();
		person2.name = "Sarah James";
		person2.age = 20;
		/*
		 * System.out.println(person2.name); System.out.println(person2.age);
		 * System.out.println("Speak Called Again");
		 */
		person2.speak();

	}

}
