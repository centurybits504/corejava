package Constructors;

public class ConstructorExampleWithParamaterizedConstructor {

	String name;
	int age;
	ConstructorExampleWithParamaterizedConstructor(String name, int age){
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args) {
		/*	Parameterized-Constructor is used to initialize the instance variables of the class with user-defined values*/
		/*Here different values to the instance variables are applied by using below 2 lines */
		ConstructorExampleWithParamaterizedConstructor obj_1 = new ConstructorExampleWithParamaterizedConstructor("A",100);
		ConstructorExampleWithParamaterizedConstructor obj_2 = new ConstructorExampleWithParamaterizedConstructor("B",200);
		System.out.println("User-defined value of name(in object obj_1)  is : " +obj_1.name);
		System.out.println("User-defined value of name(in object obj_2)  is : " +obj_2.name);
	}

}
