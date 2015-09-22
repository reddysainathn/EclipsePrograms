//Encapsulation in java is a process of wrapping code and data together into a single unit
//By providing setters and getters  provides you the control over the data
class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Hello");
		System.out.println(s.getName());
	}
}