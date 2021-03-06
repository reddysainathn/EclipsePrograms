package startingThreads;

class Runner extends Thread {

	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello " + i);

			// Thread.sleep(Specify number of milli-seconds to be paused)
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class StartingThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Runner runner1 = new Runner();

		// Start method starts running the run() method
		runner1.start();

		// Both threads run concurrently
		Runner runner2 = new Runner();
		runner2.start();
	}

}
