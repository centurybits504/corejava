package StringClass;

public class String_hashCodeExample {
	
	 
	public static void main(String[] args) {
		 
		
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1.hashCode() +" -- " + str2.hashCode());  
		System.out.println(str1.hashCode() == str2.hashCode());
		
		System.out.println("/*---------------------------------------*/");
		
		String str3 = new String("hi");
		String str4 = new String("hi");
		System.out.println(str3.hashCode() +" -- " + str4.hashCode());  
		System.out.println(str3.hashCode() == str4.hashCode());
		
		
		 
		
		
	}

}

