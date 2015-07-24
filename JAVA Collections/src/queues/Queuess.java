package queues;
//Missing BlockingQueue(Add Here)
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// (Head)<- ooooooooooooooooooo <-(Tail)
		// Queue is a FIFO(First In First Out) Structure
		// First Item you remove in the queue is the first Item you added
		// We add Items at tail and we remove at tail
		// http://docs.oracle.com/javase/7/docs/api/java/util/Queue.html

		// In ArrayBlockingQueue we can specify the size of the queue
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// Queue has two methods for working with queues
		// 1.Throws Exception first Method
		// Throws NoSuchElementException --No items in queue yet
		// System.out.println("Head of Queue is :" + q1.element());

		q1.add(10);
		q1.add(20);
		q1.add(30);

		// To see Head of Queue
		System.out.println("Head of Queue is :" + q1.element());

		try {
			q1.add(40);
		} catch (IllegalStateException e) {
			System.out
					.println("Tried to add too many items in the queue " + q1);
		}

		// To Print elements in queue
		for (Integer value : q1) {
			System.out.println("Queue Values :" + value);
		}

		// Removing from Queue,The first added element is removed first
		// Integer value = q1.remove();
		Integer value;
		value = q1.remove();
		System.out.println("\nRemoved value from Queue :" + value);
		System.out.println("\nRemoved value from Queue :" + q1.remove());
		System.out.println("\nRemoved value from Queue :" + q1.remove());

		try {

			System.out.println("\n Removed value from Queue :" + q1.remove());
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			System.out.println("Tried to remove too many items from queue");
		}

		// 2.Return Special Values(2nd Method of dealing with queue)/////
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		System.out.println("Queue 2 peek :"+q2.peek());
		
		//offer() is like add() but it returns false if there is any extra element offered
		q2.offer(10);
		q2.offer(20);
		
		//peek() is like head()
		System.out.println("Queue 2 peek :"+q2.peek());
		

		if (q2.offer(30) == false) {
			System.out.println("Offer failed to add third item");
		}

		for (Integer value1 : q2) {
			System.out.println("Queue 2 Values :" + value1);
		}
		//poll() is like remove() but it returns false if there is any extra element to poll
		System.out.println("Queue 2 poll :"+q2.poll());
		System.out.println("Queue 2 poll :"+q2.poll());
		System.out.println("Queue 2 poll :"+q2.poll()); 
		
		
		
	}

}
