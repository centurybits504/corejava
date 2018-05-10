package Threads;

class MyTaskThread extends Thread{//our Thread class
	
	String threadName;
	MyTaskThread(String threadName){
		this.threadName = threadName;
		this.setName(threadName);
	}
	
	public void run(){
	/*These tasks are done by single thread (here MyTaskThread) one-by-one*/	
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

public class SingleTasking_Using_A_SingleThread {

	public static void main(String[] args) {
		MyTaskThread singleThreadObj = new MyTaskThread("Thread -1");
		singleThreadObj.start();
	}

}


/*

This task(taskOne) is done by, Thread -1
This task(taskTwo) is done by, Thread -1
This task(taskThree) is done by, Thread -1

*/
