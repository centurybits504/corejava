package Collections;

/*NavigableMap interface Example*/
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapExample {
	public static void main(String[] args) {
		NavigableMap<String, Integer> navigableMap = new TreeMap<String, Integer>();
		navigableMap.put("A", 100);
		navigableMap.put("B", 300);
		navigableMap.put("E", 200);
		navigableMap.put("F", 400);
		navigableMap.put("C", 600);
		navigableMap.put("D", 500);

		System.out.printf("DESCENDING", navigableMap.descendingKeySet());
		System.out.printf("FIRST ENTRY  : %s%n", navigableMap.firstEntry());
		System.out.printf("LAST KEY : %s%n", navigableMap.lastKey());
		System.out.printf("FIRST KEY : %s%n", navigableMap.firstKey());
		System.out.printf("REVERSE MAP : %s%n", navigableMap.descendingMap());
		System.out.printf("FLOOR ENTRY  : %s%n", navigableMap.floorEntry("L"));
	}
}
