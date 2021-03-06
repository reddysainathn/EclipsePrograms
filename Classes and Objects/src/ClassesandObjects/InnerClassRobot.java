package ClassesandObjects;

public class InnerClassRobot {

	private int id;

	// This is a Nested-Class
	// Inner-classes used for Grouping
	// We can't access in main program with private keyword in inner-class
	private class Brain {

		// public class Brain {
		public void think() {
			System.out.println("Robot " + id + " is thinking.");
		}
	}

	// Static class can only include static Primitive types

	// Static classes are used to Group with other classes
	public static class Battery {
		public void charge() {
			System.out.println("Battery Charging......");
		}
	}

	public InnerClassRobot(int id) {
		super();
		this.id = id;
	}

	public void start() {
		System.out.println("Starting Robot :" + id);

		Brain brain = new Brain();
		brain.think();

		final String name = "Robot";

		// This class can be used only in this method,

		class Temp {
			public void doSomething() {
				System.out.println("ID is :" + id);
				System.out.println("My name is :" + name);

			}
		}
		Temp temp = new Temp();
		temp.doSomething();
	}
}
