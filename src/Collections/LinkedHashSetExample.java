package Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("B");
		set.add(null);
		System.out.println(set);
	}
}
