package staff;


public class Pilot {
	// Properties or feilds
	String name;
	float age;
	String pilotID;

	int yearOfExperience;

	// behaviours
	boolean fly(Plane plane) {
		return false;
	}

	String display() {
		return "Pilot details : " + this.name + "; " + this.pilotID + "; " + this.yearOfExperience;

	}

}
