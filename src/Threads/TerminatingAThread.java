package Threads;

/*Thread Class Method Example: Sleeping A Thread*/
class MyThread_3 extends Thread{
	public void run(){
		System.out.println("Thread started....");
		try {
			Thread.sleep(2000);
			System.out.println("-");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread Execution Finished....");
	}
}
public class TerminatingAThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread_3().start();
	}

}
