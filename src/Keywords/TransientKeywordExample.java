package Keywords;

/*Transient Keyword example : In Serialization & De-Serialization */
//http://stackoverflow.com/questions/910374/why-does-java-have-transient-fields
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
	Integer id;
	String name;
	transient Integer marks;
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(Integer id, String name,Integer marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

}
public class TransientKeywordExample {
	public static void main(String[] args) throws Exception {
		 /*Saving Employee object  in file.txt*/
		  Employee empSave =new Employee(1,"A",100);  
		  FileOutputStream fout=new FileOutputStream("file.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  /*writting object to file*/
		  out.writeObject(empSave); 
		  /*closing the out stream*/
		  out.close();
		  System.out.println("Employee Instance is sucessfully Serialized to file");  

		  /*Fetching Employee details from file.txt*/
		  ObjectInputStream os=new ObjectInputStream(new FileInputStream("file.txt"));
		  Employee empFetch=(Employee)os.readObject();
		  System.out.println(empFetch.getId());
		  System.out.println(empFetch.getName());
		  /*we get this field as null because it's transient field*/
		  System.out.println(empFetch.getMarks());
		  /*closing the in stream*/
		  os.close();
		  System.out.println("Serialized Employee Instance from file(file.txt)  is sucessfully De-Serialized and displayed");  

		  
	}

}
