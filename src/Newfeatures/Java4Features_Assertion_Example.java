package Newfeatures;

/*java 4 Features - Assertion Example */
public class Java4Features_Assertion_Example {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		assert num1<=num2:"Not valid";
		System.out.println(num1);
	

	}

}
/*Pass Program Arguments while running Assert example 
 * Here java -ea Java4NewFeatures_Assertion_Example
 * By default Assert is not enabled
 * */