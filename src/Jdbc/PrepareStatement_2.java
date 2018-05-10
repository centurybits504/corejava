package Jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

/*Batch Processing Example : PreparedStatement Interface*/
public class PrepareStatement_2 {
	public static void main(String[] args) {
			Connection conn=null;
			PreparedStatement psmt = null;
			try{
				Class.forName("com.mysql.jdbc.Driver");
				conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				conn.setAutoCommit(false);

				psmt=(PreparedStatement) conn.prepareStatement("INSERT INTO employee(id, first_name, last_name, start_date, end_date, salary, city, description) VALUES (?,?,?,?,?,?,?,?)");
				psmt.setInt(1, 11);
				psmt.setString(2,"AAAA");
				psmt.setString(3,"aa");
				psmt.setString(4,"1996-09-24");
				psmt.setString(5,"1996-09-24");
				psmt.setInt(6, 50000);
				psmt.setString(7, "AA_City");
				psmt.setString(8, "AAAA_desc");
				psmt.addBatch();
				
				psmt.setInt(1, 111);
				psmt.setString(2,"BBBB");
				psmt.setString(3,"bb");
				psmt.setString(4,"1996-09-24");
				psmt.setString(5,"1996-09-24");
				psmt.setInt(6, 500001);
				psmt.setString(7, "BB_City");
				psmt.setString(8, "BBBB_desc");
				psmt.addBatch();
				
				int[] _status =psmt.executeBatch();
				conn.commit();
				System.out.println("STATUS OF BATCHPROCESSING : " +_status.length);

				psmt.close();
				conn.close();
			}catch(ClassNotFoundException cnfe){
				System.out.println(cnfe.getMessage());
			}catch (SQLException sqle) {
					System.out.println(sqle.getMessage());	
			}
	}
}
