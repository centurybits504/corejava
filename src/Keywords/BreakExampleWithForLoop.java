package Keywords;

public class BreakExampleWithForLoop {
	public static void main(String[] args) {
		 int limit = 4;
		 for(int i=1;i<=10;i++){
			 if(i==limit){
				 System.out.println("i values : "+i);
				 System.out.println("Exiting From For Loop when 'i' equals to 'limit' , Using break");
				 break;
			 }
			 System.out.println("i values : "+i);
		 }
	}
}

/*-----------------------------------------------*/