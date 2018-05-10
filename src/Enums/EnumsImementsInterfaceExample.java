package Enums;

/*Enums Example : With single interfaces*/
interface enumInterface{
	void m();
}
enum MyEnum implements enumInterface{
	HIGH,MEDIUM;
	int i =  00;
	static int j = 10;
	final int k = 20;
	static final  int l =30;
	public int m =40;
	private int n =50;
	protected int o =60;

	public  void m() {
		System.out.println("In MyEnum m()");
	} 
	public static void m1(){
		System.out.println("In MyEnum m1()");
	}
	public final void m2(){
		System.out.println("In MyEnum m2()");
	}
	public static final void m3(){
		System.out.println("In MyEnum m3()");
	}
}
public class EnumsImementsInterfaceExample {

	public static void main(String[] args) {
		System.out.println(MyEnum.HIGH.i);
		System.out.println(MyEnum.j);//because it's static
		System.out.println(MyEnum.MEDIUM.k);
		System.out.println(MyEnum.l);//because it's static
		System.out.println(MyEnum.HIGH.m);
		//System.out.println(MyEnum.HIGH.n); //cann't access out side of enum
		System.out.println(MyEnum.HIGH.o);
		
		System.out.println("valueOf()"+MyEnum.valueOf("HIGH"));
		
		  MyEnum.HIGH.m();
		  MyEnum.m1();
		  MyEnum.HIGH.m2();
		  MyEnum.m3();
 		  System.out.println(MyEnum.values()[0]);
		  System.out.println(MyEnum.values()[1].ordinal());
		   

	}

}
