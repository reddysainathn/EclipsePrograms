package ClassesandObjects;

class Robot {
	// Passing a Parameter to the method.
	// Parameter is like a variable passed in a method.
	// parameter can be changed.
	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumping :" + height);
	}

	public void move(String direction, double distance) {
		System.out.println("Moving " + distance + " meters in direction "
				+ direction);
	}
}

public class MethodParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot sam = new Robot();
		sam.speak("Hi I am SAM.");
		sam.jump(7);
		sam.move("NORTH", 12.2);
		//greeting is just a label to refer text variable in speak method
		String greeting = "Hello There";
		sam.speak(greeting);
		int value = 14;
		sam.jump(value);
	}

}
