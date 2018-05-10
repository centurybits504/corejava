package Interface;


/* Multiple inheritance in classes */
/*Multiple inheritance is not supported in case of class but it is supported in case of interface*/
interface car_1
{
	public void gearing_system();
}
interface car_2
{
	public void gearing_system();
	
}

public class MultipleInheritanceInClass implements car_1,car_2 {

	public void gearing_system() {
		System.out.println("Interface_4 >>  gearing_system()");
		}
	
	public static void main(String[] args) {
		 new MultipleInheritanceInClass().gearing_system();

	}

}
//Note:Here both interfaces have same methods ,so no matter which method we implement. 
//not supported in class bcz it is an ambiguity to compiler ,which method it has to take.
