/*package Cloning;

public class ShallowCloning {

	public static void main(String[] args) {
		Car car1 = new Car();car1.setName("C");car1.setNo("C1");
		Vehicle sub1 = new Vehicle("S1",car1);
		System.out.println("original object :" +sub1);
		Vehicle sub2 = (Vehicle) sub1.clone();
		System.out.println("cloned object : "+sub2);
		sub2.setSubName("SS1");
		sub2.getCar().setName("CC");
		System.out.println("cloned object after shallow cloning : " +sub2);
		System.out.println("original object after shallow cloning : " +sub1);
	 
	}

}
class Vehicle implements Cloneable{
	private String SubName;
	private Car car;
	public Vehicle(String subName, Car car) {
		super();
		this.SubName = subName;
		this.car = car;
	}
	@Override
	public String toString() {
		return "Vehicle [SubName=" + SubName + ", car=" + car + "]";
	}
	public String getSubName() {
		return SubName;
	}
	public void setSubName(String subName) {
		SubName = subName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	public Object clone() {
		//shallow copy
		try {
		  return super.clone();
		} catch (CloneNotSupportedException e) {
		  return null;
		}
	  }
}
class Car implements Cloneable{

	private String name;
	private String no;
	@Override
	public String toString() {
		return "Car [name=" + name + ", no=" + no + "]";
	}
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
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		  return super.clone();
		}
}
*/

//The Object.clone() method copies the content of the object to another object bit-by-bit, meaning the values of all instance variables from one object will get copied to instance variables of other objects.


/*in shallow cloning,
   reference is shared between two objects in case of user-defined objects.
   different copy of value will be there in case of primitive data types
 */