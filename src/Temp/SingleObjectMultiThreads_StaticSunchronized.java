/*package Temp;

class T1 implements Runnable{
	Data dt;
	T1(Data dt){
		this.dt=dt;
	}
	@Override
	public void run() {
		Data.m1();
	}
}
class T2 implements Runnable{
	Data dt;
	T2(Data dt){
		this.dt=dt;
	}
	@Override
	public void run() {
		Data.m1();
	}
}
class Data{
	public static synchronized void m1(){
		for(int i=0;i<4;i++){
			System.out.println("Thread " +Thread.currentThread().getName() +" -- " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void m2(){
		for(int i=0;i<4;i++){
			System.out.println("Thread " +Thread.currentThread().getName() +" -- " + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SingleObjectMultiThreads_StaticSunchronized {

	public static void main(String[] args) {
		Data dt = new Data();
		Thread t1 = new Thread(new T1(dt),"A");
		Thread t2 = new Thread(new T2(dt),"B");
		t1.start();
		t2.start();

	}

}
*/