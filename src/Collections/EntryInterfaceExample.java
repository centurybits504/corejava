package Collections;
/*Entry Interface Example*/
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class EntryInterfaceExample {
	public static void main(String[] args) {
		Map<String, Integer> _map = new HashMap<String, Integer>();
		_map.put("A", 100);
		_map.put("B", 101);

		Set<Entry<String, Integer>> _entrySet = _map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = _entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> _entry = it.next();
			System.out.println("KEY : "+_entry.getKey());
			System.out.println("VALUE :"+_entry.getValue());
		}
	}
}
