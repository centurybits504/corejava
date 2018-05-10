package Exceptionhandling;

/*Errors In Java  : Logical Error Example*/
/*Here programmer intension is to add array on integers*/
public class ErrorsInJava_LogicalError_Example {

	public static void main(String[] args) {
		int[] intValuse = {100,200,300,400,500};
		int total =0;
		for(int i=0;i<intValuse.length;i++){
			/*Here instead of using  + operator, he uses - operator to add integer array */
			/*these types are errors we can as logical error*/
			total = total - intValuse[0];
			System.out.println(total);
		}
	}

}
