package Streams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInput_Output_Stream_1 {

	public static void main(String[] args) throws FileNotFoundException {
		 FileInputStream fis=new FileInputStream("test.txt");
		 BufferedInputStream bis=new BufferedInputStream(fis);
		 
		 FileOutputStream fos=new FileOutputStream("test1.txt",true);
		 BufferedOutputStream bos=new BufferedOutputStream(fos);
		 
		 int ch;
		 try {
			while((ch=bis.read())!=-1){
				 bos.write(ch);
			 }
			bos.close();
			fos.close();
			
			bis.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
//test.txt >> fis >> bis >> ch >> bos >> fos >> test1.txt
