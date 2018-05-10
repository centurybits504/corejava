package Literals;

/*False Literal Example*/
public class BooleanLiteralFalseExample {

	public static void main(String[] args) {
		boolean status = false;
		
		if(status)
			System.out.println("This will print");
		
		if(!status)
			System.out.println("This will n't print");
		
		if(false){/*Dead Code*/
			System.out.println("This will n't print");
		}
	}

}



/*What is dead code?
Dead code is a section in the source code of a program which is executed but whose result is never used in any other computation. The execution of dead code wastes computation time and memory.
*/
 