package Jdbc;

/*Transaction Management Example : PreparedStatement*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class Transation_Management_With_PreparedStatement_1 {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			conn.setAutoCommit(false);
			
			PreparedStatement psmt=(PreparedStatement) conn.prepareStatement("INSERT INTO employee(id, first_name, last_name, start_date, end_date, salary, city, description) VALUES (?,?,?,?,?,?,?,?)");
			 
			psmt.setInt(1, 1111);
			psmt.setString(2,"AAAA");
			psmt.setString(3,"aaaa");
			psmt.setString(4,"1996-09-24");
			psmt.setString(5,"1996-09-24");
			psmt.setInt(6, 50000);
			psmt.setString(7, "AA_City");
			psmt.setString(8, "AAAA_desc");
			psmt.executeUpdate();
			
			psmt.setInt(1, 11111);
			psmt.setString(2,"AAAAA");
			psmt.setString(3,"aaaaa");
			psmt.setString(4,"1996-09-24");
			psmt.setString(5,"1996-09-24");
			psmt.setInt(6, 50000);
			psmt.setString(7, "AA_City");
			psmt.setString(8, "AAAA_desc");
			psmt.executeUpdate();
			
			System.out.println("Input Required :: [Y/N]");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			if("Y".equalsIgnoreCase(br.readLine())){	
				conn.commit();
				System.out.println("Transaction Commited..");
			}
			else{
				conn.rollback();
				System.out.println("Transaction Rollbacked..");
			}
		} catch(Exception e){
			try{
				/*if exception occurs while executing any query, we have to rollback all queries */
				conn.rollback();
				System.out.println("Exception Occured. Transaction Rollbacked..");
			}catch(Exception e1){
				e1.printStackTrace();	
			}
			
		}
		//close pstmt & conn
	
	}

}
