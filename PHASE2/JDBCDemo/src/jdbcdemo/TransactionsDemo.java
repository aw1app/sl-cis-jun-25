package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class TransactionsDemo {

	public static void main(String[] args) {

		// STEP 1: Obtain the connection to the DB (MySQL);
		Connection connection = null;

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root", "rootroot");

		} catch (SQLException e) {
			System.out.println(e);
		}

		String insertSQL = "INSERT INTO employees values(?, ?, ?)";

		PreparedStatement pStmt = null;
		Savepoint savePoint1 = null, savePoint2 = null, savePoint3 = null;

		try {
			connection.setAutoCommit(false);
			pStmt = connection.prepareStatement(insertSQL);

			// add 1 employees
			pStmt.setInt(1, 14);
			pStmt.setString(2, "Suman14");
			pStmt.setInt(3, 2);

			pStmt.executeUpdate();

			savePoint1 = connection.setSavepoint("AfterSuman14");

			// add 2nd employees
			pStmt.setInt(1, 15);
			pStmt.setString(2,
					"Suman150000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000015");
			pStmt.setInt(3, 2);

			pStmt.executeUpdate();

			savePoint2 = connection.setSavepoint("AfterSuman15");

			// add 3rd employees
			pStmt.setInt(1, 16);
			pStmt.setString(2, "Suman16");
			pStmt.setInt(3, 2);

			pStmt.executeUpdate();
			savePoint3 = connection.setSavepoint("AfterSuman16");

			connection.commit();

			System.out.println("All employees inserted successfully.");
		} catch (SQLException e) {
			try {
				connection.rollback(savePoint1);
				connection.commit();
				System.out.println("Rolled Back to SavePoint AfterSuman14");
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
			System.out.println("Some or all mployees insertion failed.");
		}

	}

}
