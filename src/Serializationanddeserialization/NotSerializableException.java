package Serializationanddeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
/*The NotSerializableException can be thrown when a class that implements the Serializable interface contains fields that are not serializable.
 NotSerializableException is UnChecked Exception */
public class NotSerializableException {

	public static void main(String[] args) {
		SerialCustom s1 = new SerialCustom();
		ObjectOutputStream out;
		FileOutputStream fout;
		try {
			fout = new FileOutputStream("f.txt");
			out = new ObjectOutputStream(fout);
			out.writeObject(s1);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
class SerializableObject implements Serializable{
	private String name;
	private SerialCustom obj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SerialCustom getObj() {
		return obj;
	}
	public void setObj(SerialCustom obj) {
		this.obj = obj;
	}
	
}
class SerialCustom{
	private String serial;
	public String getSerial() {
		return serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}
}
