package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_With_Driver_Of_DriverManagerClass {
	public static void main(String[] args) {
		try{
			com.mysql.jdbc.Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			Connection conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			if(conn!=null)
				System.out.println("Connection Established");
			else
				System.out.println("Connection Not Established");
			DriverManager.deregisterDriver(driver);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}
}
