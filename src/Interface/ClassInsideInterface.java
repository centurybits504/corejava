package Interface;

/*A class inside interface*/
/*A class can be defined inside an interface, but it must be public and static and must not call any methods defined inside the interface*/
interface inter_1
{
public void m1();
	class inter_class
	{
		public void m2()
		{
			System.out.println("inter_1 >> inter_class >>m2()");
			
		}
	}
}

public class ClassInsideInterface extends inter_1.inter_class implements inter_1{

	public static void main(String[] args) {
		 
		ClassInsideInterface obj=new ClassInsideInterface();
		obj.m2();//extends inter_1.inter_class
		
		inter_1 obj2=new ClassInsideInterface();
		obj2.m1();//implements inter_1
	}
 
	public void m1()
	{
		 System.out.println("inter_1 >> m1()");
	}

}
