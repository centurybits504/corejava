package Io;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//The DataInputStream/DataOutputStream, stream let you read/write the primitives from/to an input/output source.
//DataInputStream are used to read the primitives from an inputstream.
//DataOutputStream are used to write the primitives to an outputstream.
public class DataInput_Output_Stream_2 {

	public static void main(String[] args) throws FileNotFoundException {
		DataInputStream dis=new DataInputStream(new FileInputStream("test.txt"));
		BufferedInputStream bis=new BufferedInputStream(dis);
		DataOutputStream dos=new DataOutputStream(new FileOutputStream("test1.txt"));
		BufferedOutputStream bos=new BufferedOutputStream(dos);
		
		int b;
		try {
			while((b=(int)bis.read())!=-1)
			{
				System.out.println(b);
				bos.write(b);
			}
			bos.close();
			dos.close();
			bis.close();
			dis.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
