package Interface;

/*Interface Example : implementing for interface using annonymous inner class*/
interface display_6 {
	public void print();

}

public class InterfaceImplementationWithAnnonymousInnerClass {

	public static void main(String[] args) {
		display_6 obj = new display_6() {

			public void print() {
				System.out.println("annonymous implementation");

			}
		};
		obj.print();

		// (or)
		new display_6() {

			public void print() {
				System.out.println("annonymous implementation");

			}
		}.print();
	}

}
