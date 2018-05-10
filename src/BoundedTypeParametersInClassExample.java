



/* T can be Number (or) class derived from Number */
class GenericExample_2<T extends Number> {
	private double value;

	T[] nos;

	/* Here T accepts all Number subclasses */
	GenericExample_2(T[] nos) {
		this.nos = nos;
	}

	public Double Sum() {
		double total = 0;
		for (int i = 0; i < nos.length; i++)
			total = total + nos[i].doubleValue();

		return total;
	}

}

public class BoundedTypeParametersInClassExample {

	public static void main(String[] args) {
		Integer iValuesArray[] = {100,200,300,400};
		GenericExample_04<Integer> iTest = new GenericExample_04<>(iValuesArray);
		
		Double dValuesArray[] = {100.1,200.2,300.3,400.4};
		GenericExample_004<Double> dTest = new GenericExample_004<>(dValuesArray);

		System.out.println("Interger Sum :  " +iTest.Sum());
		System.out.println("Double Sum :  " +dTest.Sum());

	}

}
