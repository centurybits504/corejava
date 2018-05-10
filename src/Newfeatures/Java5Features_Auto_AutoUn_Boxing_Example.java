package Newfeatures;

/*Java 5 Features - AutoBoxing & AutoUn Boxing Example*/
public class Java5Features_Auto_AutoUn_Boxing_Example {

	public static void main(String[] args) {
		
		/*AutoBoxing*/
		int primitiveValue = 100;
		Integer wrapperValue = new Integer(primitiveValue);
		System.out.println("AutoBoxing of  primitiveValue : " +wrapperValue);
		
		/*AutoUn Boxing*/
		int retrivingPrimitiveValue = wrapperValue.intValue();
		System.out.println("AutoUnBoxing of  wrapperValue : "+ retrivingPrimitiveValue );

	}

}
