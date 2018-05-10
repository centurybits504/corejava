package SamplePrograms;

class ThreadTest1 extends Thread{
	
	@Override
	public void run(){
		System.out.println("in Test Thread 1" + Thread.currentThread().getPriority());
	}
	
}
/*class ThreadTest2 extends Thread{
	@Override
	public void run(){
		System.out.println("in Test Thread 2");
	}
}
*/
public class ThreadTest {

	public static void main(String[] args) {
		ThreadTest1 t1 = new ThreadTest1();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("in main thread" + Thread.currentThread().getPriority());
		for(int i=0;i<=10;i++){
			System.out.print(i);
		}
		System.out.println();
	}

}
