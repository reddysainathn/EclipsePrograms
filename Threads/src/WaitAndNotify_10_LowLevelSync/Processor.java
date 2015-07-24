package WaitAndNotify_10_LowLevelSync;

import java.util.LinkedList;
import java.util.Random;

public class Processor {

	private LinkedList<Integer> list = new LinkedList<Integer>();
	private final int LIMIT = 10;
	private Object lock = new Object();

	public void produce() throws InterruptedException {

		int value = 0;
		while (true) {

			synchronized (lock) {
				  //whenever the thread is notified starts again from the loop
				while (list.size() == LIMIT) {
					lock.wait();// wait() is also true
				}
				list.add(value++);

				lock.notify();
			}

		}

	}

	public void consume() throws InterruptedException {
		Random random = new Random();
		while (true) {
			synchronized (lock) {

				while (list.size() == 0) {
					lock.wait();

				}
				System.out.print("List Size is:" + list.size());
				int value = list.removeFirst();
				System.out.println(";Value is :" + value);
				lock.notify();
			}
			Thread.sleep(random.nextInt(1000));//force producer fill the queue to LIMIT_SIZE
		}

	}
}
