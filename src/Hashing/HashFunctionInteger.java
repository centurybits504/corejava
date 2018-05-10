package Hashing;

public class HashFunctionInteger {

	public static Integer val= 0;
	public static void main(String[] args) {
		
		val = 100;
		System.out.println(returnHashCode());
		
	}
	private static int returnHashCode() {
		return val;
	}

}

/*
No hashCode() method for primitive type int.
Here  hashCode() returns a hash code value for object, equal to the primitive int value represented by Integer object.
*/


