/*package Temp;
class T1 implements Runnable{
	Data dt;
	T1(Data dt){
		this.dt=dt;
	}
	@Override
	public void run() {
		dt.m1();
	}
}
class T2 implements Runnable{
	Data dt;
	T2(Data dt){
		this.dt=dt;
	}
	@Override
	public void run() {
		dt.m1();
	}
}
class T3 implements Runnable{
	Data dt;
	T3(Data dt){
		this.dt=dt;
	}
	@Override
	public void run() {
		dt.m2();
	}
}
class Data{
	public synchronized void m1(){
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

public class MultiObjectsMultiThreads_Synchronized {

	public static void main(String[] args) {
		Data dt1 = new Data();
		Data dt2 = new Data();
		Thread t1 = new Thread(new T1(dt1),"A");
		Thread t2 = new Thread(new T2(dt1),"B");
		Thread t3 = new Thread(new T3(dt2),"C");
		t1.start();
		t2.start();
		t3.start();

	}

}
*/