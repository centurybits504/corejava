package Generics;

/*Generic Constructor Example*/
public class GenericConstructorExample {

	public <T> GenericConstructorExample(T element) {
		System.out.println("In Generic Constructor: " + element);
	}

	public static void main(String[] args) {
		GenericConstructorExample obj1 = new GenericConstructorExample("A");
		GenericConstructorExample obj2 = new GenericConstructorExample(100);
	}
}
