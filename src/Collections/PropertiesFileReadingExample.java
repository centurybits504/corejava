package Collections;
/*Reading Properties Class Example*/
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileReadingExample {
	public static void main(String[] args){
		Properties _properties = new Properties();
		InputStream _input = null;
		try {
			_input = new FileInputStream("dbconfig.properties");
			/*Load a properties file*/ 
			_properties.load(_input);
			/*Get the property value*/ 
			System.out.println(_properties.getProperty("DATABASE"));
			System.out.println(_properties.getProperty("DBUSER"));
			System.out.println(_properties.getProperty("DBPASSWORD"));
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} 
	}
}
