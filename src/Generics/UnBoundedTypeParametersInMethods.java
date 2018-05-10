package Generics;


/* UnBoundedType Parameters In Methods */
class GenericExample_8 {
	 

	
	public   <T>  T display(T obj) {
		return (obj);
	}
 

}

public class UnBoundedTypeParametersInMethods {

	public static void main(String[] args) {
		GenericExample_8 test = new GenericExample_8();
		GenericExample_8 test2 = new GenericExample_8();

		System.out.println(test.display(100));
		System.out.println(test2.display(143.2F));
		
		 
	}

}
