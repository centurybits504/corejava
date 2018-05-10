package Newfeatures;

import java.util.regex.Pattern;

/*java 4 Features - RegularExpressions Example */
public class Java4Features_RegularExpressions_Example {

	public static void main(String[] args) {
		 
		/*regular expression that accepts alpha numeric characters only and length should be 4 characters*/
		/*matches method - Compiles the given regular expression and attempts to match the given input against it */
		 boolean matches_1 = Pattern.matches("[a-zA-Z0-9]{4}", "0Aa1");
		 boolean matches_2 = Pattern.matches("[a-zA-Z0-9]{4}", "0A@a1");
			  System.out.println("Regular Expression is "+matches_1 +" for given string(0Aa1)");
			  System.out.println("Regular Expression is "+matches_2 +" for given string(0A@a1)");
	}

}
