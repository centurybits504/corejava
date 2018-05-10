package Hashing;

/*	Calculating Hashcode for String object 	*/
public class HashFunctionString {

	private int hash=0;
	private int offset=0;
	private static char value[];
	private static int count=0;
	
	public static void main(String[] args) {

		String str = "Hello";
		value = str.toCharArray();
		count = value.length;
		System.out.println(new HashFunctionString().returnHashCode());
		
	}
	
	/*	str[0]*31^(n-1) + str[1]*31^(n-2) + ... + str[n-1]	*/
	 public int returnHashCode() {
		         int h = hash;
		         if (h == 0) {
 		             int off = offset;
		             char val[] = value;
		             int len = count;
		             for (int i = 0; i < len; i++) {
		                 h = 31*h + val[off++];
		             }
		             hash = h;
		         }
		         return h;
		     }
}

