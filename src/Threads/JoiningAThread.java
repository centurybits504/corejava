package Threads;


class ThreadJoin1 extends Thread{
	public void run(){
		System.out.println(Thread.currentThread().getName());
	}
}


/*public class JoiningAThread {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin1 t1 = new ThreadJoin1();
		t1.start();
		System.out.println(Thread.currentThread().getName());
		
	}
}
*/
public class JoiningAThread {
	public static void main(String[] args) throws InterruptedException {
		ThreadJoin1 t1 = new ThreadJoin1();
		t1.start();
		t1.join();
		System.out.println(Thread.currentThread().getName());
	}
}



/*Join :  Join causes the current thread(here main thread) to pause its execution until thread(t1 here) it join completes its execution  */

/* https://stackoverflow.com/questions/2690207/why-is-run-not-immediately-called-when-start-called-on-a-thread-object-in-ja

Why  run() method is not immediately called when start() called on a thread object in java?
It does implicitly call run(), but the call does not necessarily happen immediately.
The reality is that the new thread becomes available to be scheduled at some point in time after the start() call is made. 
The actual scheduling is up to the native(OS) scheduler.
It could happen immediately, or the parent thread could continue for a period before the child thread is scheduled.
*/
