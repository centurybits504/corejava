package Keywords;

/*Finally Keyword Example*/
public class FinallyKeywordExample {

	public static void main(String[] args) {
		int num=10,result;
		try{
			/*Here java.lang.ArithmeticException  will occur*/
			result = num/0;
		}catch(ArithmeticException ae){
			/*Here we catch the excetion and prints root cause for this exception*/
			ae.printStackTrace();
		}
		finally{
			System.out.println("After Try & Catch, finally will execute");
		}

	System.out.println("Some statements....");	
		try{
			/*Here java.lang.ArithmeticException  will occur*/
			result = num/0;
		}
		finally{
			System.out.println("After Try & Catch, finally will execute");
		}
		

	}

}
/*-----------------------------------------------*/
