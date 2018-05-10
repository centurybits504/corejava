package SamplePrograms;

public class Polindrome_String_2 {

	public static void main(String[] args) {
		 
		String str="madam";
		String poly="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			poly+=str.charAt(i);
		}
		System.out.println(poly);

	}

}
