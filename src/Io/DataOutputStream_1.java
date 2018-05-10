package Streams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

//DataInputStream are used to read the primitives from an inputstream.
//DataOutputStream are used to write the primitives to an outputstream.
public class DataOutputStream_1 {

	public static void main(String[] args) {
	 DataInputStream dis=new DataInputStream(System.in);
	 DataOutputStream dos=new DataOutputStream(System.out);
	 try {
		int ch;
		while((ch=dis.read())!=0){
			dos.write(ch);
		}
		
		dos.close();
		dis.close();
	} catch (IOException e) {
		 
		e.printStackTrace();
	}

	}

}
//The DataInputStream/DataOutputStream, stream let you read/write the primitives from/to an input/output source.
//A data output stream lets an application write primitive Java data types to an output stream in a portable way. 
//An application can then use a data input stream to read the data back in.