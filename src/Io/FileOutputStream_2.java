package Streams;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//Same that of FileOutputStream_1 , but with buffer to increase performance.
//BufferedOutputStream used an internal buffer. It adds more efficiency than to write data directly into a stream. So, it makes the performance fast.
public class FileOutputStream_2 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("test.txt",true);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String write_String="Writing to file with buffer....";
			byte[] b=write_String.getBytes();
			bout.write(b);
			bout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
		 e.printStackTrace();
		}
		

	}

}
//flow of data 
//java application(write_String) >> fout >> bout >> test.txt