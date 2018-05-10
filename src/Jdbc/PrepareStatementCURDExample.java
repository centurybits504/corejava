package Jdbc;

/*PreparedStatement Example: CURD */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class PrepareStatementCURDExample {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement psmt_1 = null,psmt_2 = null,psmt_3 = null,psmt_4 = null,psmt_5 = null;
		ResultSet rs_1 = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			
			/*Create Query*/
			 int _createStatus = psmt_1.executeUpdate("CREATE TABLE EMPLOYEE (Sno INTEGER not NULL,first_name VARCHAR(255),last_name VARCHAR(255));");
			 System.out.println("TABLE CREATION STATUS : "+_createStatus);
			 
			/*Selection Query*/ 
			psmt_1=(PreparedStatement)conn.prepareStatement("SELECT * FROM employee");
			rs_1=(ResultSet) psmt_1.executeQuery();
			while(rs_1.next()){
				System.out.println(rs_1.getInt(1) +" -- "+rs_1.getString(2));
			}
			
			/*Updation Query*/
			psmt_2=(PreparedStatement) conn.prepareStatement("UPDATE employee SET first_name=? WHERE last_name=? ");
			psmt_2.setString(1, "A"); 
			psmt_2.setString(2, "AA");
			int i=psmt_2.executeUpdate();
			System.out.println(i);
			
			/*Insertion Query*/
			int _insertStatus=psmt_2.executeUpdate("INSERT INTO EMPLOYEE VAUES(10,'B','BB)");
			System.out.println("RECORED INSERTION STATUS  : " + _insertStatus);
		  	
			/*Selection Query*/ 
			psmt_3=(PreparedStatement)conn.prepareStatement("SELECT * FROM employee");
			boolean b_2=psmt_3.execute();
			System.out.println(b_2);
			
			
			/*Updation Query*/
			psmt_4=(PreparedStatement)conn.prepareStatement("UPDATE employee SET first_name=? WHERE last_name=? ");
			psmt_4.setString(1, "A");
			psmt_4.setString(2, "AA");
			boolean b_1=psmt_4.execute();
			System.out.println(b_1); 
			
			/*Deletion Query*/
			int _deletionStatus=psmt_5.executeUpdate("DELETE * FROM EMPLOYEE where first_name='A' ");  
			System.out.println("RECORED DELETION STATUS : "+ _deletionStatus);  
			
			rs_1.close();
			psmt_1.close();psmt_2.close();psmt_3.close();psmt_4.close();psmt_5.close();
			conn.close();
			
		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}
	}
}
