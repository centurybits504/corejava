package Generics;

/*Generic Types Example : Generic Class*/
class Gen<T>
{
	T object;
	Gen(T object)
	{
		this.object=object;
	}
	public void show()
	{
		System.out.println(object.getClass().getName());//Class name of type of object
	}
	public T getObject()
	{
		return object;
	}
	
}
public class GenericTypesGenericClassExample {
	public static void main(String[] args) {
		Gen<String> s=new Gen<String>("A");
		s.show();
		System.out.println(s.getObject());
		
		Gen<Integer> i=new Gen<Integer>(0);
		i.show();
		System.out.println(i.getObject());
	}
}
