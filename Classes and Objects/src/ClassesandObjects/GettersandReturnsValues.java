package ClassesandObjects;

class Personss {
	// Instance variables(data or "State")
	String name;
	int age;

	// classes can contain

	// 1.Data
	// 2.Subroutines(Methods)
	// void does not return anything

	void speak() {

		System.out.println("Hello");

		System.out.println("My Name is : " + name + " And I am " + age
				+ " Years Old");

	}

	void sayHello() {
		System.out.println("Hello There");
	}

	int calculateYearsofRetirement() {
		int yearsLeft = 65 - age;
		// System.out.println("Years Left :" + yearsLeft);
		return yearsLeft;
	}

	int getAge() {
		return age;
	}

	String getName() {
		return name;
	}
}

public class GettersandReturnsValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personss person1 = new Personss();
		person1.name = "Joe Blogs";
		person1.age = 37;
		// person1.speak();
		int years = person1.calculateYearsofRetirement();
		System.out.println("Years Left till Retirement: " + years);
		int age = person1.getAge();
		System.out.println("My age is : " + age);
		String name = person1.name;
		System.out.println("My name is : " + name);
	}

}
