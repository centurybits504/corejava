/*Properties Class Example*/
import java.util.Properties;
import java.util.Set;

public class PropertiesClassExample {
	public static void main(String[] args) {
		Properties _properties = new Properties();
		_properties.put("A", "AA");
		_properties.put("B", "BB");
	     
	     Set<?> set = _properties.keySet();
	     for(Object object : set)
	     {
	         System.out.println("KEY : " + object+",VALUE : "+ _properties.getProperty((String)object) );
	     }
	}
}

