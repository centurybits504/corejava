package Jdbc;

/*CallableStatement Example: calling Procedure*/
import java.sql.CallableStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

public class CallableStatementProcedureExample {
	public static void main(String[] args) {
		Connection conn = null;
		CallableStatement cstmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "root");
			cstmt = conn.prepareCall("{call myProc()}");
			cstmt.executeQuery();
			System.out.println(cstmt.getInt(1));
		} catch (ClassNotFoundException cnfe) {
			System.out.println(cnfe.getMessage());
		} catch (SQLException sqle) {
			System.out.println(sqle.getMessage());
		}finally{
			if(cstmt!=null)
				try {
					cstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			if(conn!=null)
				 try{
					 conn.close();
				 }catch (Exception e) {
					e.printStackTrace();
				}
		}
	}
}
