package Threads;

/*Thread Class Method Example: Starting A Thread*/
class MyThread_1 extends Thread{
	public void run(){
		System.out.println("Thread started....");
	}
}
public class StartingAThreadExample {

	public static void main(String[] args) {
		MyThread_1 t1 = new MyThread_1();
		t1.start();
	}

}
