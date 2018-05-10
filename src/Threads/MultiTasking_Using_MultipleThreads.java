package Threads;

class MyTaskThread_1 extends Thread{//our Thread class
	
	String threadName;
	MyTaskThread_1(String threadName){
		this.threadName = threadName;
		this.setName(threadName);
	}
	
	public void run(){
 		taskOne();
		taskTwo();
		taskThree();
	}

	private void taskThree() {
		System.out.println("This task(taskThree) is done by, "+ this.getName() );
		
	}

	private void taskTwo() {
		System.out.println("This task(taskTwo) is done by, "+ this.getName() );
		
	}

	private void taskOne() {
		System.out.println("This task(taskOne) is done by, "+ this.getName() );
		
	}
	
}


public class MultiTasking_Using_MultipleThreads {

	public static void main(String[] args) {
		MyTaskThread_1 threadObj_1 = new MyTaskThread_1("Thread-1");
		MyTaskThread_1 threadObj_2 = new MyTaskThread_1("Thread-2");
		threadObj_1.start(); 
		threadObj_2.start();
		

	}

}

/*
OUTPUT: 
This task(taskOne) is done by, Thread-1
This task(taskOne) is done by, Thread-2
This task(taskTwo) is done by, Thread-2
This task(taskThree) is done by, Thread-2
This task(taskTwo) is done by, Thread-1
This task(taskThree) is done by, Thread-1 
 
  
  
*/
