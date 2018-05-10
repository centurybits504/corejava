package Reflectionapi;

/*Reflection API : get package & class names */
public class ReflectionAPI_getClassName {

	public static void main(String[] args) {
		 try {
			Class<?> cls=Class.forName("Reflectionapi.ReflectionAPI_getClassName");
			/*returns the package & class name  */
			System.out.println(cls.getName());
			/*returns the package & class name  */
			System.out.println(cls.getCanonicalName());
			/*returns the class name */
			System.out.println(cls.getSimpleName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  

	}

}
