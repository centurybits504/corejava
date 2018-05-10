package Generics;

import java.util.ArrayList;
import java.util.List;

/*Generic Wildcard : UpperBounded WildCard Problem */
/*The problem with this implementation is that it won’t work because , List<Integer> & List<Numbers> are not related in genrics, we can solve this problem with wildcards */
public class GenericWildCardUpperWildBounded_1_Example {

	public void display(List<Number> list)
	{
		for(Object t:list)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		 List<Integer> list=new ArrayList<>();
		 list.add(1);
		 list.add(2);
		//COMPILE-TIME ERROR : The method display(List<Number>) in the type GenericWildCardUpperWildBounded_1_Example is not applicable for the arguments (List<Integer>)
		new GenericWildCardUpperWildBounded_1_Example().display(list);

	}

}
