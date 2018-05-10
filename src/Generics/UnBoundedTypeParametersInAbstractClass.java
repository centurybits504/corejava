package Generics;

abstract class GenericExample_6<T> {
	abstract T display();
}

class GenericExample_06<T> extends GenericExample_6<T> {
	T nos;

	GenericExample_06(T nos) {
		this.nos = nos;
	}

	public T display() { 
		return nos;
	}


}
 
public class UnBoundedTypeParametersInAbstractClass {

	public static void main(String[] args) {
		
		int intValues = 10;
		GenericExample_06<Integer> iTest = new GenericExample_06<>(intValues);
		
		double doubleValue = 143.0f;
		GenericExample_06<Double> dTest = new GenericExample_06<>(doubleValue);

		System.out.println("For Interger Type :  " +iTest.display());
		System.out.println("For Double  Type :  " +dTest.display());

	}

}
