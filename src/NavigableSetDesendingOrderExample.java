import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDesendingOrderExample {
	public static void main(String[] args) {
		NavigableSet<String> _items = new TreeSet<String>();
		_items.add("A");
		_items.add("A");/*duplicates are n't allowed*/
		_items.add("D");
		_items.add("C");
		_items.add("B");
		 
		System.out.println("Items :  " + _items);
		Iterator<String> _descIterator = _items.descendingIterator();
		 
		System.out.print("Items After Descending Order :  ");
		System.out.print("[ "); 
		while (_descIterator.hasNext()) {
		    System.out.print(_descIterator.next()+" ");
		}
		System.out.println(" ] ");
		
	}

}
