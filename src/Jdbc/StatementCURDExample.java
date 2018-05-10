package Jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

/*Statement Example: CURD */
public class StatementCURDExample {
	public static void main(String[] args)   { 

		Connection conn=null;
		Statement stmt  =null;
		ResultSet rs_1 = null;
		try{
			/* forName method throws ClassNotFoundException */
			Class.forName("com.mysql.jdbc.Driver");
			/* getConnection method throws SQLException */
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			stmt=(Statement) conn.createStatement();
			
			/*Create Query*/
			 int _createStatus = stmt.executeUpdate("CREATE TABLE EMPLOYEE (Sno INTEGER not NULL,first_name VARCHAR(255),last_name VARCHAR(255));");
			 System.out.println("TABLE CREATION STATUS : "+_createStatus);
			 
			/*Selection Query*/
			rs_1=(ResultSet)stmt.executeQuery("SELECT * FROM EMPLOYEE");
			while(rs_1.next()){
				System.out.println(rs_1.getInt(1)+"  :  "+rs_1.getString(2));
			}
			
			/*Insertion Query*/
			int _insertStatus=stmt.executeUpdate("INSERT INTO EMPLOYEE VAUES(10,'B','BB)");/*executeUpdate method throws SQLException*/
			System.out.println("RECORED INSERTION STATUS  : " + _insertStatus);
			
			/*Selection Query*/
			boolean b_1=stmt.execute("SELECT * FROM EMPLOYEE");/*execute method throws SQLException*/
			System.out.println(b_1);
			
			/*Updation Query*/
			boolean b_2=stmt.execute("UPDATE EMPLOYEE SET first_name='A' WHERE last_name='P' ");/*execute method throws SQLException*/
			System.out.println(b_2);
			
			/*Deletion Query*/
			int _deletionStatus=stmt.executeUpdate("DELETE * FROM EMPLOYEE where first_name='A' ");  
			System.out.println("RECORED DELETION STATUS : "+ _deletionStatus);  
			

			
		/*ClassNotFoundException,SQLException are checked exceptions */
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}finally {
			try {
				if(rs_1!=null)
					rs_1.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
