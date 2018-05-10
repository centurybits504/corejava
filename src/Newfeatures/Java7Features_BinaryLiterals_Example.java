package Newfeatures;

/*java 7 features - Binary literals*/
public class Java7Features_BinaryLiterals_Example {

	public static void main(String[] args) {
		int intvalue=0b01111;
		byte byteValue=(byte) 0b01111;
		long longValue=(long) 0B0111L;
		short shortValue=(short)0b01111;
		System.out.println("intvalue : "+intvalue);
		System.out.println("byteValue : "+byteValue);
		System.out.println("longValue : "+longValue);
		System.out.println("shortValue : " + shortValue);
		

	}

}
