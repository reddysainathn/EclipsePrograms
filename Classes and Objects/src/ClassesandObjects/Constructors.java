package ClassesandObjects;

//Constructor is a special method which runs every time we create an instance
//Constructor doesn't have a return type
class Machine {
	private String name;
	private int code;

	public Machine() {
		this("Arinie",0);
		System.out.println("Contructor Running!");
		name = "Arnie";
	}

	public Machine(String name) {
		this(name,0);
		System.out.println("Second Constructor Running! ");
		this.name = name;
	}
	public Machine(String name,int code){
		
	System.out.println("Third Constructor Running!");
		this.code=code;
		this.name=name;
	}
}

public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machine1 = new Machine();
		
		// It can create a new Object
		
		//new Machine();
		
		//Machine machine2 = new Machine("Bertie");
		
		//Machine machine3 = new Machine("Chalky",7);
	}

}
