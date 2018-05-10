package Temp;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
//incomplete
class EData implements Serializable{
	private static final long serialVersionUID = 1L;
	private String name;

	public EData(String string) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		
		EData other = (EData) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}

public class TempClass {

	public static void main(String[] args) {
		
		Map<EData,String> m = new HashMap<EData, String>();
		EData e1 = new EData("A");
		EData e2 = new EData("B");
		
		System.out.println(e1);
		System.out.println(e2);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		//System.out.println(e1.equals(e2));
		
		//m.put(e1, "AA");
		///System.out.println(m.get(e2));
	}	

}
