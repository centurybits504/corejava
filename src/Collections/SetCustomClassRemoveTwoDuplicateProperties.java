package Collections;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
/* We have a list of  Employees with 3 properties, remove duplicate employee when 2 properties are same	*/
class Emp implements Serializable{
	private String name;
	private String no;
	private String street;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((no == null) ? 0 : no.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no == null) {
			if (other.no != null)
				return false;
		} else if (!no.equals(other.no))
			return false;
		return true;
	}
	
}
public class SetCustomClassRemoveTwoDuplicateProperties {

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.setName("A");e1.setNo("1");e1.setStreet("S");
		
		Emp e2 = new Emp();
		e2.setName("A");e2.setNo("1");e2.setStreet("SS");
		
		Set<Emp> list = new HashSet<>();
		list.add(e1);
		list.add(e2);
		System.out.println(list.size());
	}

}
