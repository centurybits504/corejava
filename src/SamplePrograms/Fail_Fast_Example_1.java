package SamplePrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
 
//avoiding concurrentModification exception

// Thread_1 tries to iterate Connection_Pool &  Thread_2 tries to remove at the same time,so  concurrentModification exception will come.
//Here HashMap is accessing to both threads at a time ,so we have to avoid  it.
//so we need to use HashMap which is thread-safe i.e, ConcurrentHashMap.
//not sure working corrrectly
class data_1{
	private static Map<String,Integer> Connection_Pool=new HashMap<String,Integer>(); // exception occur
	//(or)
	//private static Map<String,Integer> Connection_Pool=new ConcurrentHashMap<String,Integer>(); //n't occure
	static{
		init();
	}
	private static void init() {
		Connection_Pool.put("A",1);
		Connection_Pool.put("B",2);
		Connection_Pool.put("C",3);
		Connection_Pool.put("D",4);
	}
	
	  void use_d_1(){
		 
			Set<Map.Entry<String,Integer>> set=Connection_Pool.entrySet();
			for(Map.Entry<String,Integer> entry:set){
				System.out.println(entry.getKey() +"-1-"+entry.getValue()) ;
			}
		 
	}
	
	  void use_d_2(){
		 Connection_Pool.remove("D");
			/*Set<Map.Entry<String,Integer>> set=Connection_Pool.entrySet();
			for(Map.Entry<String,Integer> entry:set){
				System.out.println(entry.getKey() +"-2-"+entry.getValue()) ;
				 
			}*/
		 
	}
	
}
class Thread_1 extends Thread{
	 
	data_1 dt;
	public Thread_1(data_1 dt) {
		this.dt=dt;
	}

	public void run() {
		new data_1().use_d_1();
	}
}
class Thread_2 extends Thread{
	
	data_1 dt;
	public Thread_2(data_1 dt) {
		this.dt=dt;
	}

	public void run() {
		new data_1().use_d_2();
	}
}

public class Fail_Fast_Example_1 {

	public static void main(String[] args) {
		
		data_1 dt=new data_1();
		Thread_1 t1=new Thread_1(dt);
		Thread_2 t2=new Thread_2(dt);
		t1.start();t2.start();
		
	}

}
