package Interface;

//same as Interface_6 but here without Anonymous inner class.
interface display_7
{
	public void print();
}
class disp_imp implements display_7
{
	public void print()
	{
		System.out.println("in disp_imp");
	}
} 
public class Interface_7 {

	public static void main(String[] args) {
		display_7 obj=new disp_imp();
		obj.print();
	}

}
