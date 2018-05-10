package Exceptionhandling;
/*Customized Exception with Throws*/
class CustomisedException_2 extends Exception {
 	String exception;
	CustomisedException_2(String exception) {
		this.exception = exception;
	}
	public String toString() {
		return exception;
	}
}
public class CustomizedExceptionWithThrowsExample {
	public static void display() throws Exception {
		throw new CustomisedException_2("CustomisedException_2 Message");
	}
	public static void main(String[] args) throws Exception {
		display();
	}
}
