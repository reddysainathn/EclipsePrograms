public class Person implements Info {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	public void greet() {
		System.out.println("Hello Sir");

	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("person name is " + name);

	}
}
