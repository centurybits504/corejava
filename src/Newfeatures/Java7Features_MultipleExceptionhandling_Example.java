package Newfeatures;

/*java 7 features : Multiple exceptions Example */
public class Java7Features_MultipleExceptionhandling_Example {

	public static void main(String[] args) {
		 
		try {
			System.out.println(1 / 0);
			int[] _intarry = {100,200,300,400};
			System.out.println(_intarry[5]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			e.printStackTrace();
		}
	}

}
