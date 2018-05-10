package Keywords;

/*Abstract Keyword   :  providing implementation for abstract method   */
abstract class Abstract_2
{
	abstract void display();//by default abstract methods are public 
	void print(){
		System.out.println("In Abstract_2 print()");
	}
	
}
public class AbstractMethodInAbstractClassOverridingMethod  extends Abstract_2{
	public static void main(String[] args) {
		new AbstractMethodInAbstractClassOverridingMethod().display();
		new AbstractMethodInAbstractClassOverridingMethod().print();
	}
	@Override
	void display() {
		 System.out.println("Implementation for  Abstract_2 class method, display()");
		
	}
	
	void print(){
		System.out.println("Overriding  Abstract_2 class method, print()");
	}
}
