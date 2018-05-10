package Threads;

/*Creating Thread by extends Thread class*/
/*by extending Thread we can make our class(CreatingThreadByExtendingThreadClass) object as Thread object*/
class Thread_1 extends Thread{
	public void run()
	{
		System.out.println("Creating Thread By extending Thread Class");
	}
}
class CreatingThreadByExtendingThreadClass extends Thread 
{
	public static void main(String[] args) 
	{
		Thread_1 obj=new Thread_1();
		obj.start();// this Causes thread to begin execution;the Java Virtual Machine calls the run method of this thread. 
	}
}

//when we create Thread_1 constructor(Thread_1()),it invokes constructor of Thread class by this we can make our class(Thread_1) objects as Thread class object.

 