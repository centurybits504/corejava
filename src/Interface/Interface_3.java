package Interface;

//Multiple inheritance in Java by interface.
//If a class implements multiple interfaces, or an interface extends multiple interfaces i.e. known as multiple inheritance.
//class implements multiple interfaces.

interface i3_1
{
	public void m1();
	
}
interface i3_2
{
	public void m2();
}

public class Interface_3 implements i3_1,i3_2{//we can implement multiple interfaces but can't extend multiple class.

	 public void m1() {
		 
		System.out.println("i3_1 >> m1()");
	}
	public void m2() {
		 
		System.out.println("i3_2 >> m2()");
	}

	public static void main(String[] args) {
		
		new Interface_3().m1();
		new Interface_3().m2();
	}

	
}
