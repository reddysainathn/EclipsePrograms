package publicPrivateandProtected;

public class Plant {
	// Bad Practice
	public String name;
	// Acceptable Practice --- It's Final.
	public static final int ID = 8;

	// private is only upto the class
	private String type;
	// Protected works for the same class(Or with in class) and sub-classes and
	// within the package
	protected String size;

	int height;

	public Plant() {
		// TODO Auto-generated constructor stub
		this.name = "Freddy";

		this.type = "plant";

		this.size = "Large";

		this.height = 10;

	}
}