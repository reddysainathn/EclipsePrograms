package CallableAndFuture_14;

import java.io.IOError;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CallableAndFuture1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor = Executors.newCachedThreadPool();

		Future<Integer> future = executor.submit(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				Random random = new Random();
				int duaration = random.nextInt(4000);

				if (duaration > 2000) {
					throw new IOException("Sleeping for too Long");
				}
				System.out.println("Starting.");
				try {
					Thread.sleep(duaration);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				System.out.println("Finished.");

				return duaration;
			}
		});
		executor.shutdown();

		try {
			executor.awaitTermination(1, TimeUnit.DAYS);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			System.out.println("Result is :" + future.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block

			IOException ex = (IOException) e.getCause();
			System.out.println(ex.getMessage());
		}

	}
}
