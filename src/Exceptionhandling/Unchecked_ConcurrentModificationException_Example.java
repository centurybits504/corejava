package Exceptionhandling;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*Unchecked  : ConcurrentModificationException : Example*/
class MyConcurrentThread_1 extends Thread{
	Double d;
	MyConcurrentThread_1(Double d){
		this.d=d;
	}
	public void run(){
		new MyData().addElementToList(d);
	}
}
class MyConcurrentThread_2 extends Thread{
	Double d;
	MyConcurrentThread_2(Double d){
		this.d=d;
	}
	public void run(){
		new MyData().removeElementFromList(d);
	}
}
class MyData{
	List<Double> list = new ArrayList<>();
	MyData(){
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
	}
	public void addElementToList(double d){
		Iterator<Double> it = list.iterator();
		while(it.hasNext()){
			double dd = it.next();
			if(dd == d){
				//already exist, so no need to add
			}else{
				list.add(d);
			}
		}
		
	}
	public void removeElementFromList(double d){
		Iterator<Double> it = list.iterator();
		while(it.hasNext()){
			double dd = it.next();
			if(dd == d){
				list.remove(d);
			}else{
				//element not exist, so no need to remove
			}
		}
	}
	 
}
public class Unchecked_ConcurrentModificationException_Example {

	public static void main(String[] args) {
		
		/*adding elements to list*/
		List<Double> list = new ArrayList<>();
		list.add(1.0);
		list.add(2.0);
		list.add(3.0);
		list.add(4.0);
		
		/*this thread tries to add elements in list*/
		MyConcurrentThread_1 myct_1 = new MyConcurrentThread_1(2.0);
		/*this thread tries to remove elements in same list*/
		MyConcurrentThread_2 myct_2 = new MyConcurrentThread_2(6.0);
		myct_1.start();
		myct_2.start();
		
		
	}

}
