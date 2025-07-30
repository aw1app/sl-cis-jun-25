package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class CachedRowSetDemo {

	public static void main(String[] args) throws SQLException {
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
		connection.setAutoCommit(false); // This is required if we want to do changes and  sync up those changes with the DB.
		
		// Create a JdbcRowSet instance
		CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();		

		// Set the SQL query
		rowSet.setCommand("SELECT EmployeeID, Name, ManagerID FROM employees");

		// Execute the query
		rowSet.execute(connection);

		// Iterate over the results
		System.out.println("Employees Table ( using CachedRowSet ) :");
		System.out.println("---------------");

		while (rowSet.next()) {

			int empId = rowSet.getInt("EmployeeID");
			String empName = rowSet.getString("Name");
			int managerId = rowSet.getInt("ManagerID");

			System.out.println("ID=" + empId + ", NAME = " + empName + ", ManagerID=" + managerId);

		}
		;

		// Insert a new row
		rowSet.moveToInsertRow();
		System.out.println("\n\n -- Using cached rowset object  Insert a new row  demo --");
		rowSet.updateInt("EmployeeID", 103);
		rowSet.updateString("Name", "Ramesh Kumar 103");
		rowSet.updateInt("ManagerID", 3);

		rowSet.insertRow(); // Inserts the row into the table
		rowSet.moveToCurrentRow(); // Return to the current row
		
		rowSet.acceptChanges(); // sync up the changes with the DB.

		System.out.println("New employee inserted.");

	}

}
