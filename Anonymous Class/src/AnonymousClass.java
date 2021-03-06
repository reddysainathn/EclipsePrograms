//Anonymous Class are way of extending a class or implementing Interface

class Machine {
	public void start() {
		System.out.println("Starting Machine!");
	}
}

interface Plant {
	public void grown();
}

public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Anonymous Class,We cannot create new object
		Machine machine1 = new Machine() {

			@Override
			public void start() {
				// TODO Auto-generated method stub
				System.out.println("Camera Snapping....");
			}

		};
		machine1.start();
		Plant plant1 = new Plant() {

			@Override
			public void grown() {
				// TODO Auto-generated method stub
				System.out.println("Plant Growning");

			}

		};
		plant1.grown();
	}

}
