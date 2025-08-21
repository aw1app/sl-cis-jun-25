package springfwdemo;

public class Product implements IProduct {

	String name;
	String desc;
	float price;
	
	Brand brand;
	
	public Product() {
		
	}

	public Product(String name, String desc, float price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	public Product(String name, String desc, float price, Brand brand) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	public Brand getBrand() {
		return brand;
	}
	
	public void setBrand(Brand brand) {
		this.brand = brand;
	}

}
