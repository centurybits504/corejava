package Java_Oops;

//Object creation using Class.forName() in java
public class ObjectCreation_1 {
	void display()
	{
		System.out.println("In display method");
	}
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	/*Returns the Class object associated with the class or interface with the given string name*/	 
	Class<?> t = Class.forName("Java_Oops.ForNameObjectCreation");
	ObjectCreation_1 obj = ((ObjectCreation_1) t.newInstance());
	 				 obj.display();	
					 }
}
/*Instances of the class Class represent classes and interfaces in a running Java application. */
