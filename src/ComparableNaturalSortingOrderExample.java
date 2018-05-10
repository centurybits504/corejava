import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableNaturalSortingOrderExample {
	public static void main(String[] args) {
		 List<String> _stringList = new ArrayList<String>();
		 _stringList.add("A");
		 _stringList.add("C");
		 _stringList.add("B");
		 /*Here Collection is List and type of the collection elements is String.
		  String class implements the Comparable interface. So String objects can be comparable by-default.
		  */
		 /*Here sort():  Sorts the specified list into ascending order, according to the natural ordering of its elements.*/
		 Collections.sort(_stringList);
		 System.out.println(_stringList);
		 
		 List<Integer> _integerList = new ArrayList<>();
		 _integerList.add(1);
		 _integerList.add(3);
		 _integerList.add(2);
		 
		 /*Here Collection is List and type of the collection elements is Integer.
		  Integer class implements the Comparable interface. So Integer objects can be comparable by-default.
		  */
		 Collections.sort(_integerList);
		 System.out.println(_integerList);
		 
	}
}
