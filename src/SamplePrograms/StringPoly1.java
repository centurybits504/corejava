package SamplePrograms;

public class StringPoly1 {
	public static void main(String[] args) {
		
		String str = "madam";
		char ch ;
		String s2 = "" ;
		for(int j = str.length()-1;j>=0;j--){
	       ch = str.charAt(j);
	       s2 += ch + "";
		}
		System.out.println(s2);
	}
}
