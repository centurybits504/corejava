package Generics;

/*Generic Types Example : Invoking and Instantiating a Generic Type*/
class Gen2<T>{
	T obj;
	public void add(T obj){
		this.obj=obj;
		System.out.println("Type of object is:"+obj.getClass());
	}
	public T getObj(){
		return obj;
	}
}
public class GenericTypesInvokingAndInstantiatingGenericTypeExample {

	public static void main(String[] args) {
		Gen2<String> g1=new Gen2<String>();
		g1.add("A");
		System.out.println(g1.getObj());

		Gen2<Integer> g2=new Gen2<Integer>();
		g2.add(10);
		System.out.println(g2.getObj());

		Gen2<Boolean> g3=new Gen2<Boolean>();
		g3.add(true);
		System.out.println(g3.getObj());
	}

}
