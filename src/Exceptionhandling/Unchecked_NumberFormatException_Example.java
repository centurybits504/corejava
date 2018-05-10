package Exceptionhandling;

public class Unchecked_NumberFormatException_Example {

	public static void main(String[] args) {
		
		try{
			String str = "A";
			Integer.parseInt(str);
		}catch(NumberFormatException nfe){
			System.out.println(nfe.getMessage());
		}
		
		

	}

}
