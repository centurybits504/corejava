/*package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource{
	int count=100;
	Lock lock = new ReentrantLock();
	
	public  void doIncreament() {
		//it is better to use  try-finally block because lock will be released even if exception is thrown.
			try{
				lock.lock();
				System.out.println(Thread.currentThread().getName()  +" -- Incremented Count >> "+ ++count);
			}finally{
				lock.unlock();	
			}
	}
	public  void doDecrement() {
		try{
			lock.lock();
			System.out.println(Thread.currentThread().getName() +" -- Decremented Count >> "+ --count);
		}finally{
			lock.unlock();	
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

public class ReentrantLockExample {

	public static void main(String[] args) {
		Resource rs=new Resource();
		Thread t1=new Thread(new Increament_Thread(rs),"Increament_Thread");
		Thread t2=new Thread(new Decrement_Thread(rs),"Decrement_Thread");
		t1.start();
		t2.start();
		
	}

}
*/