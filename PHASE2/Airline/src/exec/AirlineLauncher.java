package exec;

import logistics.Plane;

public class AirlineLauncher {

	public static void main(String[] args) {
		Plane[] planes = new Plane[2];
		
		planes[0] = new Plane();
		planes[0].setName("Bharat Express");
		planes[0].setCapacity(200);
		
		planes[1] = new Plane();
		planes[1].setName("Mysore Express");
		planes[1].setCapacity(40);
		

	}

}
