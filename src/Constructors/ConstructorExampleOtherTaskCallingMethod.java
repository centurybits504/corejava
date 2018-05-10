package Constructors;

/*Constructor Example : Can perform other tasks in collection like calling method */
public class ConstructorExampleOtherTaskCallingMethod {

	ConstructorExampleOtherTaskCallingMethod(){
		display();
	}	
	public void display(){
		System.out.println("In ConstructorExampleOtherTaskCallingMethod >> display()");
	}
	public static void main(String[] args) {
		/*when we create object class it's corresponding constructor will invoke and create object for the class */
		/*Here we're creating object to  class ConstructorExampleOtherTaskCallingMethod with no parameters. So it's corresponding constructor (no-argument constructor) is used in the creation of object */
		new ConstructorExampleOtherTaskCallingMethod();

	}

}
