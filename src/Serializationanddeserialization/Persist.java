package Serializationanddeserialization;

import java.io.*;  
class Persist{
	
 public static void main(String args[])throws Exception{  
  Employee s1 =new Employee(504,"amar");  
  
  //File f=new File("testfile.txt");
  //f.createNewFile();
  
  FileOutputStream fout=new FileOutputStream("f.txt");  
  //BufferedOutputStream bout=new BufferedOutputStream(fout);with buffer
  ObjectOutputStream out=new ObjectOutputStream(fout);  
  
  out.writeObject(s1); //this method writes s1 to the out object 
  out.flush();  
 }  

}  


/*
 * Serializable is a marker interface(have no methods). 
 * It is just used to "mark" Java classes which support a certain capability. 
 * It must be implemented by the class whose object you want to persist. 
 * 
 * 
 *
 * Java object serialization is used to persist Java objects to a file, database, network, process or any other system.
 *  Serialization flattens objects into an ordered, or serialized stream of bytes. 
 *  The ordered stream of bytes can then be read at a later time, or in another environment, to recreate the original objects.
 * 
 * 
 * 
 * OutputStream:
 * Java application uses an output stream to write data to a destination, it may be a file,an array,peripheral device or socket.
 * 
 */