package Generics;

/*Generic Types Example : Multiple Type Parameters */
/*Same as GenericTypesMultipleTypeParametersExample, but  using strategy design pattern to add  using generics*/

abstract class Multipletypeparameters_1<T, K> {
    public abstract T add();
}
class MultipleStringparameters_1 extends Multipletypeparameters_1<String, String> {

	String obj1, obj2;
	 public void setting(String obj1,String obj2){
			this.obj1 = obj1;
			this.obj2 = obj2;
		}
    @Override
    public String add() {
        return (String) (obj1.toString() + obj2.toString());
    }
}

class MultipleIntegerparameters_1 extends Multipletypeparameters_1<Integer, Integer> {

	 Integer obj1, obj2;
	 public void setting(Integer obj1,Integer obj2){
			this.obj1 = obj1;
			this.obj2 = obj2;
		}
    @Override
    public Integer add() {
        return obj1 + obj2;
    }
}
public class GenericTypesAddingMultipleTypeParametersUsingStrategyPatternExample {

	public static void main(String[] args) {
		
		MultipleStringparameters_1 g1=new MultipleStringparameters_1();
		g1.setting("A","B");
		System.out.println(g1.add());

		MultipleIntegerparameters_1 g2=new MultipleIntegerparameters_1();
		g2.setting(10,10);
		System.out.println(g2.add());
	}

}
