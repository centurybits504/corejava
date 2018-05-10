package ObjectClass;
//
public class CloneMethod  {

	public static void main(String[] args)  {
		 Emp  emp = new Emp("A","1");
		 System.out.println(emp.toString());
		 Emp empClone;
		try {
			empClone = (Emp) emp.clone();
			System.out.println(empClone.toString());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	 

}
class Emp implements Cloneable{
	private String name;
	private String no;
	public Emp(String name, String no) {
		this.name=name;
		this.no=no;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", no=" + no + "]";
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

/*clone is a method of the Object class. 
 * For a class to be "cloneable" it should implement the marker Cloneable interface. 
 * 
 * */
 //https://stackoverflow.com/questions/9164107/clone-in-java
