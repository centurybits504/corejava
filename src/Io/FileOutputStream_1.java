package Streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//A FileOutputStream is an output stream for writing data to a file.
public class FileOutputStream_1 {

	public static void main(String[] args) {
		
		 try {
			 FileOutputStream fout=new FileOutputStream("test.txt"); //overrides existing  data
			 //FileOutputStream fout=new FileOutputStream("test.txt",true); //append's to existing data 
			 String write_String="Writing to file....";
			byte[] b=write_String.getBytes();
			fout.write(b);
			fout.close();
		} catch (FileNotFoundException e) {
			 e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		 
		 

	}

}

//flow of data 
//java application(write_String) >> fout >> test.txt