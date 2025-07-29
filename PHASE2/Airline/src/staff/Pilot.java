package staff;

import exceptions.PlaneNotFoundException;
import logistics.Plane;

public class Pilot {
	// Properties or feilds
	String name;
	float age;
	String pilotID;

	int yearOfExperience;

	public Pilot() {
	}

	public Pilot(String name, float age, String pilotID, int yearOfExperience) {
		super();
		this.name = name;
		this.age = age;
		this.pilotID = pilotID;
		this.yearOfExperience = yearOfExperience;
	}

	// behaviours
	public boolean fly(Plane plane) throws PlaneNotFoundException{
		
		if (plane == null ) throw new PlaneNotFoundException("plane object was null");

		return false;
	}

	// getters and setters

	public void setName(String name) {
		this.name = name;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public String getName() {
		return name;
	}

	public float getAge() {
		return age;
	}

	public String getPilotID() {
		return pilotID;
	}

	public String details() {
		return "Pilot details : " + this.name + "; " + this.pilotID + "; " + this.yearOfExperience;
	}

}
