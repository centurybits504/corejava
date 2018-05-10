package Keywords;

/*Final Keyword: cannot change the value of final variables*/
public class FinalKeywordFinalVariablevalueChanging {

	final int alpha = 100;
	/*COMPILE TIME ERROR : The final field alpha cannot be assigned*/
	public FinalKeywordFinalVariablevalueChanging() {
		alpha = 200;
	}

	public static void main(String[] args) {
	}

}
/*-----------------------------------------------*/
