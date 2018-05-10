package Serializationanddeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Depersist {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		 ObjectInputStream os=new ObjectInputStream(new FileInputStream("f.txt"));
		 
		 // ObjectInputStream os=new ObjectInputStream(new BufferedInputStream(new FileInputStream("f.txt")));//with buffer
		 
		 Employee s=(Employee)os.readObject();
		 System.out.println(s.id);
		 System.out.println(s.name);
		 
		 

	}

}
/*
 * InputStream:
 * Java application uses an input stream to read data from a source, it may be a file,an array,peripheral device or socket.
 * 
 * 
 * 
 * 
 */