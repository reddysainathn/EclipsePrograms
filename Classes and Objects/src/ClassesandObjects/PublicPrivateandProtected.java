package ClassesandObjects;

/*
 * Private --- only within same classs
 * Public --- from anywhere
 * Protected --- subclass,and same package
 * no modifier ---  same package only
 */

import publicPrivateandProtected.Plant;

public class PublicPrivateandProtected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Plant plant = new Plant();

		System.out.println(plant.name);
		System.out.println(plant.ID);

		// Wont work, type is private
		// System.out.println(plant.type);

		// size i protected and : publicPrivateandProtected is not in the same
		// package as plant
		// Won't Work
		// System.out.println(plant.size);

		// won't work; publicPrivateandProtected and plant are in different
		// packages,Height has package-level visibility
		// System.out.println(plant.height);

	}

}
