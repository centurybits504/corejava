package Othersampleprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TempHashInternals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map = new HashMap<>();
		System.out.println(map.put(1,"A"));
		System.out.println(map.put(1,"B"));
		System.out.println(map);
		
		Set<Integer> set = new HashSet<>();
		System.out.println(set.add(1)); // 1, present >>   map.put(1, PRESENT)==null	>> returns null  
		System.out.println(set.add(1)); //  1, present >>     map.put(1, PRESENT)==null  >> return false
		System.out.println(set); 
	}

}
