package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import javax.sql.rowset.spi.SyncProviderException;
import javax.sql.rowset.spi.SyncResolver;

public class CachedRowSetSynResolverDemo {

	public static void main(String[] args) {

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root",
					"rootroot");
			connection.setAutoCommit(false); // This is required if we want to do changes and sync up those changes with
												// the DB.

			// Create a JdbcRowSet instance
			CachedRowSet rowSet = RowSetProvider.newFactory().createCachedRowSet();

			// Set the SQL query
			rowSet.setCommand("SELECT EmployeeID, Name, ManagerID FROM employees");

			// Execute the query
			rowSet.execute(connection);

			// Iterate over the results
			System.out.println("Employees Table ( using CachedRowSet ) :");
			System.out.println("---------------");

			System.out.println("\n\n -- Using rowset object we can go to a particular row --");
			rowSet.absolute(5);
			int empId = rowSet.getInt("EmployeeID");
			String empName = rowSet.getString("Name");
			int managerId = rowSet.getInt("ManagerID");
			System.out.println("ID=" + empId + ", NAME = " + empName + ", ManagerID=" + managerId);

			rowSet.updateString("Name", "QQQQQQQQQQQQ");

			// Conflict simulation: Now go to the database and delete this particular row.
			System.out.println("Pause and delete the fifth row in the DB to simulate conflict.");
			System.out.println("Press ENTER to continue...");
			System.in.read();

			try {
				rowSet.acceptChanges(connection); // sync up the changes with the DB.

				System.out.println("Update employee succeeded.");
			} catch (SyncProviderException spe) {
				SyncResolver resolver = spe.getSyncResolver();

				while (resolver.nextConflict()) {
					int status = resolver.getStatus();

					if ((status & SyncResolver.DELETE_ROW_CONFLICT) != 0) {
						System.out.println("Row was deleted in DB. Ignoring local update.");
					}
				}
			}

		} catch (Exception e) {

			System.out.println("Exception happened ." + e.getMessage());

		}

	}

}
