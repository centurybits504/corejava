package Generics;

/*Generic Types Example : Generic Interface : Max of generic types Example*/
interface GenericsInterface_3<T,U>//we can write any no of parameters of any wrapper class type. 
{
	T max(T a,U b);
}

class GenericsInterfaceNew_14 implements GenericsInterface_3<String ,String>{

	String maxData;
	public String max(String x, String y) {
		if ( x.compareTo( y ) > 0 )
			maxData=x;
		else
			maxData=y;
		
		return maxData;
	}
}
class GenericsInterfaceNew_15 implements GenericsInterface_3<Integer, Integer>{

	int maxData;
	public Integer max(Integer a, Integer b) {
		if(a.compareTo(b)>0)
			maxData=a;
		else
			maxData=b;
		
		return maxData;
	}
}
public class GenericTypeGenericInterfaceMaxOfTwoExample {

	public static void main(String[] args) {
		GenericsInterfaceNew_14 obj1=new GenericsInterfaceNew_14();
		System.out.println(obj1.max("a","b"));
		
		GenericsInterfaceNew_15 obj2=new GenericsInterfaceNew_15();
		System.out.println(obj2.max(1,2));

	}

}
