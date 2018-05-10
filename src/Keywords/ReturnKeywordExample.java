package Keywords;

/* return keyword example*/
public class ReturnKeywordExample {
	public static void main(String[] args) {
		ReturnKeywordExample obj = new ReturnKeywordExample();
		System.out.println(obj.returnString());
		
		obj.returnNothing_1();
		obj.returnNothing_2();
	}
	/*this method return String[Here String is A] to the calling method[Here main] */
	public String returnString(){
		return "A";
	}
	
	/*this method return nothing*/
	public void returnNothing_1(){
		return;
	}
	
	/*this method return nothing*/
	public void returnNothing_2(){
	}
}
