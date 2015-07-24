package methodInAThread3;

/*
 * What  are two basic methods of creating a Thread ?
 * 1..Extend Thread Class 
 * 2..Implement Runnable Thread Class in constructor
 */
//We create a Method in its own Thread
public class MethodInAThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 0; i < 10; i++) {
					System.out.println("Hello " + i);

					// Thread.sleep(Specify number of milli-seconds to be
					// paused)
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

		});

		t1.start();

	}

}
