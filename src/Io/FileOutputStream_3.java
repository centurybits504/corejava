package Streams;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
 
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class FileOutputStream_3 {

	public static void main(String[] args) {
		
		 InputStreamReader is=new InputStreamReader(System.in);
		 BufferedReader br=new BufferedReader(is);
		
		 try {
			String File_name=br.readLine();
			FileOutputStream fout=new FileOutputStream(File_name);
			BufferedOutputStream bout=new BufferedOutputStream(fout);
			String data_to_write="Data to write..";
			byte[] b=data_to_write.getBytes();
			bout.write(b);
			
			bout.close();
			fout.close();
			br.close();
			is.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		 
		 //FileOutputStream fot=new FileOutputStream();
		
	}

}
