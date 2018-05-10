package Temp;

//no ordering in threads
class Ordered {
	  boolean a = false;
	  boolean b = false;

	   void threadOne() {
		System.out.println(" in threadOne() ");
	    a = true;
	    b = true;
	  }
	   boolean threadTwo() {
		System.out.println(" in threadTwo() ");
	    boolean r1 = b; 
	    boolean r2 = a; 
	    boolean r3 = a; 
	    return (r1 && r2) && r3; 
	  }				
}

class ThreadOneOrder implements Runnable{
	Ordered badlyOrdered;
	public ThreadOneOrder(Ordered badlyOrdered) {
		this.badlyOrdered=badlyOrdered;
	}

	@Override
	public void run() {
		badlyOrdered.threadOne();
	}
}
class ThreadTwoOrder implements Runnable{
	Ordered badlyOrdered;
	public ThreadTwoOrder(Ordered badlyOrdered) {
		this.badlyOrdered=badlyOrdered;
	}
	@Override
	public void run() {
		System.out.println(badlyOrdered.threadTwo());
	}
}
public class No_Ordering_In_MultipleThreads {

	public static void main(String[] args) {
		Ordered badlyOrdered = new Ordered();
		Thread t1 = new Thread(new ThreadOneOrder(badlyOrdered));
		Thread t2 = new Thread(new ThreadTwoOrder(badlyOrdered));
		t1.start();
		t2.start();
	}
	
}
//http://jeremymanson.blogspot.in/2007/08/atomicity-visibility-and-ordering.html
