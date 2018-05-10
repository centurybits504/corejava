package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsListOfStringTest {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		/*COMPILE TIME ERROR -  The method add(String) in the type List<String> is not applicable for the arguments (Integer)*/
		list.add(new Integer(10)); 
		
		String s1= (String)list.get(0);
		String s2= (String)list.get(1);
		String s3= (String)list.get(2);
		
	}

}
