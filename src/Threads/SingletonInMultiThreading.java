package Threads;

/*Singleton in multithreading*/
/*When 2 threads are trying to access a singleton class object, some times 2 instances are created, to avoid that we have to used synchronized(LOCK)*/
class Single {
	
	private static final Object LOCK = new Object();
	private  static Single single = null;
	private Single() {
	}
	static Single returnSingleInstance() {
		synchronized (LOCK) {
			if (single == null)
				single = new Single();
			return single;
		}
	}
}

class Thread_s1 extends Thread {
	@Override
	public void run() {
		Single s = Single.returnSingleInstance();
		System.out.println(s);
	}
}

class Thread_s2 extends Thread {
	@Override
	public void run() {
		Single s = Single.returnSingleInstance();
		System.out.println(s);
	}
}

public class SingletonInMultiThreading {
	public static void main(String[] args) {
		Thread_s1 t1 = new Thread_s1();
		Thread_s2 t2 = new Thread_s2();
		t1.start();
		t2.start();
	}
}
