package Threads;


import java.util.concurrent.Exchanger;
 
/*Sequential_Thread_Execution using Exchanger -- Note only 2 threads */
class Thread_Data{
	
	Boolean status;
	Exchanger<Boolean> exchanger;
	public    void display(Boolean status,Exchanger<Boolean> exchanger){
		for(int i=1;i<=4;i++){
			
			//System.out.println(Thread.currentThread().getName() +" -- "+ i);
			if(status)
			System.out.println(Thread.currentThread().getName() +" -- "+ i);
			
			try {
				status=exchanger.exchange(status);
			} catch (InterruptedException e) {
				 e.printStackTrace();
			}
		}
	}
}

class Thread_111 extends Thread{
	
	Thread_Data td=null;
	Exchanger<Boolean> exchanger=null;
	Boolean status;
	Thread_111(Thread_Data td,Exchanger<Boolean> exchanger,Boolean status){
		this.td=td;
		this.exchanger=exchanger;
		this.status=status;
		
	}
	public void run(){
		td.display(status,exchanger);
	}
}
class Thread_222 extends Thread{
	
	Thread_Data td=null;
	Exchanger<Boolean> exchanger=null;
	Boolean status;
	Thread_222(Thread_Data td, Exchanger<Boolean> exchanger, Boolean status){
		this.td=td; 
		this.exchanger=exchanger;
		this.status=status;
	}
	public void run(){
		td.display(status,exchanger);
	}
	
}

public class Sequential_Thread_Execution {

	public static void main(String[] args) {
		 
		Exchanger<Boolean> exechanger=new Exchanger<Boolean>();
		Thread_Data td=new Thread_Data();
		Thread_111 t1=new Thread_111(td,exechanger,true);
		Thread_222 t2=new Thread_222(td,exechanger,false);
		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t2.start();
	}

}
/*
//http://kickroot.com/?p=14
My second (and correct) approach was to use an Exchanger.
An Exchanger basically allows two threads(only) to swap objects of the same type in a thread-safe manner.
Assuming we have an Exchanger, my two threads can swap boolean values with each other as follows:

state = exchanger.exchange(state);

So if we were to craft two Runnables with opposing Boolean values (one true, the other false), they would swap those values in a thread safe manner when reaching the above line of code. Full example:

*/