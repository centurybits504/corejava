package Jdbc;


import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

//creating connection
public class Connection_With_ClassForName {

	public static void main(String[] args) {
		Connection conn=null;
		try{
			//loading&registring the Driver by initializing Driver class(com.mysql.jdbc.Driver)  with forName();
			//This method is used to dynamically load the driver class.
			Class.forName("com.mysql.jdbc.Driver");	
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}
		try{ 
			 conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			 /*Statement stmt=(Statement) conn.createStatement();
			 ResultSet rs_1=(ResultSet) stmt.executeQuery("SELECT * FROM employee");
			  
			 while(rs_1.next()){
				 System.out.println(rs_1.getInt(1)+"--"+rs_1.getString(2)+"--"+rs_1.getString(3) +"--"+rs_1.getDate(4));
			 }*/
			 
			 if(conn!=null)
					System.out.println("Connection Created..");
			 
				 
		}catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
	
	}

}
