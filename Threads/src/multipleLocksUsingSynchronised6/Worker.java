package multipleLocksUsingSynchronised6;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

/**John Prucell Comments
 * Multiple locks to speed up complex multi-threaded code. Define shared
 * objects: list1 and list2 then synchronize these objects. Mainly discussing
 * making the method synchronized or making "different" objects inside the
 * method synchronized, By defining two different locks we say that one thread
 * may execute the stageOne while other executes stageTwo.
 */
public class Worker {

	private Random random = new Random();

	// Using synchronized the time taken is almost double,so for that reason we
	// use LOCK

	private Object lock1 = new Object(); 
	private Object lock2 = new Object(); 
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	 /**
     * synchronized, methods use different data (list1 list2) so by synchronized
     * methods if one thread runs the stageOne other thread cannot run stageTwo
     * at the same time because that same locks are used. Solution is using two
     * lock Object for two shared data.
     */
	
	// We used synchronized to not to throw
	// java.lang.ArrayIndexOutOfBoundsException
	/*public synchronized void stageOne() {

		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list1.add(random.nextInt(100));
	}

	// We used synchronized to not to throw
	// java.lang.ArrayIndexOutOfBoundsException
	public synchronized void stageTwo() {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list2.add(random.nextInt(100));

	}*/
	
	// Using Lock Objects,two threads can run the same methods at same time
	// But if a thread is entered with synchronized in a method the second thread has to wait
	
	
	
	public void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list1.add(random.nextInt(100));
		}
		
	}

	public void stageTwo() {
		synchronized (lock2) {
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			list2.add(random.nextInt(100));
		}
		
	}

	public void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}



	public void main() {
		System.out.println("Hello");
		System.out.println("Startting.....");
		long start = System.currentTimeMillis();
		// Regular Process,its not reliable
		// process();

		// Creating Couple of threads
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				process();
			}
		});
		// Starting two threads at same time,we may get
		// ArrayIndexOutOfBoundsException,due to using of shared data of lists
		// If we use synchronized for the threads,it will work fine
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();

		System.out.println("Time Taken :" + (end - start));

		System.out
				.println("List1 :" + list1.size() + " List2 :" + list2.size());

	}
}
