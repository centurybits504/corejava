package Serializationanddeserialization;

import java.io.Serializable;

public class Employee_1 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static Employee_1 emp = null;
	static Integer id;
	static  String name;
	static  Integer marks;
	private Employee_1(Integer id,String name,Integer marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public static Employee_1 getEmp() {
		return emp;
	}
	public static void setEmp(Employee_1 emp) {
		Employee_1.emp = emp;
	}
	public Integer getId() {
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
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}	
	public static Employee_1 getInstance(){
		if(emp==null){
			emp = new Employee_1(id, name, marks);
		}
		return emp;
	}
	protected Object readResolve(){
		return emp;
	}
}