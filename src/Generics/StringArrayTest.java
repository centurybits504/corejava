package Generics;

/*Generics - String array test */
public class StringArrayTest {

	public static void main(String[] args) {
		String[] str = new String[10];
	    str[0] = "A";
	    str[1] = "B";
	    String firstName = str[0]; /*TypeCasting is not required*/
	    String lastName = str[1]; /*TypeCasting is not required*/
	    System.out.println("firstName : " + firstName);
	    System.out.println("lastName : " + lastName);
	}

}
