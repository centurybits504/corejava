package Cloning;

public class DeepCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		Car car1 = new Car();car1.setName("C");car1.setNo("C1");
		Vehicle sub1 = new Vehicle("S1",car1);
		System.out.println("original object :" +sub1);
		Vehicle sub2 =  sub1.clone();
		System.out.println("cloned object : "+sub2);
		sub2.setSubName("SS1");
		sub2.getCar().setName("CC");
		System.out.println("cloned object after deep cloning : " +sub2);
		System.out.println("original object after deep cloning : " +sub1);
	}

}
class Vehicle implements Cloneable{
	private String subName;
	private Car car;
	public Vehicle(String subName, Car car) {
		super();
		this.subName = subName;
		this.car = car;
	}
	@Override
	public String toString() {
		return "Vehicle [subName=" + subName + ", car=" + car + "]";
	}
	public String getSubName() {
		return subName;
	}
	public void setSubName(String subName) {
		this.subName = subName;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public Vehicle clone() throws CloneNotSupportedException {
		//deep coping
		Vehicle vehicle = (Vehicle)super.clone();
		vehicle.car = (Car)car.clone();
		return  vehicle;
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
	public Object clone() throws CloneNotSupportedException {
		  return super.clone();
		}
}

/*in deep cloning,
reference is not shared(both object have different copies) between two objects in case of user-defined objects.
different copy of value will be there in case of primitive data types
*/