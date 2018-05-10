package StringClass;
/*Creating Custom  immutable class		*/
public class CustImmutableClass {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address = new Address();
		address.setAddress("Australia");
		address.sethNo("1234");
		Employee employee = new Employee("Alex", address);
		System.out.println(employee.toString());
		employee.getAddress().setAddress("England");
		System.out.println(employee.toString());
	}
}
/*Here Employee is the immutable class	*/
final class Employee
{
    private final String empName;	
    private final Address address;
	public Employee(String empName, Address address)
	{
		this.empName = empName;
		this.address = address;
	}
    public String getEmpName() {
		return empName;
	}
	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}

}

class Address implements Cloneable
{
	private String hNo,address;
	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", address=" + address + "]";
	}
	public String gethNo() {
		return hNo;
	}
	public void sethNo(String hNo) {
		this.hNo = hNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Object clone() throws CloneNotSupportedException {
		  return super.clone();
		} 
	
}

/*
To create immutable class in java, you have to do following steps.

Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables
Make all mutable fields final so that it’s value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/
