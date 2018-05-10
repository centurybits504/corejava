package Generics;

 
/*UnBounded Type Parameters in Interface*/
interface MyGeneric_7<T>{
	
	T display(T t);
		
}
class MyGeneric_007<T> implements MyGeneric_7<T>{

	@Override
	public T display(T t) {
		return t;
	}
	 
}
public class UnBoundedTypeParametersInInterface {

	public static void main(String[] args) {
		
		MyGeneric_007<String> obj_1 = new MyGeneric_007<String>();
		MyGeneric_007<Integer> obj_2 = new MyGeneric_007<>();
		
		System.out.println("Generic Interface Of Type String Output : " +obj_1.display("A"));
		System.out.println("Generic Interface Of Type Integer Output : "+obj_2.display(1));


	}

}
