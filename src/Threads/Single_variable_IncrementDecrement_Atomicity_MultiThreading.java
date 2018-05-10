package Threads;

import java.util.concurrent.atomic.AtomicInteger;

class Data_11{
	AtomicInteger ai = new AtomicInteger(0);
	public  void increment(){
		for(int i=1;i<=2;i++){
			System.out.println(Thread.currentThread().getName() + " :: " +  ai.get() + " :: " + ai.getAndIncrement()+ " -- " +  ai.get()  );
		}
	}
	public void decrement(){
		for(int i=1;i<=2;i++){
			System.out.println(Thread.currentThread().getName() + " :: " +  ai.get() + " :: " + ai.getAndDecrement() + " -- " +  ai.get() );
		}
	}
}
class Runner_11 implements Runnable{
	
	Data_11 d;
	Runner_11(Data_11 d){
		this.d = d;
	}
	@Override
	public void run() {
			d.increment();
	}
	
}
class Runner_22 implements Runnable{

	Data_11 d;
	Runner_22(Data_11 d){
		this.d = d;
	}
	@Override
	public void run() {
			d.decrement();
	}
	
}
public class Single_variable_IncrementDecrement_Atomicity_MultiThreading {

	public static void main(String[] args) {
		Data_11 d = new Data_11();
		Thread t1 = new Thread(new Runner_11(d),"Increment");
		Thread t2 = new Thread(new Runner_22(d),"Decrement");
		t1.start();
		t2.start();
	}

}
