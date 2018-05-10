import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*Custom Class Object Sorting Using Comparable Interface*/
/*Person class must implements the Comparable interface for Sorting  it's objects.*/
class Person  implements Comparable<Person>
{
	Integer empId;
	String empName;
	public Person(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public int compareTo(Person obj) {

		/*this code is for comparing String's */
		Person st=(Person)obj;
		/*this compareTo() from String class*/
		return empName.compareTo(st.empName);
		
		/*this code is for comparing Integer's */
		/*Person st=(Person)obj;  
		if(empId==st.empId)  
		return 0;  
		else if(empId>st.empId)  
		return 1;  
		else  
		return -1;  
		*/
	}
} 
public class SortingComparablePersonObjectsExample {
	public static void main(String[] args) {
 
		/*this code is for comparing String's */
		List<Person> _list2=new ArrayList<Person>();
		_list2.add(new Person(10,"BB"));
		_list2.add(new Person(20,"AA"));
		Collections.sort(_list2);
		System.out.println("AFTER SORTING: Name -- Id\n");
		for(Object obj:_list2){
			System.out.println(((Person)obj).empName    +" -- "+ ((Person)obj).empId);
		}
		
		/*this code is for comparing Integer's */
		/*List<Person> _list1=new ArrayList<Person>();
		_list1.add(new Person(20,"A"));
		_list1.add(new Person(10,"B"));
		Collections.sort(_list1);
		System.out.println("AFTER SORTING: Name -- Id");
		for(Object obj:_list1){
			System.out.println(((Person)obj).empId   +" -- "+ ((Person)obj).empName);
		}
		*/
		
		
		
	}
}
