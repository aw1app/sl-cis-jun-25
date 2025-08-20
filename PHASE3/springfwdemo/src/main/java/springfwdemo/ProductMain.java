package springfwdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {

	public static void main(String[] args) {
//		IProduct p1 = new Product("TV", " 55 LED television", 55000.0f);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		IProduct p1 = (IProduct) context.getBean("product1");

		System.out.println("Product p1's name is " + p1.getName());
		System.out.println("Product p1's desc is " + p1.getDesc());
		System.out.println("Product p1's price is " + p1.getPrice());

	}

}
