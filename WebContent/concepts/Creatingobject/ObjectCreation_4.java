package Java_Oops;


//Creating object using factory method.
class ObjectCreation_4_1
{
	public static  ObjectCreation_4_1 obj;
	static ObjectCreation_4_1 create()
	{
		obj = new ObjectCreation_4_1();
		return obj;
	}
	void display()
	{
		System.out.println("In display method");
	}
}
public class ObjectCreation_4 {
	public static void main(String[] args) {
		ObjectCreation_4_1 obj1 = ObjectCreation_4_1.create();
		obj1.display();
	}
}
