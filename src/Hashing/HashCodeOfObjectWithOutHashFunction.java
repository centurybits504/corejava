package Hashing;

/*hash code of custom object without hash function	*/
class Emply{
	String name;
	int age;
	 
	Emply(String name,int age){
		this.name = name;
		this.age = age;
	}

}
public class HashCodeOfObjectWithOutHashFunction {

	public static void main(String[] args) {

		Emply emp1 = new Emply("Bob", 20);
		System.out.println("Hash code of emp1 is " + emp1.hashCode());

		Emply emp2 = new Emply("Bob", 20);
		System.out.println("Hash code of emp2 is "+ emp2.hashCode());
		
	}

}

/*	Here both hash codes are different for references */
