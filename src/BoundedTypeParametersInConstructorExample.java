

/* Bounded Type Parameters : In ConstructorExample */
class GenericExample_1 {
	private double value;

	/* Here T accepts all Number subclasses */
	<T extends Number> GenericExample_1(T t) {
		value = t.doubleValue();
	}

	Double displayValue() {
		return value;
	}

}

public class BoundedTypeParametersInConstructorExample {

	public static void main(String[] args) {

		GenericExample_1 iTest = new GenericExample_1(100);
		GenericExample_1 dTest = new GenericExample_1(143.2f);

		System.out.println("Interger Value :  " + iTest.displayValue());
		System.out.println("Double  value :  " + dTest.displayValue());

	}

}
