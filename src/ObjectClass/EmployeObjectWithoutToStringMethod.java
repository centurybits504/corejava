package ObjectClass;

public class EmployeObjectWithoutToStringMethod {
	
	public static void main(String[] args) {
		Employ e1 = new Employ("Mark", 20);
		Employ e2 = new Employ("Bob", 20);
		System.out.println("e1 : " + e1);
		System.out.println("e2 :" + e2);
	}

}
class Employ {
	String name;
	int age;
	Employ(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
