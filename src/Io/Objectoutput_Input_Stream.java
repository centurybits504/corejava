package Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class employee implements Serializable
{
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public employee(int id, String name) {
		 this.id=id;
		 this.name=name;
	}
	
	
	}

public class Objectoutput_Input_Stream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		 employee e=new employee(1,"Amar");
		 //writing state of an object to file is called serialization
		 FileOutputStream fos=new FileOutputStream("test2.txt");
		 ObjectOutputStream os=new ObjectOutputStream(fos);
		 os.writeObject(e);
		 
		 //restoring state of an object from file
		 ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test2.txt"));
		 employee e1=(employee) ois.readObject();
		 System.out.println(e1.getId()  +"  --  "+e1.getName() );
		 
		 
		  

	}

}
