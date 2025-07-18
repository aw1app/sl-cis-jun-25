package concepts.multithreading;

public class RotiChef implements Runnable {

	Plate plate;

	public RotiChef(Plate plate) {
		super();
		this.plate = plate;
	}

	public void run() {

		plate.addItem("Roti");

	}

}
