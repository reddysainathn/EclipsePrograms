class Machine {
	public void start() {
		System.out.println("Machine Started!");
	}
}

class Camera extends Machine {
	public void start() {
		System.out.println("Camera Started!");
	}

	public void snap() {
		System.out.println("Photo Taken!");
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine machin1 = new Machine();
		Camera camer1 = new Camera();
		machin1.start();
		camer1.start();
		camer1.snap();

		// Upcasting--Is safe
		Machine machine2 = new Camera();
		Machine machine3 = camer1;
		machine3.start();
		// Error:::machine3.snap();

		// Downcasting--Is unsafe and be careful
		Machine machine4 = new Camera();
		Camera camera3 = (Camera) machine4;
		camera3.snap();
		camera3.start();

		// doesn't Work -- Run-Time Error
		Machine machine5 = new Machine();
		// Camera camer4 = (Camera) machine5;
		// camer4.start();
		// camer4.snap();
	}

}
