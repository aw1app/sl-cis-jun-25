package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.FilteredRowSet;
import javax.sql.rowset.Predicate;
import javax.sql.rowset.RowSetProvider;

public class FiltertedRowsetDemo {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root",
				"rootroot");

		// Create a JdbcRowSet instance
		FilteredRowSet rowSet = RowSetProvider.newFactory().createFilteredRowSet();

		// Set the SQL query
		rowSet.setCommand("SELECT EmployeeID, Name, ManagerID FROM employees");

		// Execute the query
		rowSet.execute(connection);

		// Apply filter for manager id =1
		int filterManagerId = 3;
		rowSet.setFilter(new ManagerFilter(filterManagerId));

		// Iterate over the results
		System.out.println("Employees Table ( using FilteredRowSet showing only employees whose manager id is " +filterManagerId + " ) :" );
		System.out.println("---------------");

		while (rowSet.next()) {

			int empId = rowSet.getInt("EmployeeID");
			String empName = rowSet.getString("Name");
			int managerId = rowSet.getInt("ManagerID");

			System.out.println("ID=" + empId + ", NAME = " + empName + ", ManagerID=" + managerId);

		}
		;

	}

}

// Filter implementation
class ManagerFilter implements Predicate {

	private final int managerId;

	public ManagerFilter(int managerId) {
		this.managerId = managerId;
	}

	@Override
	public boolean evaluate(RowSet rs) {
		try {
			return rs.getInt("ManagerID") == managerId;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean evaluate(Object value, int column) throws SQLException {
		if (value instanceof Integer) {
			return (Integer) value == managerId;
		}
		return false;
	}

	@Override
	public boolean evaluate(Object value, String columnName) throws SQLException {
		if ("ManagerID".equalsIgnoreCase(columnName) && value instanceof Integer) {
			return (Integer) value == managerId;
		}
		return false;
	}

}
