/*LinkedHahMap Example*/
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		 Map<String,Integer> _hashMap=new LinkedHashMap<String,Integer>();  
		 _hashMap.put("A",10);  
		 _hashMap.put("B",20);  
		 _hashMap.put("C",30);  
		  
		for(Map.Entry<String,Integer> _entry:_hashMap.entrySet()){  
		   System.out.println(_entry.getKey()+" -- "+_entry.getValue());  
		  }  
	}
}
