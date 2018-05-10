package Cloning;

/* coping reference to another	*/
public class CopyingOneObjectToAnotherUsingAssignment {

	public static void main(String[] args) {
		
		Person original = new Person("A","1");
		Person copy = original;
		
		System.out.println("original " + original);
		System.out.println("copy "+copy);

		System.out.println("----------------");
		System.out.println(original==copy);
		System.out.println(original.equals(copy));
		
		System.out.println("----------------");
		copy.setNo("2");
		System.out.println("original " + original);
		System.out.println("copy "+copy);
		
	}

}

class Person{
	private String name;
	
	public Person(String name, String no) {
		super();
		this.name = name;
		this.no = no;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", no=" + no + "]";
	}
	private String no;
	
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
}
