package Io;



import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

/*
Reading data from keyboard:

There are many ways to read data from the keyboard. For example:

InputStreamReader
Console
Scanner
DataInputStream etc.*/
//The DataInputStream/DataOutputStream, stream let you read/write the primitives from/to an input/output source.
//DataInputStream are used to read the primitives from an inputstream.
//DataOutputStream are used to write the primitives to an outputstream.
public class DataInputStream_1 {

	public static void main(String[] args) {
		  DataInputStream dt=new DataInputStream(System.in);
		  BufferedInputStream br=new BufferedInputStream(dt);
		  int ch;
		  try {
			while((ch=br.read())!=1)
			  {
				  System.out.print((char)ch);
			  }
		} catch (IOException e) {
			e.printStackTrace();
		}
		  

	}

}
