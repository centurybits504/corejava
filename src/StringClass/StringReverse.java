package StringClass;




public class StringReverse {

	public static void main(String[] args) {
		String str = "ABC";
		String strRev= "";
		System.out.println(reverseStringRecursive(str,strRev));
	}
	private static String reverseStringRecursive(String str,String revString) {
		String temp ="";
		if(str.length()>=1){
			temp  = revString.concat(str.charAt(str.length()-1)+"");
			
			System.out.println("revString" +  temp);
			reverseStringRecursive(str.substring(0,str.length()-1),temp);
		}
		return temp;
	}

}
