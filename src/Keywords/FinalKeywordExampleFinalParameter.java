package Keywords;

/*Final keyword: cannot change FinalParameter */
public class FinalKeywordExampleFinalParameter {
	
	public void display(final String name){
		System.out.println(name);
		/*COMPILE TIME ERROR : The final local variable name cannot be assigned. It must be blank and not using a compound assignment*/
		name =  "Hai.." + name ;
		System.out.println();
	}	
	public static void main(String[] args) {

	}

}
/*-----------------------------------------------*/
