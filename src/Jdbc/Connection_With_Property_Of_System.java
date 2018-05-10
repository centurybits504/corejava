package Jdbc;


import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//*[X]
public class Connection_With_Property_Of_System {

	public static void main(String[] args) {
		 
	
		try {
			String string=System.getProperty("com.mysql.jdbc.Driver");
			Class.forName(string);
			
			if(DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root")!=null)
				System.out.println("Connection Established..");
		} catch (ClassNotFoundException cce) {
			System.out.println(cce.getMessage());
		}catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
		}
		

	}

}
