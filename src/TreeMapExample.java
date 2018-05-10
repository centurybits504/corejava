/*TreeMap Example*/
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		 Map<String,Integer> _treeMap=new TreeMap<String,Integer>();  
		 _treeMap.put("A",10);  
		 _treeMap.put("C",20);  
		 _treeMap.put("B",30);  
		  
		for(Map.Entry _entry:_treeMap.entrySet()){  
		   System.out.println(_entry.getKey()+" -- "+_entry.getValue());  
		  }  
	}
}
