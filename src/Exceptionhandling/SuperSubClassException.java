package Exceptionhandling;

import java.io.IOException;

/* >> If the superclass method declares an exception, subclass overridden method can declare same, subclass exception or no exception but cannot declare parent exception. 
   
class Bank{ // here compile time error
	public void deposit()throws ArithmeticException{
		System.out.println("In Bank");
	}
}class Icici extends Bank{
	public void deposit()throws Exception{
		System.out.println("In Icici BanK");
	}
}

class Bank{ //here no compile time error
	public void deposit()throws Exception{
		System.out.println("In Bank");
	}
}class Icici extends Bank{
	public void deposit()throws ArithmeticException{
		System.out.println("In Icici BanK");
	}
}
*/
//----------------------------------//
/* >> super and sub classes should throw either checked or unchecked, but we  should not mix both type of exceptions
class Bank{
	public void deposit()throws ArithmeticException{
		System.out.println("In Bank");
	}
}class Icici extends Bank{
	public void deposit()throws IOException{
		System.out.println("In Icici BanK");
	}
}
*/
//----------------------------------//
/* >> If the superclass method does not declare an exception, subclass overridden method cannot declare the checked exception but it can declare unchecked exception. 
  class Bank{
	public void deposit(){
		System.out.println("In Bank");
	}
}class Icici extends Bank{
	public void deposit()throws IOException{
		System.out.println("In Icici BanK");
	}
}*/


public class SuperSubClassException {
	public static void main(String[] args) {
	}
}

