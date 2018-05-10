package Java_Oops;


//using clone() of Object class.
public class ObjectCreation_3 implements Cloneable {
	void dispaly()
	{
		System.out.println("In dispaly method");
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		 ObjectCreation_3 obj=new ObjectCreation_3();
		ObjectCreation_3 obj1=(ObjectCreation_3) obj.clone();
		obj1.dispaly();
	}
}
/*A class implements the Cloneable interface to indicate to the java.lang.Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class*/

