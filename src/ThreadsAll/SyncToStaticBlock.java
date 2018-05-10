package ThreadsAll;

/*Class level locking	*/
class DataBlockOne extends Thread{
	public static void display(){
		synchronized (DataBlockOne.class){
			System.out.println("In Static Synchronized Block ");
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("In DataBlockOne");
		}
	}
}
class ThreadBlockOne extends Thread{
	@Override
	public void run() {
		DataBlockOne.display();
	}
}
class ThreadBlockTwo extends Thread{
	@Override
	public void run() {
		DataBlockOne.display();
	}
}

public class SyncToStaticBlock {

	public static void main(String[] args) {
		ThreadBlockOne t1 = new ThreadBlockOne();
		ThreadBlockTwo t2 = new ThreadBlockTwo();
		t1.start();
		t2.start();
 	}
	
}
