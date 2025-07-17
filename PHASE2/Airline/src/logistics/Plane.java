package logistics;

public class Plane {
	
	private String name;
	private String planeID;
	
	private int capacity;
	private String model;
	
	boolean isInternational = false;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isInternational() {
		return isInternational;
	}

	public void setInternational(boolean isInternational) {
		this.isInternational = isInternational;
	}

	boolean takeOff(){
		
		return false;
	}
	
	boolean land(){
		return false;
	}

}
