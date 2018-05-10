package Generics;

/*Generic Types Example : Generic Interface : Adding generic types Example*/
interface  GenericsInterface_4<T,S,U>
{
	T add(S x, U y);
}

class GenericsInterfaceNew_16 implements GenericsInterface_4<String, String, String>{

	String addData;
	public String add(String x, String y) 
	{
		addData=x+y;
		return addData;
	}
	
}
class GenericsInterfaceNew_17 implements GenericsInterface_4<Integer,Integer,Integer>{

	Integer addData;
	public Integer add(Integer x, Integer y) 
	{
		addData=x+y;
		return addData;
	}
	
}
class GenericsInterfaceNew_18 implements GenericsInterface_4<String, String, Integer>{
	String addData;
	public String add(String x,Integer y)
	{
		addData=x+y;
		return addData;
	}
}
public class GenericTypeGenericInterfaceSumOfTypesExample {

	public static void main(String[] args) {
		
		GenericsInterfaceNew_16 obj1=new GenericsInterfaceNew_16();
		System.out.println(obj1.add("a","b"));
		
		GenericsInterfaceNew_17 obj2=new GenericsInterfaceNew_17();
		System.out.println(obj2.add(2, 2));
		
		GenericsInterfaceNew_18 obj3=new GenericsInterfaceNew_18();
		System.out.println(obj3.add("A", 4));
	}

}
