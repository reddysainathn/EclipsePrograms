package publicPrivateandProtected;

public class Oak extends Plant {

	public Oak() {

		// Wont work, type is private
		// type = "tree";
		// This works because size is proctected and oak i subclass of plant.
		this.size = "Large";

		// No access specifier ;Works Because Oak and plant are in same package

		this.height = 10;
	}

}
