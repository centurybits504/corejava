package Programs;

public class Polindrome_Integer {

	public static void main(String[] args) {
	 int num=121;
	 int temp,result=0;
	 
	 while(num>0)
	 {
		 temp=num%10;
		 result=temp+result*10;
		 num=num/10;		 
	 }
	 System.out.println(result);
	 
	}

}
