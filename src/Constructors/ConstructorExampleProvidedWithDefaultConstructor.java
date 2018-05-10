package Constructors;

/*Constructors Example : with default constructors provided by user*/
public class ConstructorExampleProvidedWithDefaultConstructor {
	
	String name;
	int age;
	/*Here, we are providing the default constructor, it will provide the default values*/ 
	ConstructorExampleProvidedWithDefaultConstructor(){
		
	}
	public static void main(String[] args) {
		
		ConstructorExampleProvidedWithDefaultConstructor obj = new ConstructorExampleProvidedWithDefaultConstructor();
		
		System.out.println("A default constructor is inserted by user to  provided default values to fields");
		System.out.println("Default value of name type(String) is : " +obj.name);
		System.out.println("Default value of age type(int) is : " +obj.age);

	}

}
