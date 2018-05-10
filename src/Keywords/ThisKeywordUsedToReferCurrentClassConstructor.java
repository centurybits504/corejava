package Keywords;

/*this keyword Example : Used to invoke current class constructor(chaining of the constructors) */
public class ThisKeywordUsedToReferCurrentClassConstructor {

	String name;
	int age;
	ThisKeywordUsedToReferCurrentClassConstructor() {
		/*Constructor call must be the first statement in a constructor*/
		this("Mr. A", 10);//this line will call parameterized constructor- below constructor
	}
	ThisKeywordUsedToReferCurrentClassConstructor(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void display()
	{
		System.out.println("Hi..! My name is " + name  +" &  my age is "+ age );
	}
	
	public static void main(String[] args) {
		/*Here we're creating object for current class using no-argument constructor(ThisKeywordUsedToInvokeCurrentClassMethod()), so compiler will call above no-agrument constructor */
		ThisKeywordUsedToReferCurrentClassConstructor obj = new ThisKeywordUsedToReferCurrentClassConstructor();
		obj.display();
	}

}
/*OUTPUT:
Hi..! My name is Mr. A &  my age is 10
 */
