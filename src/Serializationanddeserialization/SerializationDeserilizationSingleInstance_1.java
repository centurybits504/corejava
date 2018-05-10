package Serializationanddeserialization;

import java.io.*;

public class SerializationDeserilizationSingleInstance_1 {

	public static void main(String[] args) throws Exception {
		Employee_1 s1 = Employee_1.getInstance();
		s1.setId(1);
		s1.setName("A");
		s1.setMarks(10);
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(s1);
		System.out.println(s1.hashCode());
		out.flush();

		ObjectInputStream os = new ObjectInputStream(new FileInputStream("f.txt"));
		Employee_1 s = (Employee_1) os.readObject();
		System.out.println(s.hashCode());


	}

}

/*
 * In previous persist/depersist program, if you print hashcode of objects after
 * serialization and deseralization, both are different. If you want both
 * hashcodes are same, we have to create object after null check & use
 * readResolve() in bean class.
 */
