package my.sl.app;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.FindOneAndUpdateOptions;
import com.mongodb.client.model.ReturnDocument;
import com.mongodb.client.model.Updates;

public class DBOperations {

	private MongoClient client;
	private MongoDatabase database;
	private MongoCollection<Document> collection;

	public DBOperations() {
		try {
			String connectionString = "mongodb://localhost:27017";

			client = MongoClients.create(connectionString);
			System.out.println("[DBOperations] Connection Created");

			database = client.getDatabase(Util.DB_NAME);
			System.out.println("[DBOperations] Database Selected as cis_db");

			collection = database.getCollection(Util.COLLECTION_NAME);
			System.out.println(
					"[DBOperations] Collection from " + Util.DB_NAME + "  selected as " + Util.COLLECTION_NAME);

		} catch (Exception e) {
			System.out.println("Something Went Wrong during connection: " + e.getMessage());
		}
	}

	// --- Insert Operations ---

	public void insertCustomer(Customer customer) {

		Document document = customer.getDocument();
		collection.insertOne(document);
	}

	public void insertCustomers(List<Customer> customers) {

		List<Document> documents = new ArrayList<>();

		for (Customer customer : customers) {
			documents.add(customer.getDocument());
		}

		collection.insertMany(documents);
	}

	// --- Read Operations ---
	public Customer convertDocumentToCustomer(Document doc) {
		Customer customer = new Customer();
		if (doc == null)
			return null; // Handle null document case

		// Safely retrieve and set fields using correct types
		customer.setName(doc.getString("name"));
		customer.setPhone(doc.getString("phone"));
		customer.setEmail(doc.getString("email"));

		customer.setTemperature(((Double) doc.get("temperature")).floatValue());

		// Handle Date types
		customer.setIntime(doc.getDate("intime"));
		customer.setOuttime(doc.getDate("outtime"));

		return customer;
	}

	public List<Customer> getAllCustomers() {
		  List<Customer> customers = new ArrayList<>();
		  
		  List<Document> documents = collection.find().into(new ArrayList<>());
		  
		  for(Document doc : documents) {
			  customers.add( convertDocumentToCustomer(doc) );
		  }
		  
		  return customers;
	}
	
	  public Customer getCustomerByEmail(String email) {
	        Customer customer = null;
	        
	        Document document  =  collection.find( Filters.eq("email", email)  ) .first();
	        
	        customer = convertDocumentToCustomer(document);
	        
	        return customer;
	  }
	  
	  
	  //Update ops
	  public void updateCustomer(String email, String key, String value) {
		  
		  Bson filter = Filters.eq("email", email);
		  
		  Bson updateOperation = Updates.set(key, value); // Use Updates.set to change a field's value
		  
		  FindOneAndUpdateOptions options = new FindOneAndUpdateOptions().returnDocument(ReturnDocument.AFTER);
          Document updatedDocument = collection.findOneAndUpdate(filter, updateOperation, options);

          System.out.println("Document Updated for email " + email);
          
          if (updatedDocument != null) {
              System.out.println("Updated Version of Document is: " + updatedDocument.toJson());
          } else {
              System.out.println("No document found to update for email: " + email);
          }
	
	  }
	  
	  
	  //Upsert ops
	  
	  //Delete ops

}
