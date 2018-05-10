package Threads;

class MyPriorityOfAThread_1 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName() + "  -- "+Thread.currentThread().getPriority());
	}
}


public class PriorityOfAThread {

	public static void main(String[] args) {
		MyPriorityOfAThread_1 p1= new MyPriorityOfAThread_1();
		MyPriorityOfAThread_1 p2= new MyPriorityOfAThread_1();
		MyPriorityOfAThread_1 p3= new MyPriorityOfAThread_1();
		
		p1.setName("MyPriorityOfAThread_1");
		p2.setName("MyPriorityOfAThread_2");
		p3.setName("MyPriorityOfAThread_3");
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p2.setPriority(Thread.NORM_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
		
		p1.start();
		p2.start();
		p3.start();
	}

}

/*Every time we cannot expect the same output*/

/*First time execution output:
	MyPriorityOfAThread_1  -- 10
	MyPriorityOfAThread_2  -- 5
	MyPriorityOfAThread_3  -- 1

Second time execution output:
	MyPriorityOfAThread_1  -- 10
	MyPriorityOfAThread_3  -- 1
	MyPriorityOfAThread_2  -- 5
*/	

