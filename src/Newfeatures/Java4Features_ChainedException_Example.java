package Newfeatures;

/*java 4 Features - ChainedException_Example */
public class Java4Features_ChainedException_Example {

	public static void main(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (java.lang.ArithmeticException ae) {
			ae.printStackTrace();

			throw new ArrayIndexOutOfBoundsException();

		}
	}

}
