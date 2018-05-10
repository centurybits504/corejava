package Generics;


/*UnboundedType Parameters In Constructors Example*/
public class UnBoundedBoundedTypeParametersInConstructors {

	public <T> UnBoundedBoundedTypeParametersInConstructors(T element) {
		System.out.println("In UnboundedBoundedTypeParameters  Constructor: " + element);
	}
	public static void main(String[] args) {
		 
		UnBoundedBoundedTypeParametersInConstructors obj1 = new UnBoundedBoundedTypeParametersInConstructors("A");
		UnBoundedBoundedTypeParametersInConstructors obj2 = new UnBoundedBoundedTypeParametersInConstructors(100);
	}

}
