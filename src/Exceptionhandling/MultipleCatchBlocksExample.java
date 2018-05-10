package Exceptionhandling;

/*Multiple catch blocks example*/
public class MultipleCatchBlocksExample {

	public static void main(String[] args) {

		try {
			System.out.println(1 / 0);
	/*ArrayIndexOutOfBoundsException,ArithmeticException are specific exceptions*/		
		} catch (ArrayIndexOutOfBoundsException aiobe) {
			aiobe.printStackTrace();
		} 
		catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		/*Exception is the general exception*/
		catch (Exception exp) {
			exp.printStackTrace();
		}

	}

}
