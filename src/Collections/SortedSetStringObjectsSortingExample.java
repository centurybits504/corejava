package Collections;

/* In this we are sorting String objects
 * Add String objects to the SortedSet.
 * String class implements the Comparable interface.
 * So SortedSet can use the Comparable interface and it's  compareTo() to sort the String objects.
 * All Wrapper Classes implements Comparable interface. So we can use all Wrapper Classes in this example 
 */
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetStringObjectsSortingExample {
	public static void main(String[] args) {
 	    SortedSet<String> _sortedSet = new TreeSet<>();
 	    _sortedSet.add("A");
 	    _sortedSet.add("B");
 	    _sortedSet.add("C");
 	   _sortedSet.add("B");/*duplicates are n't allowed*/
 	 //_sortedSet.add(null);/*NullPointerException*/
	    System.out.println(_sortedSet);
	}
}
