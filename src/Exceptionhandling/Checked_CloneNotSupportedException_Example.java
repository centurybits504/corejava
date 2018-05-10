package Exceptionhandling;

/*Checked CloneNotSupportedException Example : */
public class Checked_CloneNotSupportedException_Example{

	public static void main(String[] args) {
		Checked_CloneNotSupportedException_Example obj1 = new Checked_CloneNotSupportedException_Example();
		try {
			Checked_CloneNotSupportedException_Example obj2 = (Checked_CloneNotSupportedException_Example) obj1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}


//Why CloneNotSupportedException will occur?
//Invoking Object’s clone method on an instance that does not implement the Cloneable interface results in the exception CloneNotSupportedException being thrown

