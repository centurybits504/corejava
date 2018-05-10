package Threads;

/**/
class MyRunnable_1 implements Runnable{
	public void run(){
		System.out.println("Creating Thread By Implementing Runnable Interface");
	}
}
public class CreatingThreadByImplementingRunnableInterface {

	public static void main(String[] args) {
		MyRunnable_1 r = new MyRunnable_1();
		Thread t1 = new Thread(r);
		t1.start();
	}
}
