package Generics;

/*Generics in java example*/
import java.util.ArrayList;
import java.util.List;

public class GenericsListOfStringType {

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
