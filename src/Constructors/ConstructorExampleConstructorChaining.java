package Constructors;

/*Constructor Example : Calling another constructor from constructor is calling constructor chaining*/
public class ConstructorExampleConstructorChaining {
	
	String name;
	int age;
	
	ConstructorExampleConstructorChaining(){
		System.out.println("In ConstructorExampleConstructorChaining() constructor");
	}
	ConstructorExampleConstructorChaining(String name){
		/*this() will call parameterless constructor (above constructor)*/
		this();//must be first statement
		this.name = name;
		System.out.println("In ConstructorExampleConstructorChaining(String name) constructor");
	}
	ConstructorExampleConstructorChaining(String name,int age){
		/*this will call single parameterized constructor (above constructor)*/
		this(name);//must be first statement
		this.name = name;
		this.age = age;
		System.out.println("In ConstructorExampleConstructorChaining(String name,int age) constructor");
	}
	public static void main(String[] args) {
		
		new ConstructorExampleConstructorChaining("A",100);

	}

}
