package my.sl.app;

import java.util.Date;

public class Customer {

	private String name;
	private String phone;
	private String email;
	private Float temperature;
	private Date intime;
	private Date outtime;
	
	
	public Customer(String name, String phone, String email, Float temperature, Date intime, Date outtime) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.temperature = temperature;
		this.intime = intime;
		this.outtime = outtime;
	}
	
	
	public Customer() {
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Float getTemperature() {
		return temperature;
	}


	public void setTemperature(Float temperature) {
		this.temperature = temperature;
	}


	public Date getIntime() {
		return intime;
	}


	public void setIntime(Date intime) {
		this.intime = intime;
	}


	public Date getOuttime() {
		return outtime;
	}


	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}
	
	
	// Getter and Setters
	

}
