package Keywords;

/*Abstract keyword Example*/
abstract class Abstract_5{
	
	/*astract class*/
	abstract void display();
	
	/*non-abstract method*/
	void print(){
		System.out.println("In Abstract_5 ==> print method");
	}
	
	/*variable declaration and intialization*/
	int raw=10,data;
	
	/*final variables are allowed*/
	final int info=11;
	
	/*static variables are allowed*/
	static int total;
	
	/*cannot  visible in the subclasses*/
	private int sum=1;
	
	/*COMPILE TIME ERROR : For abstract methods we should n't provide final */
	//final abstract void echo();
	
	/*non-abstract method with final are allowed, but cannot override*/
	final void cout(){
		//method body
	}
	/*protected variables are allowed*/
	protected int count=2;
	
	
	/*constructors are allowed*/
	String name;
	Abstract_5(){
		System.out.println("In Constructor of Abstract_5");
	}
	Abstract_5(String name){
		this.name = name;
	}
}

public class AbstractKeywordExample extends Abstract_5{
	public static void main(String[] args) {
		new AbstractKeywordExample().display();
	}

	@Override
	void display() {
		System.out.println("In AbstractKeywordExample Class");
	}
	
}
