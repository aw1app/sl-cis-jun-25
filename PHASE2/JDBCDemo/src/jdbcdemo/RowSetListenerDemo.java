package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetListenerDemo {

	public static void main(String[] args) throws SQLException {
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

		rowSet.addRowSetListener(new MyRowSetListener());

		rowSet.absolute(5);
		int empId = rowSet.getInt("EmployeeID");
		String empName = rowSet.getString("Name");
		int managerId = rowSet.getInt("ManagerID");
		System.out.println("ID=" + empId + ", NAME = " + empName + ", ManagerID=" + managerId);

		System.out.println("Before update: " + rowSet.getString("Name"));

		rowSet.updateString("Name", "QQQQQQQQQQQQ");

		rowSet.updateRow(); // triggers rowChanged event
		rowSet.acceptChanges(connection); // sync up the changes with the DB.

		System.out.println("After update: " + rowSet.getString("Name"));

		connection.close();

	}

}

// Custom RowSetListener
class MyRowSetListener implements RowSetListener {

	@Override
	public void rowSetChanged(RowSetEvent event) {
		System.out.println("[Listener] Rowset changed .");

	}

	@Override
	public void rowChanged(RowSetEvent event) {
		System.out.println("[Listener] row changed . " );

	}

	@Override
	public void cursorMoved(RowSetEvent event) {
		System.out.println("[Listener] Cursor moved." );

	}

}
