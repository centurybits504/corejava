package Interface;

/* Multiple inheritance in interface */
/*If a class implements multiple interfaces, or an interface extends multiple interfaces i.e. known as multiple inheritance*/
interface i_1
{
	public void m1();
	}
interface i_2 extends i_1
{
	public void m2();
}

public class MultipleInheritanceInInterface implements i_2
{
 public void m1() {
		System.out.println("i_1 >> m1()");
		
	}
 	public void m2() {
		System.out.println("i_2 >> m2()");
		
	}
public static void main(String[] args) {
		 new MultipleInheritanceInInterface().m1();
		 new MultipleInheritanceInInterface().m2(); 
		
	}

}
