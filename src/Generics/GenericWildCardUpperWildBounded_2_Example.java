package Generics;

import java.util.ArrayList;
import java.util.List;

/*Generic Wildcard : UpperBounded WildCard Example */
public class GenericWildCardUpperWildBounded_2_Example {

	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(100);
		intList.add(200);
		intList.add(400);
		int total = add(intList);
		System.out.println("Total : " + total);

	}

	public static int add(List<? extends Number> list) {
		
		//Here we are not allowed to add anything to the list except null	
		//list.add(null); // No Compile Time Error
		//list.add(11);	//Compile Time Error
				
		int total = 0;
		for (Number num : list) {
			total += num.intValue();
		}
		return total;
	}
}

