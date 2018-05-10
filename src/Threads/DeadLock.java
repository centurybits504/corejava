package Threads;

class BookTicket extends Thread{
	Object train,comp;
	public BookTicket(Object train,Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run(){
		synchronized (train) {
			System.out.println(Thread.currentThread().getName() +  " has a lock on train ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +  " has  lock on train and waiting for comp...");
			synchronized (comp) {
				System.out.println(Thread.currentThread().getName() +  " has a lock on comp ");
			}System.out.println(Thread.currentThread().getName() +  "  is out - released all locks");
		}
	}
}
class CancelTicket extends Thread{
	Object train,comp;
	CancelTicket(Object train,Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run(){
		synchronized(comp){
			System.out.println(Thread.currentThread().getName() + " has a lock on comp");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " has  lock on comp and waiting for train...");
			synchronized(train){
				System.out.println(Thread.currentThread().getName() + " has a lock on train ");
			}System.out.println(Thread.currentThread().getName() +  "  is out - released all locks");
		}
	}
}
public class DeadLock {

	public static void main(String[] args) {
		Object train = new Object();
		Object comp = new Object();
		BookTicket bt = new BookTicket(train,comp);
		CancelTicket ct = new CancelTicket(train,comp);
		bt.setName("BookTicket");
		ct.setName("CanceTicket");
		bt.start();
		ct.start();
	}

}
