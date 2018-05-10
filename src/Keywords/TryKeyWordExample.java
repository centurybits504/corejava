package Keywords;

/*Try Keyword Example : ArithmeticException*/
public class TryKeyWordExample {
	public static void main(String[] args) {
		int num=10,result;
		try{
			/*Here java.lang.ArithmeticException  will occur*/
			result = num/0;
		}catch(ArithmeticException ae){
			/*Prints reason for this exception*/
			ae.printStackTrace();
		}
		System.out.println("Executing Remaining Statement's After trying and catching exception statements");
	}
}
