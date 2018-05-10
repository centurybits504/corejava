package Threads;

/*Thread Class Method Example: Sleeping A Thread*/
class MyThread_2 extends Thread{
	public void run(){
		System.out.println("Thread started....");
		try {
			System.out.println("Thread Sleeping...for 2 seconds");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Execution Finished....");
	}
}
public class SleepingAThread {

	public static void main(String[] args) {
		MyThread_2 t1 = new MyThread_2();
		t1.start();
	}

}
