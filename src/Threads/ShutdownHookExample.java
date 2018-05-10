package Threads;

class BeforeExitTask extends Thread{
	@Override
	public void run() {
		System.out.println("In Before exit..");
	}
}
public class ShutdownHookExample {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		rt.addShutdownHook(new BeforeExitTask());
		try {
			System.out.println(" interrupts jvm by pressing ctl+c ");
			Thread.sleep(6000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
