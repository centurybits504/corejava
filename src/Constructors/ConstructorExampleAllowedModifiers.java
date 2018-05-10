package Constructors;

/*Constructors Example : With allowed and not allowed modifiers in constructors*/
public class ConstructorExampleAllowedModifiers {

	ConstructorExampleAllowedModifiers(){
		static int alpha = 100;//Illegal modifier for parameter alpha; only final is permitted
		int beta = 200;// by default field's are final
		final int gamma = 300;
	}
	public static void main(String[] args) {
	}

}
