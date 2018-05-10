package Serializationanddeserialization;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	Integer id;
	String name;
	Integer marks;
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}

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

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	protected Object readResolve(){
		return new Employee(id, name);
	}
}