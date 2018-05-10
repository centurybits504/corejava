package Hashing;



/*Hashcode for String, Integer, Long types	*/
public class HashCode {

	public static void main(String[] args) {
		
		String str  = "Hello";
		System.out.println( "HashCode of Hello(type String) is  " +str.hashCode());
		
		/*hash value of the empty string is zero*/
		String emptyString = "";
		System.out.println("HashCode of emptyString is  " +emptyString.hashCode());
		
		String str1 = "1";
		System.out.println("HashCode of 1(type String) is  "+str1.hashCode());
		
		Integer i1 = 1;
		System.out.println("HashCode of 1(type Integer) is  "+i1.hashCode());
		
		Integer i2 = 1000000000;
		System.out.println("HashCode of 1000(type Integer) is  " + i2.hashCode());
		
		
		Integer i3 = new  Integer(1000);
		System.out.println("Hash code for 1(type Integer) is " +i3.hashCode());
		
		Long l1 = 18600000000000000L;
		System.out.println(l1.hashCode());
		
		
	}

}
