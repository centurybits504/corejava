package Keywords;

interface Interface_01
{
	/*all interface methods are by default  public ,abstract*/
	void display();
	void print();
}
abstract class Abstract_4 implements Interface_01{
	abstract void  echo();
}
class MyClass  extends Abstract_4{

	@Override
	public void display() {
		// TODO Auto-generated method stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
	}

	@Override
	public void echo() {
		// TODO Auto-generated method stub
	}
	
}
public class AbstractClassWithInterface{

		public static void main(String[] args) {
		Interface_01 interfaceReference = new MyClass();
		interfaceReference.display();
		interfaceReference.print();
		/*COMPILE TIME ERROR : The method echo() is undefined for the type Interface_01, we can use type-casting like this ((Abstract_4) interfaceReference).echo(); */
		//interfaceReference.echo();
	}

	 

}


 