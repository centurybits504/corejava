package Exceptionhandling;

/*Try and finally blocks example*/
public class TryandFinallyBlocksExample {

	public static void main(String[] args)  {
		 try{
			 /*Exception : java.lang.ArithmeticException */
			System.out.println(1/0);
			 
		 }
		 finally{
			  System.out.println("In finally block ");
		 }
	}

}
