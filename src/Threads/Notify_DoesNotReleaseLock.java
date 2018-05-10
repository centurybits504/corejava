/*package Threads;

import java.util.Scanner;

class Resource{
	int count=100;
	public synchronized void doIncreament() {
			System.out.println(Thread.currentThread().getName()  +" -- incremented Count >> "+ ++count);
			System.out.println(Thread.currentThread().getName()  +" waiting..");
			try {
				wait();
				System.out.println(Thread.currentThread().getName() +" finished execution");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
	public synchronized void doDecrement() {
		System.out.println(Thread.currentThread().getName() +" -- decremented Count >> "+ --count);
		System.out.println(Thread.currentThread().getName() +" finished execution");
		
		System.out.println("Press enter to exit Increament_Thread..");
		String someText = new Scanner(System.in).nextLine();
		
		notify();
			try {
				System.out.println("Sleep for 5 seconds.. and continue..");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}
class Increament_Thread implements Runnable{
	Resource rs;
	public Increament_Thread(Resource rs) {
		this.rs=rs;
	}
	@Override
	public void run() {
		rs.doIncreament();
	}
}
class Decrement_Thread implements Runnable{
	Resource rs;
	public Decrement_Thread(Resource rs) {
		this.rs=rs;
	}
	@Override
	public void run() {
		rs.doDecrement();
	}
}
public class Notify_DoesNotReleaseLock {

	public static void main(String[] args) {
		Resource rs=new Resource();
		Thread t1=new Thread(new Increament_Thread(rs),"Increament_Thread");
		Thread t2=new Thread(new Decrement_Thread(rs),"Decrement_Thread");
		t1.start();
		t2.start();
	}

}
*/