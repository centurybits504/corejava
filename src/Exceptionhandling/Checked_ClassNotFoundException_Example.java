package Exceptionhandling;

/*java.lang.ClassNotFoundException Example*/
public class Checked_ClassNotFoundException_Example {

	public static void main(String[] args) {
		try {
			Class.forName("com.MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
