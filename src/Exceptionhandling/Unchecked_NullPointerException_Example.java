package Exceptionhandling;

public class Unchecked_NullPointerException_Example {

	public static void main(String[] args) {
		String str = null;
		try{
			//Here we are performing operations on null String
			str.toUpperCase();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
