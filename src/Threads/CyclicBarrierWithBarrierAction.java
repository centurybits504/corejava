/*package Threads;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.BrokenBarrierException;

class RunnerTask{
	public void running(){
		System.out.println(Thread.currentThread().getName() +" doing something running..");
	}
}
class RunnerOne implements Runnable{

	RunnerTask rTask;
	CyclicBarrier cyclicBarrier;
	public RunnerOne(RunnerTask rTask,CyclicBarrier cyclicBarrier) {
		this.rTask=rTask;
		this.cyclicBarrier=cyclicBarrier;
	}

	@Override
	public void run() {
		try {
			rTask.running();
			System.out.println(Thread.currentThread().getName() +" Waiting for other..");
			//Waits until all parties have invoked await on this barrier point. 
			cyclicBarrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +" finished running");
	}
	
}
class RunnerTwo implements Runnable{

	RunnerTask rTask;
	CyclicBarrier cyclicBarrier;
	public RunnerTwo(RunnerTask rTask,CyclicBarrier cyclicBarrier) {
		this.rTask=rTask;
		this.cyclicBarrier=cyclicBarrier;
	}

	@Override
	public void run() {
		try {
			rTask.running();
			System.out.println(Thread.currentThread().getName() +" Waiting for other..");
			//Waits until all parties have invoked await on this barrier. 
			cyclicBarrier.await();//this is the barrier all threads are waiting for others
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +" finished running");
	}
	
}
class AfterBarrierAction implements Runnable{
	//after all the threads reach barrier, this action is performed by last reached thread
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +" performed after barrier action");
	}
}
public class CyclicBarrierWithBarrierAction {

	public static void main(String[] args) {
		RunnerTask rTask = new RunnerTask(); 
		AfterBarrierAction afterBarrierAction = new AfterBarrierAction();
		CyclicBarrier cyclicBarrier = new CyclicBarrier(2,afterBarrierAction);
		Thread t1 = new Thread(new RunnerOne(rTask,cyclicBarrier),"RunnerOne");
		Thread t2 = new Thread(new RunnerTwo(rTask,cyclicBarrier),"RunnerTwo");
		System.out.println("RunnerOne and RunnerTwo started running..");
		
		t1.start();
		t2.start();
		try {
			//just to keep main thread at last
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nMain thread finished execution.");
	}


	}


*/