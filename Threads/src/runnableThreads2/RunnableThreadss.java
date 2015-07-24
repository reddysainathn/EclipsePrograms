package runnableThreads2;

class Runner implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
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

public class RunnableThreadss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating threads Runnable
		Thread t1 = new Thread(new Runner());
		Thread t2 = new Thread(new Runner());

		t1.start();
		t2.start();

	}

}
