package Jdbc;

/*Transaction Management Example : Statement*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Transation_Management_With_Statement_1 {

	public static void main(String[] args) {
		 Connection conn=null;
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			conn.setAutoCommit(false);
			
			Statement stmt=(Statement) conn.createStatement();
			stmt.executeUpdate("INSERT INTO employee(id, first_name, last_name, start_date, end_date, salary, city, description) VALUES (109,'A','a','1996-09-24','1996-9-24',50000,'A_city','A_desc')");
			stmt.executeUpdate("INSERT INTO employee(id, first_name, last_name, start_date, end_date, salary, city, description) VALUES (110,'A','a','1996-09-24','1996-9-24',50000,'A_city','A_desc')");
			
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			
			System.out.println("Input Required :: [Y/N]");
			String st=br.readLine();
			if(st.equalsIgnoreCase("y")){	
				conn.commit();
				System.out.println("Transaction Commited..");
			}
			if(st.equalsIgnoreCase("n")){
				conn.rollback();
				System.out.println("Transaction Rollbacked..");
			}
			
			
		}catch(Exception e){
			try{
				/*if exception occurs while executing any query, we have to rollback all queries */
				conn.rollback();
				System.out.println("Exception Occured. Transaction Rollbacked..");
			}catch(Exception e1){
				e1.printStackTrace();	
			}
			
		}
		//close stmt & conn
	}
}
