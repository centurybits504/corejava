package Constructors;

import java.lang.reflect.Constructor;

/*Creating instance for private instance class using reflection class	*/
public class PrivateConstructorInstanceCreation {

	public static void main(String[] args) {
		try{
			Class<?> c = Class.forName("Constructors.Test");
			Constructor<?> cc[]  = c.getDeclaredConstructors();
			
			cc[0].setAccessible(true);/*using setAccessible(true) we can make constructor access public*/
			
			Test t = (Test) cc[0].newInstance(); /* using newInstance we can create instance. 
			 											 cc[0].newInstance(null) instance of Test class */
			t.display();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Test{
	private Test(){
		System.out.println("In private constructor......Test ");
	}
	public void display(){
		System.out.println("in Test display()");
	}
}

/*	can we create instance of private constructor class ?
 *	Directly we cannot create, but by using reflection classes we can do. 
 * */
 