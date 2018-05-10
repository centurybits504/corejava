package Newfeatures;

/*java 5 features - Generics Example*/
import java.util.ArrayList;
import java.util.List;


public class Java5Features_Generics_Example {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
 		
		String firstName= (String)list.get(0);
		String lastName= (String)list.get(1);
		System.out.println("firstName " + firstName);
		System.out.println("lastName " + lastName);
		
	}

}
