package Temp;

import java.util.ArrayList;
import java.util.List;

public class TestArray {
	
	public static void main(String[] args) {
		
		List list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(1);
		list.add(2);
		
		
		list.remove(1);
		System.out.println(list);//remove in index position
		
		
		list.remove(new Integer(1));//remove element
		
		System.out.println(list);

	}

}
