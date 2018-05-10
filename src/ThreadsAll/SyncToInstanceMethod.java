package ThreadsAll;

/*Object level locking	*/
class DataBlockOne extends Thread{
	public synchronized void display(){
			System.out.println("In Synchronized Methods ");
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("In DataBlockOne");
		}
}
class ThreadBlockOne extends Thread{
	DataBlockOne data;
	ThreadBlockOne(DataBlockOne data) {
		this.data=data;
	}
	@Override
	public void run() {
		data.display();
	}
}
class ThreadBlockTwo extends Thread{
	DataBlockOne data;
	ThreadBlockTwo(DataBlockOne data) {
		this.data=data;
	}
	@Override
	public void run() {
		data.display();
	}
}

public class SyncToInstanceMethod{
	
	public static void main(String[] args) {
	DataBlockOne data = new DataBlockOne();
	ThreadBlockOne t1 = new ThreadBlockOne(data);
	ThreadBlockTwo t2 = new ThreadBlockTwo(data);
	t1.start();
	t2.start();
	}
	
}
