package Keywords;

/*Final keyword: Blank final field intialization in constructor (or) in instance-block */
public class FinalKeywordExampleBlankFinalVariable {

	final int alpha, beta;
	{
		alpha = 100;
	}
	FinalKeywordExampleBlankFinalVariable() {
	/*The blank final field alpha may not have been initialized in constructor*/
		beta = 200;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*-----------------------------------------------*/
