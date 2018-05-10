package Jdbc;

/*DriverManger Class Example : Registering/De-registering driver class*/
import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverManagerClassExample {
	public static void main(String[] args) {
		try{
			com.mysql.jdbc.Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
			if(DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root")!=null)
				System.out.println("Connection Established");
			else
				System.out.println("Connection Not Established");
			DriverManager.deregisterDriver(driver);
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
	}

}
