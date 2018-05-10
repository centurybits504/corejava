package Jdbc;

/*ResultSet Interface Example : ResultSet objects: by default "CONCUR_READ_ONLY" & "TYPE_FORWARD_ONLY" */
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class ResultSetExampleByDefault {
	public static void main(String[] args) { 

		Connection conn=null;
		Statement stmt  =null;
		ResultSet rs_1 = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			stmt=(Statement) conn.createStatement();
			
			/*Selection Query*/
			rs_1=(ResultSet)stmt.executeQuery("SELECT * FROM EMPLOYEE");
			while(rs_1.next()){
				/*fetching records with columnIndex*/
				System.out.println(rs_1.getInt(1)+"  :  "+rs_1.getString(2));
				/*fetching records with columnLabel*/
				System.out.println(rs_1.getInt("Sno")+"  :  "+rs_1.getString("first_name"));
			}

		}catch(ClassNotFoundException cnfe){
			System.out.println(cnfe.getMessage());
		}catch(SQLException sqle){
			System.out.println(sqle.getMessage());
		}finally {
			try {
				if(rs_1!=null)
					rs_1.close();
				if(stmt!=null)
					stmt.close();
				if(conn!=null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
