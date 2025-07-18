package concepts;

public class NumberProducingThread extends Thread {

	// Define the task to be done by this thread
	public void run() {

		for (int i = 0; i < 100; i++) {

			System.out.println(Thread.currentThread().getName()  + " i = "+i);
			
			// sleep for 100 ms after printing every number above
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
			}  
		}

	}

}	
