
//Inheritance in java is a mechanism in which one object acquires all the properties and behaviors of parent object.
//for method overloading and code reusability we use Inheritance

class Employee {
	float salary = 40000;
}

public class Inheritance extends Employee {
	int bonus = 10000;

	public static void main(String args[]) {
		Inheritance p = new Inheritance();
		System.out.println(p.salary);
		System.out.println(p.bonus);
	}
}