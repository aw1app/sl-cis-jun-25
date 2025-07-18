package exec;

import concepts.NumberProducingThread;
import concepts.NumberProducingThreadUsingRunnable;

public class MultiThreadingDemo {

	public static void main(String[] args) {

		Thread t1 = new NumberProducingThread();
		Thread t2 = new NumberProducingThread();

		t1.start();
		t2.start();

		NumberProducingThreadUsingRunnable rt1 = new NumberProducingThreadUsingRunnable();
		Thread t3 = new Thread(rt1);

		t3.start();

		// Main thread
		for (int i = 0; i < 200; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			
			// sleep for 100 ms after printing every number above
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}

	}

}
