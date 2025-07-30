package my.sl.app;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoIterable;

public class MongoDBDemo {

	public static void main(String[] args) {
		
		System.out.println("Hello MongoDB");
		
		// Connect to local MongoDB
		
		String localDBURL ="mongodb://localhost:27017";
		
		MongoClient mongoClient = MongoClients.create(localDBURL);
		
		
		MongoIterable<String> dbs = mongoClient.listDatabaseNames();
		
		dbs.forEach(  db -> System.out.println(db) );
		
		
		mongoClient.close();
		
		
	}

}
