/*package Temp;

By default java monitors are reentrant, so it avoids single threaded deadlock
class TestResourse{
	String str = "A";
	public synchronized void Compare1() {
		if ("A".equals(str)) {
			System.out.println("in Compare1");
			Compare2();
		}
	}
	public synchronized void Compare2() {
		if ("A".equals(str)) 
			System.out.println("in Compare2");
	}
	
}
class TestThread implements Runnable{
	TestResourse trResourse;
	public TestThread(TestResourse trResourse) {
		this.trResourse=trResourse;
	}

	@Override
	public void run() {
		trResourse.Compare1();
	}
}
public class MonitorsAreByDefaultReentrant {

	public static void main(String[] args) {
		TestResourse trResourse = new TestResourse();
		Thread t = new Thread(new TestThread(trResourse));
		t.start();
	}

}
*/