package Othersampleprograms;

import java.io.IOException;

public class ExceptionTryFinal {

	public static void main(String[] args)throws Exception {
		try{
			System.out.println("try");
			//System.out.println(1/0);//unchecked
			//throw new NullPointerException(); //unchecked
			
		}finally{
			System.out.println("\n finally \n");
		}
	}

}
