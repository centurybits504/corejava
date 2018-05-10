package Threads;

import java.util.Scanner;

class Resource{
	
	int count=100;
	public synchronized void doIncreament() {
			System.out.println(Thread.currentThread().getName()  +" -- incremented Count >> "+ ++count);
			System.out.println(Thread.currentThread().getName()  +" waiting..");
			try {
				wait();
				System.out.println(Thread.currentThread().getName() +" notified and finished execution");
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
public class WaitAndNotify_Methods {

	public static void main(String[] args) throws InterruptedException {
		Resource rs=new Resource();
		Thread t1=new Thread(new Increament_Thread(rs),"Increament_Thread");
		Thread t2=new Thread(new Decrement_Thread(rs),"Decrement_Thread");
		t1.start();
		t2.start();
	}

}
