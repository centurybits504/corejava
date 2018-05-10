package Threads;

/*Thread Class Method Example: Sleeping A Thread*/
class MyThread_4 extends Thread{
	
	String threadName;
	MyThread_4(String threadName) {
		this.threadName=threadName;
		/*Here if you dont set Thread name bydefault it will give thread name as " Thread-0" */
		this.setName(threadName);
 	}
	 public void run(){
		 System.out.println("Thread Name Id : "+this.getName());
	 }
}
public class NamingAThread {

	public static void main(String[] args) {
		MyThread_4 t1 = new MyThread_4("A");
		t1.start();
	}
}
