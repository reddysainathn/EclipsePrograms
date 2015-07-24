package DeadLock12;
/**
 * <a href="https://wikipedia.org/wiki/Deadlock">Deadlock</a>
 * can occur in a situation when a thread is waiting for an object's lock,
 * that is acquired by another thread and the second thread is waiting for an
 * object lock that is acquired by first thread. Since, both threads are waiting
 * for each other to release the lock, the condition is called deadlock. If you
 * make sure that all locks are always taken in the same order by any thread,
 * deadlocks cannot occur.
 */
public class DeadLocks {

	public static void main(String[] args) throws InterruptedException {

		final Runner runner = new Runner();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					runner.firstStage();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					runner.secondStage();
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
		runner.finished();
	}
}
