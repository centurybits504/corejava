package Generics;


/* UnBoundedType Parameters In Classes */

class GenericExample_7<T> {
 
	T nos;

	GenericExample_7(T nos) {
		this.nos = nos;
	}

	public T display() { 
		return nos;
	}

}

public class UnBoundedBoundedTypeParametersInClass {

	public static void main(String[] args) {
		 int intValues = 10;
		GenericExample_7<Integer> iTest = new GenericExample_7<>(intValues);
		
		double doubleValue = 143.0f;
		GenericExample_7<Double> dTest = new GenericExample_7<>(doubleValue);

		System.out.println("For Interger Type :  " +iTest.display());
		System.out.println("For Double  Type :  " +dTest.display());

	}

}
