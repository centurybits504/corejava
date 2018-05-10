package Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<String>();
		set.add("A");
		set.add("C");
		set.add("A");
		set.add("B");

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
	}
}
