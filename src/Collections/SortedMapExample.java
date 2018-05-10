package Collections;
/*SortedMap Interface Example*/
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
	public static void main(String[] args) {
		 SortedMap<String,Integer> _treeMap=new TreeMap<String,Integer>();  
		 _treeMap.put("A",10);  
		 _treeMap.put("C",20);  
		 _treeMap.put("B",30);  
		  
		for(Map.Entry _entry:_treeMap.entrySet()){  
		   System.out.println(_entry.getKey()+" -- "+_entry.getValue());  
		  }  
	}

}
