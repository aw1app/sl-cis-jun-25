package concepts.multithreading;

public class Plate {
	
	// Item here is either Dosa or Roti, that is being produced by the Chefs
	synchronized  public void addItem(String item) {	
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("added a " + item + " to the plate.");
			
			try {Thread.sleep(100);} catch (InterruptedException e) {}// sleep for 100 ms
			
		}
		
		
	}

}
