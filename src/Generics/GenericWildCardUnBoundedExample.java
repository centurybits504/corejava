package Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericWildCardUnBoundedExample {

	public void display(List<?> list)// (or) public void display(List<? extends Object>) - both are same
	{
		System.out.println(list); // Here we are not allowed to add anything to the list except null, otherwise we will get compile-error
	}
	public static void main(String[] args) {
	 
		List<Number> list_1=new ArrayList<Number>();
		list_1.add(1);
		list_1.add(2);
		
		new GenericWildCardUnBoundedExample().display(list_1);
		
		List<String> list_2=new ArrayList<>();
		list_2.add("A");
		list_2.add("B");
		
		new GenericWildCardUnBoundedExample().display(list_2);
		
	}
}
