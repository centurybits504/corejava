package ObjectClass;

public class GetClassMethod {

	public static void main(String[] args) {
		Empl emp = new Empl("A",10);
		System.out.println(emp.getClass());
	}

}
class Empl {
	String name;
	int age;
	Empl(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
