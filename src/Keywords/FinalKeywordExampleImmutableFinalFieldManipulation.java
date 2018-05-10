package Keywords;

/*Final Keyword Example :  immutable final variable manipulation in Java*/
public class FinalKeywordExampleImmutableFinalFieldManipulation {

	FinalKeywordExampleImmutableFinalFieldManipulation(){
		/*Here we cann't change the reference(Here str) of StringBuffer, but we can change the content of str(a final immutable field)   */
		final StringBuffer str = new StringBuffer();		//Here str is n't primitive type
		str.append("A");
		System.out.println(str);
		str.append("AA");
		System.out.println(str);
		
		/*COMPILE TIME ERROR : 	we cann't change the reference(Here str) of StringBuffer*/
		str = new StringBuffer("AAA"); /* not possible to re-assign to str field */
		
	}
	 
	public static void main(String[] args) {
		new FinalKeywordExampleImmutableFinalFieldManipulation();

	}

}

/*-----------------------------------------------*/
