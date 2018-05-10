package Generics;

/*Generic Class Example */
class MyGeneric<T>{
	
	T display(T t){
		return t;
	}
}
public class GenericClassExample {

	public static void main(String[] args) {
		MyGeneric<String> obj_1 = new MyGeneric<String>();
		MyGeneric<Integer> obj_2 = new MyGeneric<>();
		
		System.out.println("Generic Class Of Type String Output : " +obj_1.display("A"));
		System.out.println("Generic Class Of Type Integer Output : "+obj_2.display(1));

	}

}
