package exec;

import java.util.*;

import exceptions.PlaneNotFoundException;
import logistics.Plane;
import staff.ContractorPilot;
import staff.Pilot;

public class AirlineLauncherV2 {
	
	public static void main(String[] args) {
		//demoUsingList();
		//demoUsingSet();
		
		demoMaps();
	}
	
	public static void demoMaps() {
		
		Map<String, Pilot> mapOfIDsOfPilots = new HashMap<String, Pilot>();
		
		mapOfIDsOfPilots.put ( "ER23456", new Pilot("Fatema", 25, "ER23456", 4));
		mapOfIDsOfPilots.put ( "ER23457", new Pilot("Mohan", 35, "ER23457", 16));
		mapOfIDsOfPilots.put ( "ER23458", new Pilot("Prakash", 55, "ER23458", 11));
		mapOfIDsOfPilots.put ( "ER23455", new Pilot("Wiiliam", 60, "ER23455", 24));
		
		//Iteration
		mapOfIDsOfPilots.forEach( (k,v) -> System.out.println("ID " + k +" "+ v.details()) );
		
		// search for details of a pilot with id ER23457
		System.out.println("\nsearch for details of a pilot with id ER23457");
		Pilot p = mapOfIDsOfPilots.get("ER23457");
		if (p!=null)
			System.out.println("Pilot Found.  " + p.details());
		else
			System.out.println(" No Pilot with ID " + "ER23457");
		
	}

	public static void demoUsingList() {
		List<Plane> planes = new ArrayList<Plane>();

		Plane plane = new Plane();
		plane.setName("Bharat Express");
		plane.setCapacity(200);

		planes.add(plane);

		plane = new Plane();
		plane.setName("Mysore Express");
		plane.setCapacity(40);

		planes.add(plane);

		List<Pilot> pilots = new ArrayList<Pilot>();

		Pilot pilot = new Pilot();
		pilot.setName("Sundar Verma");
		pilot.setYearOfExperience(10);

		pilots.add(pilot);

		pilots.add(new Pilot("Fatema", 25, "ER23456", 4));

		System.out.println("Pilot Details");
		System.out.println(pilots.get(0).details());
		System.out.println(pilots.get(1).details());

		System.out.println("\n ContractorPilot Details");
		pilots.add(new ContractorPilot("Sushant", 25, "IR56667", 7, 2));
		System.out.println(pilots.get(2).details());

		// demo of polymorphism
		pilots.add(new ContractorPilot("Mallaih Gowda", 45, "MR44402", 14, 3));

		System.out.println(pilots.get(3).details()); // ?? will call ContractorPilot's details

		// Pilot no 2 Fatema is flying the 1st plane Bharat Express
		try {
			pilots.get(1).fly(planes.get(0));
		} catch (PlaneNotFoundException e) {

			System.out.println(e.getMessage());
		}
		;

		// Looping through a list
		// Method 1: using the traditional for loop
		System.out.println("\n Looping through a list. Method 1: using the traditional for loop");
		for (int i = 0; i < pilots.size(); i++) {
			System.out.println(pilots.get(i).details());
		}

		// Looping through a list
		// Method 2: using the traditional for loop
		System.out.println("\n  Method 2: using the simplified for loop");
		for (Pilot p : pilots) {
			System.out.println(p.details());
		}

		// Looping through a list
		// Method 3: using the traditional for loop
		System.out.println("\n Method 3: using the forEach method of lists");
		pilots.forEach( p -> System.out.println(p.details()));

	}
	
	public static void demoUsingSet() {
		Set<Plane> planes = new HashSet<Plane>();

		Plane plane = new Plane();
		plane.setName("Bharat Express");
		plane.setCapacity(200);

		planes.add(plane);

		plane = new Plane();
		plane.setName("Mysore Express");
		plane.setCapacity(40);

		planes.add(plane);

		Set<Pilot> pilots = new HashSet<Pilot>();

		Pilot pilot = new Pilot();
		pilot.setName("Sundar Verma");
		pilot.setYearOfExperience(10);

		pilots.add(pilot);

		pilots.add(new Pilot("Fatema", 25, "ER23456", 4));

		
		System.out.println("\n ContractorPilot Details");
		pilots.add(new ContractorPilot("Sushant", 25, "IR56667", 7, 2));

		// demo of polymorphism
		pilots.add(new ContractorPilot("Mallaih Gowda", 45, "MR44402", 14, 3));

		

		// Looping through a list
		// Method 1: using the traditional for loop with index based access - NOT available for Sets
//		System.out.println("\n Looping through a list. Method 1: using the traditional for loop");
//		for (int i = 0; i < pilots.size(); i++) {
//			System.out.println(pilots.get(i).details());
//		}

		// Looping through a list
		// Method 2: using the traditional for loop
		System.out.println("\n  Method 2: using the simplified for loop");
		for (Pilot p : pilots) {
			System.out.println(p.details());
		}

		// Looping through a list
		// Method 3: using the traditional for loop
		System.out.println("\n Method 3: using the forEach method of set");
		pilots.forEach( p -> System.out.println(p.details()));

	}

}
