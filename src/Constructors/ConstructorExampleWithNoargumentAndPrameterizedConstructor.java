package Constructors;

public class ConstructorExampleWithNoargumentAndPrameterizedConstructor {

	String name;
	int age;
	ConstructorExampleWithNoargumentAndPrameterizedConstructor(String name, int age){
		this.name = name;
		this.age = age;
	}
	/*no-argument constructor*/
	ConstructorExampleWithNoargumentAndPrameterizedConstructor() {

	}
	public static void main(String[] args) {
		/*Here we're creating 2 objects with parameters and with-out parameter, so we must write  no-agrument constructor . other-wise compile time error will occur */
		
		/*	Noargument-Constructor is used to initialize the instance variables of the class with default values*/
		ConstructorExampleWithNoargumentAndPrameterizedConstructor obj_1 = new ConstructorExampleWithNoargumentAndPrameterizedConstructor();
		
		/*	Parameterized-Constructor is used to initialize the instance variables of the class with user-defined values*/
		ConstructorExampleWithNoargumentAndPrameterizedConstructor obj_2 = new ConstructorExampleWithNoargumentAndPrameterizedConstructor("B",200);

		
		System.out.println("Default value of name(in object obj_1)  is : " +obj_1.name);
		System.out.println("Default value of name(in object obj_1)  is : " +obj_1.age);
		
		System.out.println("User-defined value of name(in object obj_2)  is : " +obj_2.name);
		System.out.println("User-defined value of name(in object obj_2)  is : " +obj_2.age);
	}

}

