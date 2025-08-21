package com.sl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.sl.beans.Product;

@Configuration
@ComponentScan({ "com.sl.beans" })
public class ProjectMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectMain.class);

		Product p1 = (Product) context.getBean(Product.class);

		System.out.println("Product p1's name is " + p1.getName());
		System.out.println("Product p1's desc is " + p1.getDesc());
		System.out.println("Product p1's price is " + p1.getPrice());

		System.out.println("Product p1's brand name  is " + p1.getBrand().getName());

		Product p2 = (Product) context.getBean(Product.class);

		// If product bean's scope is singleton then p1 and p2 are one and the same objects
		// If product bean's scope is prototype then p1 and p2 are NOT the same objects
		System.out.println("p1 " + p1);
		System.out.println("p2 " + p2);
		
		

	}

}
