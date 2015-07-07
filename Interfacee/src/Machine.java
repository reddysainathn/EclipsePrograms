//A class can have any number of interfaces 
//A class can extend only one class 
public class Machine implements Info {
	private int id = 7;

	public void start() {
		System.out.println("Machine Started!");
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub

		System.out.println("machine Id is :" + id);

	}
}
