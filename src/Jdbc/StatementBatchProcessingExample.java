package Jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*Batch Processing Example : Statement Interface*/
public class StatementBatchProcessingExample {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			conn.setAutoCommit(false);
			stmt=(Statement) conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			stmt.addBatch("INSERT INTO employee(id, first_name, last_name, start_date, end_date, salary, city, description) VALUES (10,'A','a','1996-09-24','1996-9-24',50000,'A_city','A_desc')");
			stmt.addBatch("INSERT INTO employee(id, first_name, last_name, start_date, end_date, salary, city, description) VALUES (11,'B','b','1996-09-24','1996-9-24',50000,'A_city','B_desc')");
			
			int[] _status = stmt.executeBatch();
			conn.commit();
			System.out.println("STATUS OF BATCHPROCESSING : " +_status.length);
			
			stmt.close();
			conn.close();
		}catch(ClassNotFoundException cnfe)
		{
			System.out.println(cnfe.getMessage());
		}catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
	}
}
