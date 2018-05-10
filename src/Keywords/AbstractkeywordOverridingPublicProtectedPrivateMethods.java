package Keywords;

/*Abstract Keyword   :  providing implementation for public, protected, private abstract method's   */
abstract class Abstract_3{
	abstract public void display();
	abstract protected void print();
	/*abstract methods should n't be private ,because  private methods  can't inherite */
	abstract void echo();
	//abstract private void cout();

	 
}

public class AbstractkeywordOverridingPublicProtectedPrivateMethods extends Abstract_3{

	public static void main(String[] args) {
		new AbstractkeywordOverridingPublicProtectedPrivateMethods().display();
		new AbstractkeywordOverridingPublicProtectedPrivateMethods().print();

	}

	@Override
	public void display() {
		 System.out.println("Implementation for  Abstract_3 class method, display()");
	}

	@Override
	protected void print() {
		 System.out.println("Implementation for  Abstract_3 class method, print()");
	}

	@Override
	void echo() {
		 System.out.println("Implementation for  Abstract_3 class method, echo()");
	}

	 
	
}

/*why abstract methods should n't be declared with private access-specifier?
 * If our class extending abstract class, we should provide implementation for all abstract methods of  abstract class. 
 * A method that is declared with private is not availabe to subclasses, that means it is not inherited.  
 * So, we shouldn't declare private to abstract methods.
 * */
 