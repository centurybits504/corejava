package Jdbc;

import java.sql.*;
/*ResultSetMetaData Example*/
public class ResultSetMetaDataExample {
	public static void main(String[] args) {
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			Statement stmt=(Statement) conn.createStatement();
			
			ResultSet rs=(ResultSet) stmt.executeQuery("SELECT * FROM employee");
			ResultSetMetaData rsmd=(ResultSetMetaData) rs.getMetaData();
			
			System.out.println("Schema Name:  "+rsmd.getCatalogName(1));
			System.out.println("Table Name:  "+rsmd.getTableName(1));
			System.out.println("Column Count In Table :  "+rsmd.getColumnCount());
			System.out.println("Column Name:  "+rsmd.getColumnName(1));
			System.out.println("Column Type:  "+rsmd.getColumnType(1));
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
	}
}
