package Generics;


/*Generic Types Example :Generic Interface*/

//Here GenericsInterface_2 is raw type , we aren't using any type.
//T is a formal type parameter
interface GenericsInterface_2<T>{
	 T execute();//return type of this method is generic
}
class GenericsInterfaceNew_12 implements GenericsInterface_2<String>{
	String a;
	GenericsInterfaceNew_12(){ }
	GenericsInterfaceNew_12(String a)
	{
		this.a=a;
	}
	public String execute() {//return type of this method is String
		 return a;
	}
	
}
class GenericsInterfaceNew_13 implements GenericsInterface_2<Integer>{
	int b;
	GenericsInterfaceNew_13(){ }
	GenericsInterfaceNew_13(int b){
		this.b=b;
	}
	public Integer execute() {//return type of this method is Integer
		return b;
	}
	
}
public class GenericTypesGenericInterfaceExample {

	public static void main(String[] args) {
		GenericsInterfaceNew_12 obj1=new GenericsInterfaceNew_12("A");
		GenericsInterfaceNew_13 obj2=new GenericsInterfaceNew_13(4);
		 System.out.println(obj1.execute());
		System.out.println(obj2.execute());

	}

}
