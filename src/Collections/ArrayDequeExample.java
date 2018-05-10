package Collections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeExample {
	public static void main(String[] args) {
		
		   Deque<String> deque = new ArrayDeque<String>();
 		   deque.add("A");
		   deque.add("B");
		   deque.add("D");
		   deque.add("C");

 		   Iterator<String> itr = deque.iterator();
		   while(itr.hasNext()){
			   String str  = (String)itr.next();
			   System.out.println(str);
		   }
	}
}
