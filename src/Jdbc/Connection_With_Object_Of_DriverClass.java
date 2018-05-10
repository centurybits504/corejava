package Jdbc;


import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

//creating connection
public class Connection_With_Object_Of_DriverClass {

	public static void main(String[] args) {
		try{
			//loading&registring the Driver by initializing Driver(JDBC-ODBC Driver) class(com.mysql.jdbc.Driver).
			com.mysql.jdbc.Driver driver=new com.mysql.jdbc.Driver();
			Connection conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			if(conn!=null)
				System.out.println("Connection Created..");
		}catch(SQLException sqle)
		{
			sqle.printStackTrace();
		}
		
		
		 

	}

}
