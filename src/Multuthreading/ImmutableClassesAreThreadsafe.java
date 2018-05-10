package Multuthreading;

 //incomplete
/*Here Employee is the immutable class	*/
final class EmployeeImmutable
{
    private final String empName;	
    private final AddressImt address;
	public EmployeeImmutable(String empName, AddressImt address)
	{
		this.empName = empName;
		this.address = address;
	}
    public String getEmpName() {
		return empName;
	}
	 
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + "]";
	}

}
class AddressImt implements Cloneable
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

public class ImmutableClassesAreThreadsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
