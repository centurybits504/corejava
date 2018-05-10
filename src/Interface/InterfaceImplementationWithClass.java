package Interface;

/*Interface Example : implementing for interface using class*/
interface car {
	public void gearing_system();

	public static final int a = 10;

}

class benz implements car {
	public void gearing_system() {
		System.out.println("benz >>  with gearing jack");

	}

}

public class InterfaceImplementationWithClass extends benz {

	public void gearing_system() {
		System.out.println("Interface_1 >> overrinding gearing_system(herited from benz) in Interface_1");
	}

	public static void main(String[] args) {

		new benz().gearing_system();
		System.out.println(" car >>i :" + a);

		new InterfaceImplementationWithClass().gearing_system();

	}

}
