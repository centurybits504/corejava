package Streams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//A FileInputStream obtains input bytes from a file.
public class FileInputStream_2 {

	public static void main(String[] args) {
		 try {
			FileInputStream fit= new FileInputStream("test.txt");
			BufferedInputStream bit= new BufferedInputStream(fit);
			int ch;
			while((ch=bit.read())!=-1)
			{
				System.out.print((char)ch);
			}
			bit.close();
			fit.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 

	}

}
//file =>> fit =>> bit =>> java application