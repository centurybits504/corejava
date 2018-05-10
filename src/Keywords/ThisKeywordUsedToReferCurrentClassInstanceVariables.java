package Keywords;

/*this keyword Example : Used to refer current class instance variables */
public class ThisKeywordUsedToReferCurrentClassInstanceVariables {
	String name; //Here name, age are instance variable
	int age;
	ThisKeywordUsedToReferCurrentClassInstanceVariables(String name, int age){//Here name, age are local variables (or) formal arguments
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		ThisKeywordUsedToReferCurrentClassInstanceVariables obj = new ThisKeywordUsedToReferCurrentClassInstanceVariables("A",10);
		System.out.println("Name : "+obj.name);
		System.out.println("Age : "+obj.age);
	}

}

/*
 OUTPUT:
Name : A
Age : 10
Here this will set the values to instance variables
*/

/*
Here if you don't use this we get output as (because values are not set to instance, so default values will come)
Name : null
Age : 0
*/
 