package ObjectClass;



/* toStritng() >> string representation of object	*/
public class EmployeObjectWithToStringMethod {

	public static void main(String[] args) {
		Employe e1 = new Employe("Mark",20);
		Employe e2 = new Employe("Bob",20);
		System.out.println(e1);
		System.out.println(e2);
		
	}

}
class Employe{
	String name;
	int age;
	Employe(String name,int age){
		this.name = name;
		this.age = age;
	}
	/*Here we are overriding the Object class toString() to get our own representation of Employe object	*/
	@Override
	public String toString() {
		return "Employe [name=" + name + ", age=" + age + "]";
	}
}