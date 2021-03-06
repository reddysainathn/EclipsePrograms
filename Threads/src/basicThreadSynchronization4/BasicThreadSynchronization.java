package basicThreadSynchronization4;

import java.util.Scanner;

/*
 * There are two problems if there are more than one threads showing DATA
 * 1..Data to be En-cached
 * 2..Thread Inter-Leaving
 */

class Processor extends Thread {

	// Both threads run() and shutDown() are accessing running variable

	// private boolean running = true;

	/*
	 * Comment by John
	 *  Volatile Keyword, the volatile modifier guarantees that
	 * any thread that reads a field will see the most recently written value
	 */

	// volatile keyword is used to prevent threads caching variables when they
	// are not changed within that thread and if you want to change the variable
	// from an other thread ,we have to use "volatile"
	private volatile boolean running = true;

	public void run() {

		while (running) {
			System.out.println("Hello");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public void shutDown() {
		running = false;
	}

}

public class BasicThreadSynchronization {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Processor process1 = new Processor();
		process1.start();

		System.out.println("Press Enter to stop..");
		Scanner scanner = new Scanner(System.in);

		scanner.nextLine();

		process1.shutDown();

	}

}
