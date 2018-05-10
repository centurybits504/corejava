package Enums;

/*Enums Example : With multiple interfaces*/
interface enumInterface_1{
	void m1();
}
interface enumInterface_2{
	void m2();
}
enum MyEnum_1 implements enumInterface_1,enumInterface_2{
	
	 ACCESS;
	 
	@Override
	public void m1(){
		System.out.println("In MyEnum_1 m1()");
	}
	@Override
	public void m2(){
		System.out.println("In MyEnum_1 m2()");
	}
	
}
public class EnumsImementsMultipleInterfacesExample {

	public static void main(String[] args) {
		MyEnum_1.ACCESS.m1();
		MyEnum_1.ACCESS.m2();

	}

}
