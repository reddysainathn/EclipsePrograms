//Abstract Classes are used to create class hierarchy
//A class that is declared with abstract keyword, is known as abstract class in java. It can have abstract and non-abstract methods 
//It is a a process of hiding the implementation details and showing only functionality to the user
//An abstract class can have data member, abstract method, method body, constructor and even main() method.
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
