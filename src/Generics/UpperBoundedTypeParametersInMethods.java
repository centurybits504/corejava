package Generics;


/* UpperBoundedType Parameters In Methods */
class GenericExample_3 {
	Number value;

	/*Unboundedtype method*/
	public <T extends Number> Number display(T t) {
		value = t.doubleValue();
		return value;
	}
 

}

public class UpperBoundedTypeParametersInMethods {

	public static void main(String[] args) {
		GenericExample_3 test = new GenericExample_3();
		GenericExample_3 test2 = new GenericExample_3();

		System.out.println(test.display(100));
		System.out.println(test2.display(143.2F));
		
		/* COMPILE TIME ERROR :  Bound mismatch: The generic method display(T) of type GenericExample_3 is not applicable for the arguments (String). */
		//test2.display("A");

	}

}
