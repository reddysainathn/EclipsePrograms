package ClassesandObjects;

import publicPrivateandProtected.Plant;

public class Grass extends Plant {

	public Grass() {

		// Won't work---Grass not in same package as
		// publicPrivateandProtected,even though it's a sub-class

		// System.out.println(this.height);
	}
}
