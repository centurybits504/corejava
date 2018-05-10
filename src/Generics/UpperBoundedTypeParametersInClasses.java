package Generics;

/*UpperBoundedType In classes*/
class GenericExample_002<T extends Number> {
	private double value;

	T[] nos;

	/* Here T accepts all Number subclasses */
	GenericExample_002(T[] nos) {
		this.nos = nos;
	}

	public Double Sum() {
		double total = 0;
		for (int i = 0; i < nos.length; i++)
			total = total + nos[i].doubleValue();

		return total;
	}

}

public class UpperBoundedTypeParametersInClasses {

	public static void main(String[] args) {
		Integer iValuesArray[] = {100,200,300,400};
		GenericExample_002<Integer> iTest = new GenericExample_002<>(iValuesArray);
		
		Double dValuesArray[] = {100.1,200.2,300.3,400.4};
		GenericExample_002<Double> dTest = new GenericExample_002<>(dValuesArray);

		System.out.println("Interger Sum :  " +iTest.Sum());
		System.out.println("Double Sum :  " +dTest.Sum());

	}

}
