package Hashing;

/*hash code of custom object with hash function	*/
class Empl{
	String name;
	int age;
	 
	Empl(String name,int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		Empl other = (Empl) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}
public class HashCodeOfObjectWithHashFunction {

	public static void main(String[] args) {
		
		Empl emp1 = new Empl("Bob",20);
		System.out.println("emp1 ref :" + emp1);
		System.out.println("Hash code of emp1 is " +emp1.hashCode());

		Empl emp2 = new Empl("Bob", 20);
		System.out.println("emp2 ref :" + emp2);
		System.out.println("Hash code of emp2 is " +emp2.hashCode());
		
		
		
		System.out.println(emp1==emp2);
		System.out.println(emp1.equals(emp2));
		

	}

}

/*	Here both hash codes are same	for references*/



