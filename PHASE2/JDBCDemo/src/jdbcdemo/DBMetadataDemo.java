package jdbcdemo;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBMetadataDemo {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cis_estore", "root",
				"rootroot");

		DatabaseMetaData meta = connection.getMetaData();

		System.out.println(meta.getDatabaseProductName());
		System.out.println(meta.getDatabaseMajorVersion());
		System.out.println(meta.getDatabaseMinorVersion());

		ResultSet rs = meta.getCatalogs();

		while (rs.next()) {

			System.out.println(rs.getString(1));

		}
		;

		// Table listing
		System.out.println("\nList of tables:");
		ResultSet tables = meta.getTables(null, null, "%", new String[] { "TABLE" });

		while (tables.next()) {
			String tableName = tables.getString("TABLE_NAME");
			String tableSchema = tables.getString("TABLE_SCHEM");
			System.out.println("- " + tableName + " (Schema: " + tableSchema + ")");
		}

		// non metadata capabilities
		// connection.createStatement().execute("CREATE database mycisdb");

		connection.close();
	}

}
