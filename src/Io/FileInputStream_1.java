package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//A FileInputStream obtains input bytes from a file.
//It is used for reading streams of raw bytes such as image data.
public class FileInputStream_1 {

	public static void main(String[] args) {
		 try {
			FileInputStream fit=new FileInputStream("test.txt");
			int ch;
		
			while((ch=fit.read())!=-1)
			{
				System.out.print( ch +" -- "+(char)ch);
			}
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

//file =>> fit =>> java application