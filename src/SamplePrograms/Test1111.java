package SamplePrograms;
import java.util.ArrayList;

/*
class A{
	public  B  show(){
		System.out.println("1");
		return null;
	
}
class B extends A{
	public A  show(){
		System.out.println("2");
		return null;
	} 
}
*/
public class Test1111 extends Thread implements Runnable {

	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Thread t = new Thread(new Test1111());
			t.start();
		}catch(Exception e){
			
		}
		  
		  
		  
		 
	}
	
}
	  
		
		
	 
	
	/*static int aaa(){
		try{
			System.out.println("--");
			return 0;
		}catch(Exception e){
System.out.println("11");
return 1;
} 
	}
*/

