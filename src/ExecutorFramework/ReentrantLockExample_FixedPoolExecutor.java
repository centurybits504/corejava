/*package ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Resource{
	int count=100;
	Lock lock = new ReentrantLock();
	
	public  void doIncreament() {
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

public class ReentrantLockExample_FixedPoolExecutor {
	
	public static void main(String[] args) {
		Resource resource = new Resource();
		Executor executor = Executors.newFixedThreadPool(2);
		executor.execute(new Increament_Thread(resource));
		executor.execute(new Decrement_Thread(resource));
		
	}

}
*/