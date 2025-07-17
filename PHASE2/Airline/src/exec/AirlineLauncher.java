package exec;

import logistics.Plane;
import staff.ContractorPilot;
import staff.Pilot;

public class AirlineLauncher {

	public static void main(String[] args) {
		Plane[] planes = new Plane[2];

		planes[0] = new Plane();
		planes[0].setName("Bharat Express");
		planes[0].setCapacity(200);

		planes[1] = new Plane();
		planes[1].setName("Mysore Express");
		planes[1].setCapacity(40);

		Pilot[] pilots = new Pilot[3];

		pilots[0] = new Pilot();
		pilots[0].setName("Sundar Verma");
		pilots[0].setYearOfExperience(10);

		pilots[1] = new Pilot("Fatema", 25, "ER23456", 4);

		System.out.println("Pilot Details");
		System.out.println(pilots[0].details());
		System.out.println(pilots[1].details());

		System.out.println("\n ContractorPilot Details");
		ContractorPilot cPilot = new ContractorPilot("Sushant", 25, "ER23456", 4, 2);
		System.out.println(cPilot.details());
	}

}
