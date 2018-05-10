package Jdbc;

/*RowSet interface Example : JdbcRowSet Class*/
import java.sql.SQLException;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

public class RowSetInterfaceJdbcRowSetExample {
	public static void main(String[] args) {
		String URL = "jdbc:mysql://localhost:3306/test";
		String USERNAME = "root";
		String PASSWORD = "root";
		try {
        /*create a factory object for RowSet interface*/
        RowSetFactory rowSetFactory = RowSetProvider.newFactory();

        /*creating JdbcRowSet object from factory*/
        JdbcRowSet rowSet = rowSetFactory.createJdbcRowSet();

        /*Setting connection properties*/
        rowSet.setUrl(URL);
        rowSet.setUsername(USERNAME);
        rowSet.setPassword(PASSWORD);

        /*Executing SQL Query*/ 
        rowSet.setCommand("SELECT * FROM Employee");
        rowSet.execute();
        System.out.println("ID --  FIRST_NAME -- LAST_NAME -- DEPARTMENT -- SALARY ");

        /*Iterating the  RowSet*/ 
        while (rowSet.next()) {
            System.out.println(rowSet.getInt("id") + " -- "
                    + rowSet.getString("firstname") + " -- "
                    + rowSet.getString("lasrname") + " -- "
                    + rowSet.getString("department") + " -- "
                    + rowSet.getInt("salary"));
        }
    } catch (SQLException sqle) {
        sqle.printStackTrace();
    }
	}
}
