//Abstract Classes are used to create class hierarchy,but bas clas adds base for the classes
public class AbstractClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Camera cam1 = new Camera();
		cam1.setId(5);

		Car car1 = new Car();
		car1.setId(4);

		// Machine machine1 = new Machine();

		car1.run();
		cam1.run();
	}

}
