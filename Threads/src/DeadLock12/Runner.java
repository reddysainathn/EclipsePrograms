package DeadLock12;

/**
 * <a href="https://wikipedia.org/wiki/Deadlock">Deadlock</a>
 */
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

	private Account acc1 = new Account();
	private Account acc2 = new Account();

	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	
	private void acquireLocks(Lock firstLock,Lock secondLock) throws InterruptedException{
		 
		while(true){
			//Acquire locks
			boolean gotFirstLock = false;
			boolean gotSecondLock = false;
			
			try{
				 /**
                 * tryLock() which will only acquire a lock if it’s available
                 * and not already acquired by another thread and tryLock(long
                 * time,TimeUnit unit), which will try to acquire a lock and, if
                 * it's unavailable wait for the specified timer to expire
                 * before giving up
                 */
				gotFirstLock = firstLock.tryLock();
				gotSecondLock = secondLock.tryLock();
			}finally{
				if(gotFirstLock && gotSecondLock){
					return;
				}
				if(gotFirstLock){
					firstLock.unlock();
					
				}
				if(gotSecondLock){
					secondLock.unlock();
				}
			}
			
			//Locks not Acquired 
			Thread.sleep(1);
			
		}
	}

	public void firstStage() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			
			acquireLocks(lock1, lock2);
			//lock1.lock();
			//lock2.lock();
			try {

				Account.transfer(acc1, acc2, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}
	}

	public void secondStage() throws InterruptedException {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			acquireLocks(lock2, lock1);
			//Using this way,we get a dead-Lock
			//lock2.lock();
			//lock1.lock();
			try {

				Account.transfer(acc2, acc1, random.nextInt(100));
			} finally {
				lock1.unlock();
				lock2.unlock();
			}
		}

	}

	public void finished() {

		System.out.println("Account-1 Balance :" + acc1.getBalance());
		System.out.println("Account-2 Balance :" + acc2.getBalance());
		System.out.println("Total Balance :"
				+ (acc1.getBalance() + acc2.getBalance()));
	}
}
