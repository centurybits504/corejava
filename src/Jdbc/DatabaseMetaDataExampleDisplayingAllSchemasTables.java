package Jdbc;

/*DatabaseMetaData Interface Example: Displaying all schemas along with tables*/
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.DatabaseMetaData;

public class DatabaseMetaDataExampleDisplayingAllSchemasTables {
	static Connection conn = null;
	static DatabaseMetaData dbmd = null;
	static ResultSet resultSet = null;
	static ResultSet rs = null;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
			dbmd = (DatabaseMetaData) conn.getMetaData();
			System.out.println("Driver Name: " + dbmd.getDriverName());
			System.out.println("Driver Version: " + dbmd.getDriverVersion());
			System.out.println("UserName: " + dbmd.getUserName());
			System.out.println("Database Product Name: "+ dbmd.getDatabaseProductName());
			System.out.println("Database Product Version: "+ dbmd.getDatabaseProductVersion());

			rs = (ResultSet) dbmd.getCatalogs();

			System.out.println("SCHEMA_NAME ---- TABLE_NAMES");
			while (rs.next()) {
				String schema_name = rs.getString("TABLE_CAT");

				String[] types = { "TABLE" };
				resultSet = (ResultSet) dbmd.getTables(schema_name, null, "%",types);
				while (resultSet.next()) {
					String schemaName = resultSet.getString(1);
					String tableName = resultSet.getString(3);
					System.out.println(schemaName + " ---- " + tableName);
				}
			}
			rs.close();
			resultSet.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
