package Exceptionhandling;

public class Checked_NoSuchMethodException_Example {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {
		 
			Class<?> c = Class.forName("java.lang.String");
			Class<?>[] parameterTypes = new Class[5];
			c.getDeclaredMethod("getSome", parameterTypes);
		 
		

	}

}
