

//Car is derived from machine.
//It is inheritance
public class Car extends Machine{

	
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car Started .");

	}

	
	public void carInfo(){
		System.out.println("Car name:" +name);
	}
	public void wipeWindSheild(){
		System.out.println("Wiping Wind Sheild");
	}
	
}
