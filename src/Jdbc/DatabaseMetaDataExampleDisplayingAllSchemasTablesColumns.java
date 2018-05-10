package Jdbc;

/*DatabaseMetaData Interface Example: Displaying all schemas along with tables and column names */
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
public class DatabaseMetaDataExampleDisplayingAllSchemasTablesColumns {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
		DatabaseMetaData dbmd = conn.getMetaData();
		ResultSet rs_1 = (ResultSet) dbmd.getCatalogs();
		ResultSet rs_2 = null; ResultSet rs_3 = null;
		
		//LIST SCHEMA NAMES
		while(rs_1.next()){
			String SCHEMA_NAME = rs_1.getString(1);
		
			//LIST SCHEMA & TABLES NAMES
			String[] types = {"TABLE"};
			rs_2 = (ResultSet) dbmd.getTables(SCHEMA_NAME,null,null,types);
			while(rs_2.next()){
				String SCHEMA_NAMES = rs_2.getString(1);
				String TABLE_NAMES = rs_2.getString(3);
				
				//LIST SCHEMA & TABLES  & COLUMN NAMES
				rs_3 = (ResultSet) dbmd.getColumns(SCHEMA_NAMES, null, TABLE_NAMES, null);
				while(rs_3.next()){
					System.out.println(rs_3.getString(1) +" >> "+rs_3.getString(3)+" >> "+rs_3.getString(4));
				}
			}
			
		}
	}

}
