/*package Threads;


import java.util.concurrent.locks.Lock;

class Resource{
	
	int count=100;
	StampedLock  splock = new StampedLock();//java 8
	
	public  void doReadLock() {
			long stamp = splock.readLock();
			try{
				System.out.println(Thread.currentThread().getName()  +" -- ReadLock >> "+ count);
			}finally{
				splock.unlockRead(stamp);	
			}
	}
	public  void doWriteLock() {
		long stamp = splock.writeLock();
		try{
			System.out.println(Thread.currentThread().getName() +" -- WriteLock >> "+ ++count);
		}finally{
			splock.unlockWrite(stamp);	
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
		rs.doReadLock();
	}
}
class Decrement_Thread implements Runnable{
	Resource rs;
	public Decrement_Thread(Resource rs) {
		this.rs=rs;
	}
	@Override
	public void run() {
		rs.doWriteLock();
	}
}

public class StampedLockExample {

	public static void main(String[] args) {
		Resource rs=new Resource();
		Thread t1=new Thread(new Increament_Thread(rs),"ReadLock_Thread");
		Thread t2=new Thread(new Decrement_Thread(rs),"WriteLock_Thread");
		t1.start();
		t2.start();
	}

}
*/