package Jdbc;
/*Sample Connection Pool Example*/
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

class ConnectionPool{
	private static Map<Connection,Boolean> Connection_Pool=new HashMap<Connection,Boolean>();
	private static Connection conn=null;
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		init();
	}
	private static void init() {
		 for(int i=0;i<10;i++){
			 try {
				conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				Connection_Pool.put(conn,new Boolean(false));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 }
	}
	//get DB Connection
	synchronized Connection  use_dbConnection(){
		Set<Map.Entry<Connection,Boolean>> set=Connection_Pool.entrySet();
		for(Map.Entry<Connection,Boolean> entry:set){
			conn=entry.getKey() ;
			if(!entry.getValue())
				{
					Connection_Pool.put(conn, new Boolean(true));
					return conn;
				}
		}
		return null;
	}
	//return DB Connection
	synchronized  void return_used_dbConnection(Connection conn){
		Set<Map.Entry<Connection,Boolean>> set=Connection_Pool.entrySet();
		for(Map.Entry<Connection,Boolean> entry:set){
			conn=entry.getKey() ;
			if(entry.getValue()){
					Connection_Pool.put(conn, new Boolean(false));
					
				}
		}
	}
}
class Thread_1  implements Runnable{
	Connection conn=null;
	Statement stmt=null;
	ConnectionPool pool=new ConnectionPool();
	ResultSet rs_1=null;
	public Thread_1(ConnectionPool pool) {
		 this.pool=pool;
	}
	public void run(){
		conn=pool.use_dbConnection();
		try {
			stmt=(Statement)conn.createStatement();
			rs_1=(ResultSet) stmt.executeQuery("SELECT emp_id FROM employee");
			while(rs_1.next()){
				System.out.println("Thread_1 Data:  "+ rs_1.getInt(1));
			}
			rs_1.close();
			stmt.close();
			pool.return_used_dbConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
class Thread_2 implements Runnable{
	Connection conn=null;
	Statement stmt=null;
	ConnectionPool pool=new ConnectionPool();
	ResultSet rs_2;
	public Thread_2(ConnectionPool pool) {
		this.pool=pool;
	}
	public void run(){
		conn=pool.use_dbConnection();
		try {
			stmt=(Statement)conn.createStatement();
			rs_2=(ResultSet) stmt.executeQuery("SELECT emp_name FROM employee");
			while(rs_2.next()){
				System.out.println("Thread_2 Data:  "+rs_2.getString(1));
			}
			rs_2.close();
			stmt.close();
			
			pool.return_used_dbConnection(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
}
public class ConnectionpoolExample {
	public static void main(String[] args) {
		ConnectionPool pool=new ConnectionPool();
		Thread_1 d1=new Thread_1(pool);
		Thread_2 d2=new Thread_2(pool);
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		
		t1.start();
		t2.start();
	}
 }
