package StringClass;

 
/*temp*/
class Emp{
	int age;
	Emp(int age){
		this.age=age;
	}
	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
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
		if (age != other.age)
			return false;
		return true;
	}*/
}

public class String_StringCreationExample  {
	
	public static void main(String[] args) { 
		
		Emp e1 = new Emp(10);
		System.out.println("e1   :" + e1);
		System.out.println("e1 hashcode  :" + e1.hashCode());
		
		
		Emp e2 = new Emp(10);
		System.out.println("e2   :"+e2);
		System.out.println("e2 hashcode  :" + e2.hashCode());
		
		System.out.println(e1==e2);
		
		System.out.println(e1.equals(e2));
		
	}

}

































/*	empty:
 * e1   :Stringclass.Emp@157ee3e5
	e2   :Stringclass.Emp@3da3da69
	false
	false
 * 
 * equals:
 * e1   :Stringclass.Emp@3da3da69
   e2   :Stringclass.Emp@5058431c
	false
	true

 * hashcode:
 *  e1   :Stringclass.Emp@29
	e2   :Stringclass.Emp@29
	false
	false
	
 * both:
 * e1   :Stringclass.Emp@29
   e2   :Stringclass.Emp@29
   false
   true

 * 
 * */
 