package Exceptionhandling;

/*Try and catch blocks example */
public class TryandCatchBlocksExample {

	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
	}
}
