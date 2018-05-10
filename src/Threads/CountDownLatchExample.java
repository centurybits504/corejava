/*package Threads;

import java.util.concurrent.CountDownLatch;

class RunTask{
	public void running(){
		System.out.println(Thread.currentThread().getName() +" finished running");
	}
}
class Runner implements Runnable{

	RunTask rTask;
	CountDownLatch cDownLatch;
	public Runner(RunTask rTask,CountDownLatch cDownLatch) {
		this.rTask=rTask;
		this.cDownLatch=cDownLatch;
	}

	@Override
	public void run() {
		rTask.running();
		//Decrements the count of the latch, releasing all waiting threads if the count reaches zero. 
		cDownLatch.countDown();
	}
	
}
public class CountDownLatchExample {

	public static void main(String[] args) {
		RunTask rTask = new RunTask();
		CountDownLatch cDownLatch = new CountDownLatch(2);
		Thread t1 = new Thread(new Runner(rTask,cDownLatch),"Runner A");
		Thread t2 = new Thread(new Runner(rTask,cDownLatch),"Runner B");
		System.out.println("main thread is waiting to finish Runner threads execution..");
		t1.start();
		t2.start();
		try {
			//Causes the current thread to wait until the latch has counted down to zero, unless the thread is interrupted. 
			cDownLatch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main thread finished execution");
	}

}
*/