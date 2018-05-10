package Hashing;

/*hashcode of type String*/
public class HashCodeOfStringType {

	public static void main(String[] args) {
		
		
		
		String str = "";
		System.out.println("Hash code of \"\"(String type) is " + str.hashCode());
		
		String str0 = " ";
		System.out.println("Hash code of  \" \" (String type) is " + str0.hashCode());
		
		
		/*Here we are transforming String (str1) to hashcode(number)	using hashCode() method of Object class */
		String str1 = "hello";
		System.out.println("Hash code of  hello (String type) is " + str1.hashCode());
		
		
		
		/*	2 objects can have same hashcode */
		String str2 = "FB";
		System.out.println("Hash code of  FB (String type) is " + str2.hashCode());
		String str3 = "Ea";
		System.out.println("Hash code of Ea (String type) is " + str3.hashCode());
		

	}

}


 