package CallableAndFuture_14;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableAndFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newCachedThreadPool();

		executor.submit(new Runnable() {

			@Override
			public void run() {
				Random random = new Random();
				try {
					Thread.sleep(random.nextInt(4000));
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Starting.");

				System.out.println("Finished.");

			}

		});
		executor.shutdown();
	}

}
