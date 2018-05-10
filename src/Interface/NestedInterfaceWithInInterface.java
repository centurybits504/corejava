package Interface;



/*Nested Interfaces : declared  within the interface */
interface nested_1
{
	public  void m1();
	interface  nested_2
	{
		public void m2();
	}
}

public class NestedInterfaceWithInInterface implements nested_1.nested_2,nested_1{
	
	public void m1()
	{
		System.out.println("nested_1 >> m1()");
	}
	 
	public void m2() {
		 
		System.out.println("nested_2 >> m2()");
	}
	public static void main(String[] args) {
		new NestedInterfaceWithInInterface().m1();
		new NestedInterfaceWithInInterface().m2();
		
		//Here w're upcasting Interface_5 to nested_2  
		nested_1.nested_2 obj1=new NestedInterfaceWithInInterface();
		obj1.m2();
		//obj1.m1();
		
		//Here w're upcasting Interface_5 to nested_1
		nested_1  obj2= new NestedInterfaceWithInInterface();
		obj2.m1();
	}

}

//Note:nested_1.nested_2 is just to point inner interface  and it can't contain outer interface methods.
//An interface which is declared within another interface or class is known as nested interface. The nested interfaces are used to group related interfaces so that they can be easy to maintain. The nested interface must be referred by the outer interface or class. It can't be accessed directly.
//There are given some points that should be remembered by the java programmer.
//1:Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the class.
//2:Nested interfaces are declared static implicitely.
