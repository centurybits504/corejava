package Exceptionhandling;

/*Exception propagation*/
public class ExceptionPropagationExample {

	void end()
	{
		System.out.println(1/0);
	}
	void propagate()
	{
		end();
	}
	void divide()
	{
		try{
			propagate();
		}catch(ArithmeticException  e){
			System.out.println("Exception Handled Here");
		}
	}
	
	public static void main(String[] args) {
		 new ExceptionPropagationExample().divide();
		 System.out.println("Execution continues..");
		 
		 

	}


}
