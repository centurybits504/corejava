package Generics;

import java.util.ArrayList;
import java.util.List;

/*Note : In collections we cannot add primitive datatypes */
public class GenericListIntegerType {

	public static void main(String[] args) {
		
		/*Here a, b are primitive data types*/
		int a=100, b=200;
		
		/*Here List is of type Integer*/
		List<Integer> list = new ArrayList<Integer>();
		
		/*Here we're adding primitive datatypes in the collection(list)*/
		/*According to the above note we have to get error while adding. so what may be the reason for not get any error?*/
		/*The reason is  compiler automatically convert's primitive data-types to it's corresponding wrapper classes (this concept is called Auto-boxing)*/
		list.add(a);list.add(b);
		
		System.out.println(list);

	}

}
