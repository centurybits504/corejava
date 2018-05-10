package Threads;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

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
			//Waits until all parties have invoked await on this barrier. 
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
			cyclicBarrier.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() +" finished running");
	}
	
}

public class CyclicBarrierReuse {

	public static void main(String[] args) {
		RunnerTask rTask = new RunnerTask(); 
		CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
		Thread t1 = new Thread(new RunnerOne(rTask,cyclicBarrier),"RunnerOne");
		Thread t2 = new Thread(new RunnerTwo(rTask,cyclicBarrier),"RunnerTwo");
		System.out.println("RunnerOne and RunnerTwo started running..");
		
		t1.start();
		t2.start();

		try {
			//just making main thread at last
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		cyclicBarrier.reset();
		System.out.println("----------After reset CyclicBarrier----------");
		
		Thread t3 = new Thread(new RunnerOne(rTask,cyclicBarrier),"RunnerThree");
		Thread t4 = new Thread(new RunnerTwo(rTask,cyclicBarrier),"RunnerFour");
		System.out.println("RunnerThree and RunnerFour started running..");
		t3.start();
		t4.start();
		
		try {
			//just making main thread at last
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("\nMain thread finished execution.");
	}

}
