package Newfeatures;

/*Java 5 Features : variable arguments Example*/
public class Java5Features_Varargs_Example {

	public static void main(String[] args) {
		sum(10, 20, 30, 40);

	}
//variable arguments is the last argument in the method
	static int sum(int... intArray) {
		int total = 0;
		for (int j = 0; j <= intArray.length; j++)
			total = total + intArray[j];
		return total;

	}

}
