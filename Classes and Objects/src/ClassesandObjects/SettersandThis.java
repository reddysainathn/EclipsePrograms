package ClassesandObjects;

class Frog {
	// We use private to Encapsulate
	private String name;
	private int age;

	// Setters are also called Mutators
	// using this keyword
	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setInfo(String name, int age) {
		setName(name);
		setAge(age);
	}
}

public class SettersandThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog frog1 = new Frog();
		// private can't access the parameters directly,so we use setter
		// frog1.name="Bertie";
		// frog1.age=1;
		frog1.setAge(1);
		frog1.setName("Bertie");
		System.out.println("My name is :" + frog1.getName());
		System.out.println("My age is :" + frog1.getAge());

	}

}
