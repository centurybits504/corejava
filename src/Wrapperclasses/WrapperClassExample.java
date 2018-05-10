package Wrapperclasses;

/*Wrapper Class Example*/
public class WrapperClassExample {

	public static void main(String[] args) {
		
		int _intValue = 100;
		Integer  _intWrapper =Integer.valueOf(_intValue); /*Auto-Boxing*/
		System.out.println("AutoBoxing is Done Here : "+ _intWrapper);
		
		int _intValue_1 = Integer.valueOf(_intWrapper);/*Auto-UNBoxing*/
		System.out.println("Auto UNBoxing is Done Here : "+_intValue_1);
		
		Integer  _intString = new Integer("100");
		System.out.println("ValueOf Integer : "+Integer.valueOf(_intString));/*Automatically converts to int*/

		Boolean _boolean = new Boolean(true);
		System.out.println("ValueOf Boolean : "+Boolean.valueOf(_boolean));
		
		Byte _byte = new Byte("100");
		System.out.println("ValueOf Byte : "+_byte.byteValue());
		
		Double _double = new Double(100);
		System.out.println("ValueOf Double : "+Double.valueOf(_double));

		Float _float = new Float(100);
		System.out.println("ValueOf Float : "+Float.valueOf(_float));

		Long _long = new Long(100);
		System.out.println("ValueOf Long : "+Long.valueOf(_long));
		
		Character ch = new Character('A');
		System.out.println("ValueOf Character : "+Character.valueOf(ch));

 		Short _shortValue = new Short("100");		
		System.out.println("ValueOf Short : "+Short.valueOf(_shortValue));

	}
}


