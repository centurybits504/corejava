package Exceptionhandling;

/*Customized Exception with Try & catch*/
class CustomisedException_1 extends Exception {

	
	String exception = null;

	public CustomisedException_1(String s) {
		exception = s;
	}

	public String toString() {
		return exception;
	}

}

public class CustomizedExceptionWithTryAndCatchExample {

	public static void main(String[] args) {
		try {

			throw new CustomisedException_1("--CustomisedException--");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
