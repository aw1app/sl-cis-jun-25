package concepts.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class FutureDemo {

	public static void main(String[] args)  throws Exception{

		// Create an ExecutorService with a fixed thread pool
		ExecutorService executor = Executors.newFixedThreadPool(2);

		Future<Integer> future1 = null, future2 = null;

		ComplexCalculation calService1 = new ComplexCalculation("Task 1");
		ComplexCalculation calService2 = new ComplexCalculation("Task 2");

		future1 = executor.submit(calService1);
		future2 = executor.submit(calService2);

		System.out.println("\nTasks submitted, continuing with other work...\n");

		// Simulate doing other work while tasks are running
		Thread.sleep(1000);
		System.out.println("\nDid some other work while waiting for results\n ");
		
		// Get results from futures with timeout
		int result1 = future1.get(5, TimeUnit.SECONDS);
		System.out.println("Result from Task 1: " + result1);
		
		int result2 = future1.get(5, TimeUnit.SECONDS);
		System.out.println("Result from Task 2: " + result2);		

	}

}
