package Keywords;

/*this keyword Example : Used to refer current class reference */
public class ThisKeywordUsedToReferCurrentClassReference {
	ThisKeywordUsedToReferCurrentClassReference(){
		System.out.println("Current Class Reference : "+this);
	}
	public static void main(String[] args) {
		ThisKeywordUsedToReferCurrentClassReference obj = new ThisKeywordUsedToReferCurrentClassReference();
		System.out.println("Current Class Reference Variable : "+obj);
	}

}

/*
OUTPUT:
Keywords.ThisKeywordUsedToReferCurrentClassInstanceVariables@6ae6235d
Keywords.ThisKeywordUsedToReferCurrentClassInstanceVariables@6ae6235d

Here both output's are same so, "this" refers to the current class reference.
*/