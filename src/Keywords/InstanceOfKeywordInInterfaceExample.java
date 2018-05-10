package Keywords;

/*instanceOf  keyword Example  : in interface */
interface InstanceOf_1
{
	void display();
}
public class InstanceOfKeywordInInterfaceExample implements InstanceOf_1{

	public static void main(String[] args) {
		InstanceOf_1 obj = new InstanceOfKeywordInInterfaceExample();
		System.out.print("Is obj reference of interface(InstanceOf_1) ?");
		System.out.println(obj instanceof InstanceOf_1);
		System.out.print("Is obj instance of interface(InstanceOfKeywordInInterfaceExample) ?");
		System.out.println(obj instanceof InstanceOfKeywordInInterfaceExample);
	}

	@Override
	public void display() {
		
	}

}
/*
Is obj instance of interface(InstanceOf_1) true
Is obj instance of interface(InstanceOfKeywordInInterfaceExample) true
 */
