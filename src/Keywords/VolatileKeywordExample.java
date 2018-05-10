package Keywords;

//I don't know
public class VolatileKeywordExample extends Thread{
	volatile boolean  keepRunning = true;

    public void run() {
        long count=0;
        while (keepRunning) {
            count++;
        }

        System.out.println("Thread terminated."+count);
    }

    public static void main(String[] args) throws InterruptedException {
    	VolatileKeywordExample t = new VolatileKeywordExample();
        t.start();
        Thread.sleep(1000);
        t.keepRunning = false;
        System.out.println("keepRunning set to false.");
    }
}

//http://stackoverflow.com/questions/17748078/simplest-and-understandable-example-of-volatile-keyword-in-java
//difference between http://www.javamex.com/tutorials/synchronization_volatile.shtml