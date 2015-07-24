package synchronisedKeyWord5;

public class SynchronisedKeyWord {

	private int count = 0;

	// Synchronized does is ,Every Object in JAVA has Monitor LOCK(MUTEX),When we
	// use synchronized keyword ,an intrensic lock is called ,only one thread
	// can call the LOCK at a time,and if one thread acquires Internsic lock and
	// runs the Method with Synchronized Keyword,the second thread has to wait
	// until the first thread will release the Intrensic lock by Method
	// finishing or executing

	public synchronized void increment() {
		count++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SynchronisedKeyWord sync = new SynchronisedKeyWord();
		sync.doWork();

	}

	public void doWork() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					// count++;
					increment();
				}

			}

		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					// count++;
					increment();
				}

			}

		});

		t1.start();
		t2.start();

		// Join() will wait and return until the Thread is finished
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Count is :" + count);
	}

}