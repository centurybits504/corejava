package Exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*Checked_FileNotFoundException_Example*/
public class Checked_FileNotFoundException_Example {

	public static void main(String[] args) {
		 try {
			FileInputStream fit=new FileInputStream("test.txt");
			fit.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 

	}

}
