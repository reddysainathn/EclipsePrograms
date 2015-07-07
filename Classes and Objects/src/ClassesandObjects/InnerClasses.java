package ClassesandObjects;

/*
 * There should be only one Public class 
 */
public class InnerClasses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InnerClassRobot robot1 = new InnerClassRobot(7);
		robot1.start();
		
		//Creating inner class object when it is public  only
		//InnerClassRobot.Brain brain = robot1.new Brain();
		//brain.think();
		
		InnerClassRobot.Battery battery = new InnerClassRobot.Battery();
		battery.charge();
	}

}
