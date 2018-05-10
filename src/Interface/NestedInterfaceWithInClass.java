package Interface;



/*Nested Interfaces : declared  within the class */
class interface_class
{
	public void m1(){
		System.out.println("interface_class >> m1()");
	}
	interface nested_1{
		public void m2() ;
		
	} 
	
}

public class NestedInterfaceWithInClass extends interface_class implements interface_class.nested_1  {

	public void m2() {
		System.out.println("nested_1 >> m2()"); 
		}
	
	public static void main(String[] args) {
		 	
		interface_class.nested_1 obj1=new NestedInterfaceWithInClass();
		obj1.m2();//to get m2() we use implements.
		
		new interface_class().m1();//to get m1() we use extends.
			
	}

	 
}
