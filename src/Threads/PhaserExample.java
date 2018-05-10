/*package Threads;
//incomplete
import java.util.concurrent.Phaser;

class RunTask{
	public void running(){
		System.out.println(Thread.currentThread().getName() +" finished running");
	}
}
class Runner implements Runnable{

	RunTask rTask;
	Phaser phaser;
	public Runner(RunTask rTask,Phaser phaser) {
		this.rTask=rTask;
		this.phaser=phaser;
	}
	@Override
	public void run() {
		rTask.running();
	}
	
}

public class PhaserExample {

	public static void main(String[] args) {
		Phaser phaser = new Phaser(1);
		RunTask rTask = new RunTask();
		Thread t1 = new Thread(new Runner(rTask,phaser),"Runner A");
		Thread t2 = new Thread(new Runner(rTask,phaser),"Runner B");
		phaser.register();
		t1.start();
		t2.start();
		int count1 = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		phaser.arriveAndDeregister();
		System.out.println("phase one completed..");
		
		Thread t3 = new Thread(new Runner(rTask,phaser),"Runner A");
		Thread t4 = new Thread(new Runner(rTask,phaser),"Runner B");
		phaser.register();
		t3.start();
		t4.start();
		int count2 = phaser.getPhase();
		phaser.arriveAndAwaitAdvance();
		phaser.arriveAndDeregister();
		System.out.println("phase one completed..");
		
	}

}
*/