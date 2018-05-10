package StringClass;



public class String_EqualToEquals_Example {
	public static void main(String[] args) {
		 
		String str1 =  "hello";
		String str2 =  "hello";
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println("/*---------------------------------------*/");
		
		String str3 = new String("hi");
		String str4 = new String("hi");
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
		
		
	}
}
