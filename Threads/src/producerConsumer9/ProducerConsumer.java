package producerConsumer9;

/**
 * Producer-Consumer pattern in Java using the {@link java.util.concurrent
 * .ArrayBlockingQueue} Java class.
 * <br><br>
 * Producer-Consumer is the situation where one or more threads are producing
 * data items and adding them to a shared data store of some kind while one or
 * more other threads process those items, removing them from the data store.
 */
/*
 * Classes in concurrent package are thread-safe,so we can access the Objects created with multiple threads,
 * We don't have to worry about thread synchronizaton
 */
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.Consumer;

public class ProducerConsumer {

	/**
	 * Thread safe implementation of {@link java.util.Queue} data structure so
	 * you do not need to worry about synchronization. More specifically
	 * {@link java.util.concurrent.BlockingQueue} implementations are
	 * thread-safe. All queuing methods are atomic in nature and use internal
	 * locks or other forms of concurrency control. If BlockingQueue is not used
	 * queue is shared data structure either {@code synchronized} or
	 * {@code wait() notify()} (see Course 8) should be used. Java 1.5
	 * introduced a new concurrency library {@link java.util.concurrent} which
	 * was designed to provide a higher level abstraction over the wait/notify
	 * mechanism.
	 */

	// BlockingQueue is a data-structure,where we can add and remove Items to it
	// Queue is First-In-First_out(FIFO)
	// We can add any kind of items to it,
	// Here We choose array Type of BlockingQueue
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(
			10) {

	};

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				try {
					producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		// Pause for 30 seconds and force quitting the app (because we're
		// looping infinitely)
		// Thread.sleep(30000);
		// System.exit(0);
	}

	/*
	 * The idea of Producer-Consumer is we have one or more thread producing
	 * things
	 */

	private static void producer() throws InterruptedException {
		// In producer we put integers randomly
		Random random = new Random();
		while (true) {//loop indefinitely

			queue.put(random.nextInt(100));//if queue is full (10) waits

		}

	}

	private static void consumer() throws InterruptedException {
		// In consumer we remove integers randomly

		Random random = new Random();

		while (true) {
			Thread.sleep(100);
			if (random.nextInt(10) == 0) {
				Integer value = queue.take();//if queue is empty waits
				System.out.println("Taken Value :" + value + ";"
						+ "Queue Size is :" + queue.size());

			}

		}
	}

}
