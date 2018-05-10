package Constructors;

/*Constructors Example : with default constructors inserted by compiler*/
public class ConstructorExampleDefaultConstructorByCompiler {

	 String name ;
	 int age;
	 
	public static void main(String[] args) {
		
		ConstructorExampleDefaultConstructorByCompiler obj = new ConstructorExampleDefaultConstructorByCompiler();
		
		System.out.println("A default constructor is inserted by compiler to  provided default values to fields");
		System.out.println("Default value of name type(String) is : " +obj.name);
		System.out.println("Default value of age type(int) is : " +obj.age);
	}
}

/*
 *	A default constructor is inserted by compiler to  provided default values to fields
	Default value of name type(String) is : null
	Default value of age type(int) is : 0 
 * */
 