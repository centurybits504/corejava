package Keywords;

public class VoidKeywordExample {
	public static void main(String[] args) {
	 	VoidKeywordExample vid =  new VoidKeywordExample();
	 	vid.returnNothing();
	 	System.out.println(vid.returnString());
	}
	/*this method return nothing to the calling method[Here main method] */
	public void returnNothing(){
		 //Some statements
	}
	/*this method return String[Here A] to the calling method[Here main method] */
	public String returnString(){
		return "A";
	}
	
}
