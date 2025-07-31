package my.sl.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {

	public static void main(String[] args) {

		DBOperations dbOps = new DBOperations();

		// Demo inserting one customer.
//		Customer c1 = new Customer("John Watson", "+91 999999 11111", "john@example.com", 98.4f, new Date(),
//				new Date());
//		dbOps.insertCustomer(c1);

		// Demo inserting many customer in one go.
//		List<Customer> customers = new ArrayList<>();
//
//		customers.add(
//				new Customer("John Watson 1", "+91 999999 11111", "john1@example.com", 98.41f, new Date(), new Date()));
//		customers.add(
//				new Customer("John Watson 2", "+91 999999 11112", "john2@example.com", 98.42f, new Date(), new Date()));
//		customers.add(
//				new Customer("John Watson 3", "+91 999999 11113", "john3@example.com", 98.43f, new Date(), new Date()));
//		customers.add(
//				new Customer("John Watson 4", "+91 999999 11114", "john4@example.com", 98.44f, new Date(), new Date()));
//		
//		dbOps.insertCustomers(customers);

		// Read the customers
		System.out.println("Read all customers");
		List<Customer> customerList = dbOps.getAllCustomers();
		customerList.forEach(cust -> System.out.println(cust.toString()));

		System.out.println("\n Find customer with a particular email \"john2@example.com\"");
		Customer custWithEmail = dbOps.getCustomerByEmail("john2@example.com");
		System.out.println(custWithEmail.toString());

		// Update customer with Email ID : john2@example.com , set it name to AAAZZZ
		dbOps.updateCustomer("john2@example.com", "name", "AAAZZZ");

		// Read the customers
		System.out.println("Read all customers after update above ");
		customerList = dbOps.getAllCustomers();
		customerList.forEach(cust -> System.out.println(cust.toString()));

	}

}
