package Multuthreading;

import java.util.concurrent.Exchanger;

//Print odd even using two threads using Exchanger
class PrintOddEven {
	int startSequence = 1;
	int endSequence = 10;
	Boolean status;
	Exchanger<Boolean> exchanger;

	void display(Boolean status, Exchanger<Boolean> exchanger) {
		try {
			for (int i = startSequence; i <= endSequence; i++) {
				System.out.println(Thread.currentThread().getName() +  " i " + i);
				if (status)
					System.out.println(Thread.currentThread().getName()+ " :: " + i);
				//Waits for another thread to arrive at this exchange point (unless the current thread is interrupted), and then transfers the given object to it, receiving its object in return. 
				status = exchanger.exchange(status);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

class ThreadOdd extends Thread {
	PrintOddEven td = null;
	Exchanger<Boolean> exchanger = null;
	Boolean status;

	ThreadOdd(PrintOddEven td, Exchanger<Boolean> exchanger, Boolean status) {
		this.td = td;
		this.exchanger = exchanger;
		this.status = status;
	}

	public void run() {
		td.display(status, exchanger);
	}
}

class ThreadEven extends Thread {
	PrintOddEven td = null;
	Exchanger<Boolean> exchanger = null;
	Boolean status;

	ThreadEven(PrintOddEven td, Exchanger<Boolean> exchanger, Boolean status) {
		this.td = td;
		this.exchanger = exchanger;
		this.status = status;
	}

	public void run() {
		td.display(status, exchanger);
	}
}

public class OddEven_Numbers_With_Exchanger {

	public static void main(String[] args) {
		Exchanger<Boolean> exchanger = new Exchanger<>();
		PrintOddEven data = new PrintOddEven();
		ThreadOdd oddThread = new ThreadOdd(data, exchanger, true);
		ThreadEven evenThread = new ThreadEven(data, exchanger, false);
		oddThread.setName("Odd Thread");
		evenThread.setName("Even Thread");
		oddThread.start();
		evenThread.start();
	}

}
