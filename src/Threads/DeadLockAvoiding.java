package Threads;

class BookTicket_1 extends Thread{
	Object train,comp;
	public BookTicket_1(Object train,Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run(){
		synchronized (train) {
			System.out.println(Thread.currentThread().getName() +  " has a lock on train" );
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() +  " has  lock on train and waiting for comp...");
			synchronized (comp) {
				System.out.println(Thread.currentThread().getName() +  " has a lock on comp ");
			}
		}System.out.println(Thread.currentThread().getName() +  "  is out - released all locks");
	}
	
}
class CancelTicket_1 extends Thread{
	Object train,comp;
	CancelTicket_1(Object train,Object comp) {
		this.train = train;
		this.comp = comp;
	}
	public void run(){
		synchronized(train){
			System.out.println(Thread.currentThread().getName() + " has a lock on train");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " has lock on train  and waiting for comp...");
			synchronized(comp){
				System.out.println(Thread.currentThread().getName() + " has a lock on comp ");
			}
		}System.out.println(Thread.currentThread().getName() +  "  is out - released all locks");
	}
}
public class DeadLockAvoiding {

	public static void main(String[] args) {
		Object train = new Object();
		Object comp = new Object();
		BookTicket_1 bt = new BookTicket_1(train,comp);
		CancelTicket_1 ct = new CancelTicket_1(train,comp);
		bt.setName("BookTicket");
		ct.setName("CanceTicket");
		bt.start();
		ct.start();
		
	}

}
