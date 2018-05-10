package StringClass;

public class StringChecking {

	public static void main(String[] args) {

			String str1 = "hello";
			String str2 = str1;
			str1 = "hi " +"Sai";
			System.out.println( " str1 :" +str1);
			System.out.println( " str2 :" +str2);
			
			System.out.println("/*---------------------------------------*/");
			
			String str3 = "hello ";  
			str3.concat("Sai"); 
			System.out.println(" str3 :" +str3);
			 
			
			System.out.println("/*---------------------------------------*/");
			
			String str4 = new String("hello");
			str4.concat("Sai");
			System.out.println(" str4 :" +str4);
			
			 
			
			
	}

}
