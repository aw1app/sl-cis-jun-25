package jdbcdemo;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class JDBCRowsetDemo {

	public static void main(String[] args) throws SQLException {

		// Create a JdbcRowSet instance
		JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();

		// Set database connection info
		rowSet.setUrl("jdbc:mysql://localhost:3306/cis_estore");
		rowSet.setUsername("root");
		rowSet.setPassword("rootroot");

		// Set the SQL query
		rowSet.setCommand("SELECT EmployeeID, Name, ManagerID FROM employees");

		// Execute the query
		rowSet.execute();

		// Iterate over the results
		System.out.println("Employees Table:");
		System.out.println("---------------");

		while (rowSet.next()) {

			int empId = rowSet.getInt("EmployeeID");
			String empName = rowSet.getString("Name");
			int managerId = rowSet.getInt("ManagerID");
			
//			if (empName.equals("Suman10")){
//				String nameChanged = "Sumitra10";
//				rowSet.updateString("Name", nameChanged);
//				rowSet.updateRow(); 
//				System.out.println("Updated EmpId " + empId + "'s name to "+nameChanged);
//				empName = rowSet.getString("Name"); // store the updated name.
//			};

			System.out.println("ID=" + empId + ", NAME = " + empName + ", ManagerID=" + managerId);

		};
		
		
		// Using rowset object we can go to a particular row.
		System.out.println(" -- Using rowset object we can go to a particular row --");
		rowSet.absolute(5);
		int empId = rowSet.getInt("EmployeeID");
		String empName = rowSet.getString("Name");
		int managerId = rowSet.getInt("ManagerID");
		System.out.println("ID=" + empId + ", NAME = " + empName + ", ManagerID=" + managerId);
		
		

	}

}
