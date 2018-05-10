package Jdbc;

/*Creating  Connection Example */
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class CreatingConnectionExample {
	private static Connection conn = null;
	public static void main(String[] args) {
		try {
			/* Loads the driver class byte code into memory */
			Class.forName("DriverClass");/*throws ClassNotFoundException if driver class not available*/
			/* Creating connection */
			conn = (Connection) DriverManager.getConnection(
					"URL", "username", "password");/*SQLException, if a database access error occurs*/ 
			if (conn != null){
				System.out.println("Connection Established");
			}	

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				/*Closing the virtual socket between the java application and database*/
				conn.close();
				System.out.println("Connection Closed");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
/*Here,
  DriverClass : 
	The driver class for oracle database is oracle.jdbc.driver.OracleDriver
	The driver class for MySQL database is com.mysql.jdbc.Driver
	The driver class for DB2 database is COM.ibm.db2.jdbc.net.DB2Driver
	
  URL : URL(Uniform Resource Locator) represents a protocol to connect to the database.
  The URL format for oracle database is  	jdbc:oracle:thin:@hostname:portnumber:databasename
  The URL format for MySQL database is jdbc:mysql://hostname:portnumber/databasename
  The URL format for DB2 database is jdbc:db2:hostname:portnumber/databasename
  
  UserName,Password  : To connect to a database, every user will be given a user name & password which is generally allotted by the database adminstrator.
*/
