package Keywords;

/*Abstract keyword: abstract method in non-abstract class*/
class Abstract_3{
/*COMPILE TIME ERROR :  The abstract method display in type Abstract_3 can only be defined by an abstract class*/
	abstract public void display();
	 
}
public class AbstractMethodInClass extends Abstract_3{

	public static void main(String[] args) {
	}

}
