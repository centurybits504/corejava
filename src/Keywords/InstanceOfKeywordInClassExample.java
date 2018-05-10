package Keywords;

/*instanceOf  keyword Example  : in class */
public class InstanceOfKeywordInClassExample {

	public static void main(String[] args) {
		InstanceOfKeywordInClassExample obj = new InstanceOfKeywordInClassExample();
		 if(obj instanceof InstanceOfKeywordInClassExample){
			 System.out.println("obj InstanceOf InstanceOfKeywordExample");
		 }
		 
		 if(obj instanceof Object){
			 System.out.println("obj InstanceOf Object");
		 }
	}
}
