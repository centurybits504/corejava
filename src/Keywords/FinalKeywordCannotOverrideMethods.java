package Keywords;

/*Final keyword: cannot override final methods */
/*final methods can be inherited, but cannot override it*/
class Final_2{
	final void display(){
		System.out.println("display() in Final_2");
	}
} 
public class FinalKeywordCannotOverrideMethods extends Final_2{

	public static void main(String[] args) {

	}
	/*COMPILE TIME ERROR :  Cannot override the final method from Final_2 class*/
	@Override
	void display(){
		System.out.println("Overridding display()");
	}
	
}

/*-----------------------------------------------*/
