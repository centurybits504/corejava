package Keywords;

/*Continue keyword Example : Using for loop*/
public class ContinueKeywordExample {

	public static void main(String[] args) {
		 int _checkPoint = 10;
		 for(int i=1;i<=20;i++){
			 if(i<=_checkPoint){
				 System.out.println("Looping continuing for i equal to  :"+i);
				 continue;
			 }else{
				 System.out.println("Looping breaking for i equal to  :"+i);
				 break;
			 }
		 }
	}
}



/*-----------------------------------------------*/
