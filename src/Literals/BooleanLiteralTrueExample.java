package Literals;
/*True Literal Example*/
public class BooleanLiteralTrueExample {
	public static void main(String[] args) {
		boolean status = true;
		
		if(status)
			System.out.println("This will print");
		
		if(!status)
			System.out.println("This will n't print");
		
		if(true){
			System.out.println("This will print");
		}
	}
}
