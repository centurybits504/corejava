/*package Temp;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class TestResourse{
	String str = "A";
	Lock lock = new ReentrantLock();
	public void Compare1() {
		try{
			lock.lock();
		if ("A".equals(str)) {
			System.out.println("in Compare1");
			Compare2();
		}
		}finally{
			lock.unlock();
		}
	}
	public  void Compare2() {
		try{
			lock.lock();
		if ("A".equals(str)) {
			System.out.println("in Compare2");
		}
		}finally{
			lock.unlock();
		}
	}
	
}
class TestThread implements Runnable{

	TestResourse trResourse;
	public TestThread(TestResourse trResourse) {
		this.trResourse=trResourse;
	}

	@Override
	public void run() {
		trResourse.Compare1();
	}
	
}

public class CheckingReentrant_Using_ReentrantLock {

	public static void main(String[] args) {
		TestResourse trResourse = new TestResourse();
		Thread t = new Thread(new TestThread(trResourse));
		t.start();
		
	}

}
*/