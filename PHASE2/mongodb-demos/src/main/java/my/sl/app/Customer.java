package my.sl.app;

import java.util.Date;

import org.bson.Document;

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
	
	
	 // --- Other Methods ---

    @Override
    public String toString() {
        return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", temperature=" + temperature
                + ", intime=" + intime + ", outtime=" + outtime + "]";
    }

    // Method to convert Customer object to MongoDB Document
    public Document getDocument() {
        Document document = new Document();
        // document.append("_id", new ObjectId()); // MongoDB automatically creates _id, so we can comment this out
        document.append("name", this.name);
        document.append("phone", phone);
        document.append("email", email);
        document.append("temperature", temperature);
        document.append("intime", intime);
        document.append("outtime", outtime);
        return document;
    }
	
	
	

}
