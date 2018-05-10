package SamplePrograms;

public class Reverse {

	public static void main(String[] args) {
		 int num=1431;
		 int reverse=0;
		
		 while(num!=0)
		 {
			 reverse=(num%10)+reverse*10;
			 num=num/10;
		 }
		 
		 System.out.println(reverse);
		 String str="amar";
		 StringBuffer sb=new StringBuffer(str);
		 System.out.println(sb.reverse()); 
	}

}
//http://www.codejava.net/java-core/collections/class-diagram-of-map-api
//http://www.karambelkar.info/2012/06/java-collections-uml-class-diagrams.html