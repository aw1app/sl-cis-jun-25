package exec;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import staff.Pilot;

public class StreamsDemo {

	public static void main(String[] args) {

		List<Pilot> pilots = Arrays.asList(
				new Pilot("Fatema", 25, "ER23456", 4),
				new Pilot("Mohan", 35, "ER23457", 16),
				new Pilot("Prakash", 55, "ER23458", 11),
				new Pilot("Wiiliam", 60, "ER23455", 24)
				);

		pilots.forEach(p -> System.out.println( p.details() ));
		
		int noOfPilots = (int) pilots.stream().count();
		System.out.println("noOfPilots="+ noOfPilots);
		
		
		// Filter pilots by thier age and create a list of those pilots
		List<Pilot> pilotsGreaterThan50Age  = pilots.stream().filter( p -> p.getAge() > 50).toList();
		System.out.println( "\n Pilots age > 50 are:");
		pilotsGreaterThan50Age.forEach( p -> System.out.println( p.details() ));
		
		
		//sorting pilots by thier no of years of experience
		List<Pilot> pilotsSortedByExperience  =  pilots.stream()
				.sorted( (p1, p2) -> p1.getYearOfExperience() - p2.getYearOfExperience() )
				.toList();
		System.out.println( "\n\n Pilots sorted by years of experience :");
		pilotsSortedByExperience.forEach( p -> System.out.println( p.details() ));
		
		
		
	}

}
