package Generics;

/*Generic Types Example : Multiple Type Parameters : Adding  types of variables using single method */
import java.util.*;
class Multipletypeparameters<T,K>{
	T obj1;
	K obj2;
	public void setting(T obj1,K obj2){
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public T add(){
		if (obj1 instanceof String) {
            return (T) ((String) obj1 + (String) obj2);
        } else if (obj1 instanceof Integer) {
            return (T) ((Integer) ((Integer) obj1 + (Integer) obj2));
        } else {
            return null;
        }
	}
}
public class GenericTypesMultipleTypeParametersExample {

	public static void main(String[] args) {
		Multipletypeparameters<String,String> g1=new Multipletypeparameters<String,String>();
		g1.setting("A","B");
		System.out.println(" "+ g1.add());

		Multipletypeparameters<Integer,Integer> g2=new Multipletypeparameters<Integer,Integer>();
		g2.setting(10,10);
		System.out.println(g2.add());
	}

}
