package Temp;

class DataT{
	volatile int count = 0;
	public void increment(){
		for(int i=1;i<=2;i++){
			System.out.println(Thread.currentThread().getName() + " :: " + count + " :: " + ++count);
		}
	}
	public void decrement(){
		for(int i=1;i<=2;i++){
			System.out.println(Thread.currentThread().getName() + " :: " + count + " :: " + --count);
		}
	}
}
class IncrementThreadA implements Runnable{
	DataT dtDataT;
	public IncrementThreadA(DataT dtDataT) {
		this.dtDataT = dtDataT;
	}
	@Override
	public void run() {
		dtDataT.increment();
	}
}
class DecrementThreadB implements Runnable{
	DataT dtDataT;
	public DecrementThreadB(DataT dtDataT) {
		this.dtDataT = dtDataT;
	}
	@Override
	public void run() {
		dtDataT.decrement();
	}
}
public class Single_variable_IncrementDecrement_Volatile_MultiThreading {
	public static void main(String[] args) {
		DataT dt = new DataT();
		Thread t1 = new Thread(new IncrementThreadA(dt) , "A");
		Thread t2 = new Thread(new DecrementThreadB(dt) ,"B");
		t1.start();
		t2.start();
	}
}
	