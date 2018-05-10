package Generics;

/*Generic Interface Example*/
interface MyGeneric_1<T>{
	
	T display(T t);
		
}
class MyGeneric_2<T> implements MyGeneric_1<T>{

	@Override
	public T display(T t) {
		return t;
	}
	 
}
public class GenericInterfaceExample {

	public static void main(String[] args) {
		
		MyGeneric_2<String> obj_1 = new MyGeneric_2<String>();
		MyGeneric_2<Integer> obj_2 = new MyGeneric_2<>();
		
		System.out.println("Generic Class Of Type String Output : " +obj_1.display("A"));
		System.out.println("Generic Class Of Type Integer Output : "+obj_2.display(1));


	}

}
