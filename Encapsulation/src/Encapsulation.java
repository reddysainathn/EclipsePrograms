class Plant {
	// We can use outside of class when we use public,but using private we
	// cannot use it
	// We should declare all methods as private as of maximum possible and then
	// the public for the once we need to call all of them
	public static final int ID = 7;
	private String name;

	public String getData() {
		String data = "some stuff" + caluclateGrowthForecast();
		return data;

	}

	private int caluclateGrowthForecast() {
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation {
	public static void main(String[] args) {
		
		Plant plant = new Plant();

		plant.getData();
	}

}
