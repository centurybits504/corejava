package Keywords;

/*else keyword example*/
public class ElseKeywordExample {
	public static void main(String[] args) {
		boolean check = false;
		if(check){
			System.out.println("Display from 1st if statement");
		}else{
			System.out.println("Display from 1st else statement");
		}
		if(check)
			System.out.println("Display from 2st if statement");
		else
			System.out.println("Display from 2st else statement");
	}
}
/*-----------------------------------------------*/
