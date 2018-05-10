package Exceptionhandling;

/*Nested try block example*/
public class NestedTryBlocksExample {

	public static void main(String[] args) {
		try {
			try {
				System.out.println(1 / 0);
			} catch (ArithmeticException ae) {
				System.out.println("java.lang.ArithmeticException");
				ae.printStackTrace();
			}
			try {
				int[] intArryValues = new int[10];
				System.out.println(intArryValues[10]);
			} catch (ArrayIndexOutOfBoundsException aiobe) {
				System.out.println("java.lang.ArrayIndexOutOfBoundsException");
				aiobe.printStackTrace();
			}
		} catch (Exception e) {
			System.out.println("EXCEPTION IN OUTTER CATCH BLOCK");
			e.printStackTrace();
		}

	}

}
