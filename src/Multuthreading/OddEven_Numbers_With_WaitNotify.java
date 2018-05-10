/*package Multuthreading;
//not working
class PrintOddEven {
	int startSequence = 1;
	int endSequence = 10;
	Boolean status;
	Exchange exchange;
	public PrintOddEven() {
	}
	synchronized void displayOdd(Exchange exchange,Boolean status){
			System.out.println("in odd ");
		
	}
	synchronized void displayEven(Exchange exchange,Boolean status){
		System.out.println("in even");
	}
}
class Exchange{
	Boolean status;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
class ThreadOdd extends Thread {
	Exchange exchange;
	boolean b;
	PrintOddEven p;
	public ThreadOdd(Exchange exchange, boolean b, PrintOddEven p) {
		this.exchange=exchange;
		this.b=b;
		this.p=p;
		}
	@Override
	public void run() {
		p.displayOdd(exchange,b);
	}
}
class ThreadEven extends Thread {
	Exchange exchange;
	boolean b;
	PrintOddEven p;
	public ThreadEven(Exchange exchange, boolean b, PrintOddEven p) {
		this.exchange=exchange;
		this.b=b;
		this.p=p;	}
	@Override
	public void run() {
		p.displayEven(exchange,b);
	}
}
public class OddEven_Numbers_With_WaitNotify {

	public static void main(String[] args) {
		PrintOddEven p = new PrintOddEven();
		Exchange exchange = new Exchange();
		exchange.setStatus(true);
		ThreadOdd threadOdd = new ThreadOdd(exchange,true,p);
		ThreadEven threadEven = new ThreadEven(exchange,false,p);
		threadOdd.start();
		threadEven.start();
	}
}*/