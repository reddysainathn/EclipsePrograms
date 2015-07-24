import java.util.ArrayList;

class Machine {

	@Override
	public String toString() {
		return "I am a Machine";
	}

	public void start() {
		System.out.println("Machine Started !");

	}
}

class Camera extends Machine {
	@Override
	public String toString() {
		return "I am a Camera";
	}

	public void snap() {
		System.out.println("Photo Snapping.");
	}
}

public class GenericsAndWildCards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();

		list.add("One");
		list.add("Two");
		showList(list);

		ArrayList<Machine> machine = new ArrayList<Machine>();

		machine.add(new Machine());
		machine.add(new Machine());
		showMachine(machine);

		ArrayList<Camera> machine1 = new ArrayList<Camera>();

		machine1.add(new Camera());
		machine1.add(new Camera());
		showMachine1(machine1);
		showMachine2(machine1);

	}

	public static void showList(ArrayList<String> list) {
		for (String value : list) {
			System.out.println(value);
		}

	}

	public static void showMachine(ArrayList<Machine> machine) {
		System.out.println("I am a Machine");
		System.out.println();
		for (Machine mach : machine) {
			System.out.println(mach);
		}

	}

	// using Wild-Card
	// using Upcasting

	public static void showMachine1(ArrayList<? extends Machine> machine1) {
		System.out.println("I am at camera");
		System.out.println();
		for (Object mach : machine1) {
			System.out.println(mach);

		}
		for (Machine mach1 : machine1) {
			mach1.start();
			// Doesn't Work
			// mach1.snap();
		}

	}

	// using Downcasting
	public static void showMachine2(ArrayList<? super Camera> machine1) {
		System.out.println();
		for (Object mach : machine1) {
			System.out.println(mach);
		}

	}

}
