package Collections;
/*HashMap Interface Example*/
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> _map = new HashMap<String, Integer>();
		_map.put("A", 100);
		_map.put("B", 101);

		Set<Entry<String, Integer>> _entrySet = _map.entrySet();
		for(Map.Entry<String, Integer> _entry :  _entrySet){
     		System.out.println("KEY : "+_entry.getKey());
			System.out.println("VALUE :"+_entry.getValue());
		}
	}
}
