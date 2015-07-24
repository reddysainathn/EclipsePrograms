package WaitAndNotify_10_LowLevelSync;



public class LowLevelSync {

	/**
	 * {@link Object#wait()} and {@link Object#notify()} in Java; low-level
	 * multi-threading methods of the {@link java.lang.Object} class
	 * that allow you to have one or more threads sleeping, only to be woken up by
	 * other threads at the right moment. Extremely useful for avoiding those
	 * processor-consuming "polling loops".
	 */
	/**
	 * How to implement the Producer-Consumer pattern using "low level" techniques;
	 * namely, wait, notify and synchronized. This isn't the best way to implement a
	 * Producer-Consumer pattern in Java
	 * (see tutorial 7 use of {@link java.util.concurrent.BlockingQueue} for
	 * the best way); but this tutorial will help you to understand how to use wait
	 * and notify.
	 */
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			final Processor processor = new Processor();

			Thread t1 = new Thread(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					try {
						processor.produce();
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
						processor.consume();
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
		}

	}


