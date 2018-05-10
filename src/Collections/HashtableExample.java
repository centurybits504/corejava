package Collections;
import java.util.Hashtable;
import java.util.Map;
public class HashtableExample {
	public static void main(String[] args) {
		Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(100,"A");  
		  hm.put(102,"B");  
		  hm.put(101,"C");  
		  hm.put(103,"D");  
		  System.out.println(hm.size());
		  System.out.println(hm.hashCode());
		  for(Map.Entry<Integer,String> m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
	}

}
