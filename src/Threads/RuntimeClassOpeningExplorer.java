package Threads;

/*Threads: RuntimeClass   -  OpeningExplorer */
public class RuntimeClassOpeningExplorer {
	public static void main(String[] args) {
		
		Runtime runTime_=Runtime.getRuntime();
		//The current Runtime instance is obtained by means of Runtime.getRuntime() method.
		try{
			runTime_.exec("explorer.exe");
		}catch(Exception e)
		{
			System.out.println("Error Occured Opening");
		}
	}

}

/*
magnify.exe//notepad.exe 
*/
 