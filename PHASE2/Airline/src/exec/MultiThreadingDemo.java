package exec;

import concepts.NumberProducingThread;

public class MultiThreadingDemo {

	public static void main(String[] args) {
		
		Thread t1=  new NumberProducingThread();
		Thread t2=  new NumberProducingThread();
		
		t1.start();
		t2.start();
		
		// Main thread
		for(int i=0;i<200;i++) {
			System.out.println("Main thread "+ i);
		}

	}

}
