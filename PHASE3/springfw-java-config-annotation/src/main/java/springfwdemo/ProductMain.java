package springfwdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springfwdemo.config.MyProductConfig;

public class ProductMain {

	public static void main(String[] args) {

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyProductConfig.class);

		IProduct p1 = (IProduct) context.getBean("product1");

		System.out.println("Product p1's name is " + p1.getName());
		System.out.println("Product p1's desc is " + p1.getDesc());
		System.out.println("Product p1's price is " + p1.getPrice());

		System.out.println("\nProduct Bean using setter injection demo ");

		IProduct p2 = (IProduct) context.getBean("product2");

		System.out.println("Product p2's name is " + p2.getName());
		System.out.println("Product p2's desc is " + p2.getDesc());
		System.out.println("Product p2's price is " + p2.getPrice());

		System.out.println("\nProduct Bean using nested dependencies (product having brand) ");

		IProduct p3 = (IProduct) context.getBean("product3");

		System.out.println("Product p3's name is " + p3.getName());
		System.out.println("Product p3's desc is " + p3.getDesc());
		System.out.println("Product p3's price is " + p3.getPrice());
		System.out.println("Product p3's brand name  is " + p3.getBrand().getName());

	}

}
