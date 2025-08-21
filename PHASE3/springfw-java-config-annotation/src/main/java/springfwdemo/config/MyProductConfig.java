package springfwdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfwdemo.Product;

@Configuration
public class MyProductConfig {
	
	@Bean(name="product1")
	public Product createProduct() {
		
		Product p = new Product("HP Laptop","HP AI laptop 2025",100000.0f );
		
		return p;		
	}
	
	@Bean(name="product2")
	public Product createProduct2() {	
		
		Product p = new Product();
		
		p.setName("Dell Laptop");
		p.setPrice(50000.0f);
		
		return p;		
	}
	

}
