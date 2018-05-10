package Multuthreading;

/*Volatile in  multithreading*/
class Data_1{
	
	volatile int a = 0;
	public  void display(){
		for(int i=0;i<10;i++){
			a = a+1;
			System.out.println(Thread.currentThread().getName()  + " -- "+ a);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
class Runner_1 implements Runnable{
	
	Data_1 d;
	Runner_1(Data_1 d){
		this.d = d;
	}
	@Override
	public void run() {
			d.display();
	}
	
}
class Runner_2 implements Runnable{

	Data_1 d;
	Runner_2(Data_1 d){
		this.d = d;
	}
	@Override
	public void run() {
			d.display();
	}
	
}
public class VolatileInMultithreading {

	public static void main(String[] args) {
		Data_1 d = new Data_1();
		Thread t1 = new Thread(new Runner_1(d));
		t1.start();
		Thread t2 = new Thread(new Runner_2(d));
		t2.start();
	}

}
