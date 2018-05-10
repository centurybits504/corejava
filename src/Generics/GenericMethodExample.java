package Generics;

/*Generic Method Example*/
public class GenericMethodExample {
	public static <T> void display(T obj) {
		System.out.println(obj);
	}

	public static void main(String args[]) {
		display("A");
		display(10);
	}
}
