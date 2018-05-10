package Jdbc;

/*SavePoint Example : setSavePoint, rollback SavePoint*/
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class SavePointExample {
	
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt  =null;
		ResultSet rs_1 = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			conn.setAutoCommit(false);
			stmt = (Statement) conn.createStatement();			
			DatabaseMetaData _databasemd=conn.getMetaData();
			if(_databasemd.supportsSavepoints())
			{
			System.out.println("Current Driver Support SavePoint");
			try{
				stmt.executeUpdate("DELETE * FROM EMPLOYEE where first_name='A' ");  
				Savepoint sp = conn.setSavepoint();
				stmt.executeUpdate("INSERT INTO EMPLOYEE VAUES(10,'B','BB)");
				conn.rollback(sp);
				conn.commit();
			}catch(Exception e){
				/*if any error rollback*/
				conn.rollback();
			}
			}
			else
			{
			System.out.println("Current Driver Does Not Support SavePoint");
			}
			
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
		
	}

}
