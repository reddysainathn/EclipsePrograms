package threadPool7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * * ThreadPool ("number of workers in a factory")
 * thread pools are way of managing lots of threads at same time
 */

class Processor implements Runnable {
	private int id;

	public Processor(int id) {
		this.id = id;
	}

	@Override
	public void run() {

		System.out.println("Starting :" + id);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Completed :" + id);

	}

}

public class ThreadPoool {
	/**
     * Created 2 threads, and assign tasks (Processor(i).run) to the threads
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ExecutorService will use executor to execute the processes allocated
		// to threads
		ExecutorService executor = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 5; i++) {// call the (Processor(i).run) 5 times with 2 threads
			executor.submit(new Processor(i));
		}
		executor.shutdown();

		System.out.println("All tasks submitted.");

		try {
			// executor who is making the threads to run all tasks ,and
			// executor.awaitTermination will let you wait for 1 day to
			// terminate the tasks,if the tasks are completed ,it will terminate
			// right away
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("All tasks completed.");
	}

}
