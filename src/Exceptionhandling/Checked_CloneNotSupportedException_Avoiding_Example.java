package Exceptionhandling;
/*Checked CloneNotSupportedException Example : Avoiding  */
public class Checked_CloneNotSupportedException_Avoiding_Example implements Cloneable{

	@Override
	protected Object clone() throws CloneNotSupportedException{
		return (Checked_CloneNotSupportedException_Avoiding_Example)super.clone();
		
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Checked_CloneNotSupportedException_Avoiding_Example obj1 = new Checked_CloneNotSupportedException_Avoiding_Example();
		try {
			Checked_CloneNotSupportedException_Avoiding_Example obj2 = (Checked_CloneNotSupportedException_Avoiding_Example) obj1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}

//How to avoid CloneNotSupportedException?
//This can be avoided  by implementing “Cloneable” Interface and Overriding protected method clone() of Object class.