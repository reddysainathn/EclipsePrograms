package Semaphores_13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/**
 * {@link java.util.concurrent.Semaphore}s
 * are mainly used to limit the number of simultaneous threads that
 * can access a resources, but you can also use them to implement deadlock
 * recovery systems since a semaphore with one permit is basically a lock that
 * can unlock from other threads.
 * <br>
 * Source:
 * <a href="http://stackoverflow.com/questions/771347/what-is-mutex-and-semaphore-in-java-what-is-the-main-difference">
 * http://stackoverflow.com/questions/771347/what-is-mutex-and-semaphore-in-java-what-is-the-main-difference
 * </a>
 * <p>
 * Mutex (or a semaphore initialized to 1; meaning there's only one resource)
 * is basically a mutual exclusion; Only one thread can acquire the resource
 * at once, and all other threads trying to acquire the resource are blocked
 * until the thread owning the resource releases.
 * <p>
 * Semaphore is used to control the number of threads executing. There will be
 * fixed set of resources. The resource count will gets decremented every time
 * when a thread owns the same. When the semaphore count reaches 0 then no other
 * threads are allowed to acquire the resource. The threads get blocked till
 * other threads owning resource releases.
 * </p>
 * <p>
 * In short, the main difference is how many threads are allowed to acquire the
 * resource at once.
 * TODO -- go a little more in depth explaining that
 * Mutex --its ONE. Semaphore -- its DEFINED_COUNT, ( as many as semaphore
 * count)
 */
public class Semaphoress {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*
		 * Basic Semaphore Usage // Semaphore maintains a count,and we refer a
		 * count as number of permits // Semaphore with one permit is basically
		 * a LOCK // We use Semaphores to control results Semaphore sem = new
		 * Semaphore(1);
		 * 
		 * // release() will increase the permit by one sem.release(); //
		 * acquire() will decrease the permit by one sem.acquire();
		 * System.out.println("Available Permits :" + sem.availablePermits());
		 */

		// newCachedThreadPool()
		ExecutorService execcutor = Executors.newCachedThreadPool();
		for (int i = 0; i < 200; i++) {
			execcutor.submit(new Runnable() {

				@Override
				public void run() {
					Connection.getInstance().connect();

				}
			});

		}
		execcutor.shutdown();
		execcutor.awaitTermination(1, TimeUnit.DAYS);
	}
}
