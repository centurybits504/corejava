package Threads;

public class CreatingThreadClassByUsingAnnonymousClassExample {

	public static void main(String[] args) {
		
		/*Providing implementation for run()  using annonymous inner class*/
		Runnable r=new Runnable()
		{
			public void run()
			{
				System.out.println(" Runnable >>  run()");
			}
		};
		
		/*Providing Runnable reference(Here r) to Thread class constructor and overridding run() method of "Runnable interface" */
		/*Thread class internally implements Runnable interface*/
		Thread t=new Thread(r)
		{
			public void run()
			{
				System.out.println(" Overidding run() of Runnable inteface");
			}
			
		};
		t.start();
		
		 
	System.out.println("-------------------------------------------------------------------------");	 
		 /*Same as above, writting in short form*/
		  
		  new Thread(new Runnable()
						{
								public void run()
									{
									System.out.println(" Runnable >>  run()");
									}
						})
						{
						public void run()
						{
							System.out.println(" Overidding run() of Runnable inteface");
						}
			
					}.start();
		

	}

}
