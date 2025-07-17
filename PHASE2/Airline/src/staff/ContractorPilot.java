package staff;

public class ContractorPilot extends Pilot{
	
	// Inherited classes can have some extra properties
	int contractTerm=1; // 1 year contract
	
	public ContractorPilot() {
		
	}
	
	public ContractorPilot(String name, float age, String pilotID, int yearOfExperience, int contractTerm) {
		super(name, age, pilotID, yearOfExperience );
//		this.name = name;
//		this.age = age;
//		this.pilotID = pilotID;
//		this.yearOfExperience = yearOfExperience;
		this.contractTerm=contractTerm;
	}
	
	
	// Inherited classes can have some extra methods
	int getWages(){
		return contractTerm * 1500000 ;		// 15 lakhs per year
	}
	
	//override details method
	@Override
	public String details() {
		return super.details() + "; contract term : " + this.contractTerm;
	}


}
