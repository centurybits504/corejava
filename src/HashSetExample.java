import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Manju");
		set.add("Jetti");
		set.add("Manju");
		set.add("raghu");
		set.add("amar");
		set.add(null);

		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String str = (String) it.next();
			System.out.println(str);
		}
	}
}
