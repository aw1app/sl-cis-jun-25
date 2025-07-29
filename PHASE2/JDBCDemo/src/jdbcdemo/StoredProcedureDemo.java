package jdbcdemo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class StoredProcedureDemo {

	public static void main(String[] args) {
		// STEP 1: Obtain the connection to the DB (MySQL);
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");
		} catch (SQLException e) {
			System.out.println(e);
		}

		// STEP 2 & 3 : Execute SQL statements and process the result.
		String sqlCommand = "{ CALL AddEmployee (?, ?, ?) }";

		try {
			CallableStatement callableStmt = connection.prepareCall(sqlCommand);

			callableStmt.setInt(1, 13);
			callableStmt.setString(2, "Suman13");
			callableStmt.setInt(3, 2);

			
			int count = callableStmt.executeUpdate();
			
			System.out.println( "AddEmployee Inserted " + count + " of rows.");

		} catch (SQLException e) {
			System.out.println( e);
		}

		// STEP 4 : close the connection.
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
