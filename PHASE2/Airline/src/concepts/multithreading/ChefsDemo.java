package concepts.multithreading;

public class ChefsDemo {

	public static void main(String[] args) {

		Plate p1 = new Plate();

		Thread dosachef = new Thread(new DosaChef(p1));

		Thread rotichef =  new Thread(new RotiChef(p1));
		
		dosachef.start();
		rotichef.start();
	}

}
