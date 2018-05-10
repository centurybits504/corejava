package SamplePrograms;

public class Swaping2NumberUsingSingleLine {

	public static void main(String[] args) {
		 int a=10;
		 int b=20;
		 a=(a+b)-(b=a);
		 //(or)
		// b=(a+b)-(a=b);
		 System.out.println(a +" -- "+b);

	}

}
