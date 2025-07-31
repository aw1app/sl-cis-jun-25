package my.sl.app;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoIterable;

public class MongoDBDatabasesListingDemo {

	public static void main(String[] args) {
		
		System.out.println("List of databases");
		
		// Connect to local MongoDB
		
		//String localDBURL ="mongodb://localhost:27017";
		
		System.out.println("List of databases in the MongoDB cloud Atlas ");
		
		String AtlasDBURL = "mongodb+srv://user1:XXXXXXX@cluster0.ixxay.mongodb.net";
		
		MongoClient mongoClient = MongoClients.create(AtlasDBURL);
		
		
		MongoIterable<String> dbs = mongoClient.listDatabaseNames();
		
		dbs.forEach(  db -> System.out.println(db) );
		
		
		mongoClient.close();	
		
	}

}
