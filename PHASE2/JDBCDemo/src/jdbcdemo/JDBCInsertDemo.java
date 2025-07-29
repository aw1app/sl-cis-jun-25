package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertDemo {

	public static void main(String[] args) {

		// STEP 1: Obtain the connection to the DB (MySQL);
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
		} catch (SQLException e) {
			System.out.println(e);
		}

		// STEP 2 : Create a Statement object.
		Statement stmt = null;
		try {
			stmt = connection.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}
		;

		// STEP 3 : Execute SQL statements and process the result.
		String sqlCommand = "INSERT INTO employees (EmployeeID, Name, ManagerID) VALUES (9, 'Suman9', 2),  (10, 'Suman10', 1);";
		
		try {
			int count = stmt.executeUpdate(sqlCommand);

			System.out.println("Successfully inserted " + count + " row(s)");

		} catch (SQLException e) {
			System.out.println(e);
		}
		
		
		// STEP 4 : close the connection.
		try {
			connection.close();
		} catch (SQLException e) {			
			e.printStackTrace();
		}

	}

}
