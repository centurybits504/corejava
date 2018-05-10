package Generics;

import java.util.ArrayList;
import java.util.List;

/*Generic Wildcard : LowerBounded WildCard Example */
public class GenericWildCardLowerBoundedExample {

	private void display(List<? super Integer> list_1) 	//Here lower bound is Integer ,so we can pass Integer(Which is lower bounded)
	{												  	//we can pass Number(Which is super of Integer)
													  	//we can pass Object(which is a super of Number)	
		System.out.println(list_1);
	}
	
	public static void main(String[] args) {
		
		List<Number> list_1=new ArrayList<Number>();
		list_1.add(10);
		list_1.add(20);
		new GenericWildCardLowerBoundedExample().display(list_1);
		
		List<Integer> list_2=new ArrayList<Integer>();
		list_2.add(110);
		list_2.add(220);
		new GenericWildCardLowerBoundedExample().display(list_2);
		
		List<Object> list_3=new ArrayList<Object>();
		list_3.add(1110);
		list_3.add(2220);
		new GenericWildCardLowerBoundedExample().display(list_3);
	}
}