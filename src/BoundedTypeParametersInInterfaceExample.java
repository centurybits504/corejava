

interface GenericExample_4<T extends Number> {
	T Sum();
}

class GenericExample_04<T extends Number> implements GenericExample_4 {

	T[] nos;

	/* Here T accepts all Number subclasses */
	GenericExample_04(T[] nos) {
		this.nos = nos;
	}

	@Override
	public Integer Sum() {
		int totalInteger = 0;
		for (int i = 0; i < nos.length; i++)
			totalInteger = totalInteger + nos[i].intValue();

		return totalInteger;
	}

}

class GenericExample_004<T extends Number> implements GenericExample_4 {

	T[] nos;

	/* Here T accepts all Number subclasses */
	GenericExample_004(T[] nos) {
		this.nos = nos;
	}

	@Override
	public Double Sum() {
		double totalDouble = 0;
		for (int i = 0; i < nos.length; i++)
			totalDouble = totalDouble + nos[i].doubleValue();

		return totalDouble;
	}

}

public class BoundedTypeParametersInInterfaceExample {

	public static void main(String[] args) {

		Integer iValuesArray[] = {100,200,300,400};
		GenericExample_04<Integer> iTest = new GenericExample_04<>(iValuesArray);
		
		Double dValuesArray[] = {100.1,200.2,300.3,400.4};
		GenericExample_004<Double> dTest = new GenericExample_004<>(dValuesArray);

		System.out.println("Interger Sum :  " +iTest.Sum());
		System.out.println("Double Sum :  " +dTest.Sum());

	}

}
