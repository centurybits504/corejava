import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*Here sorting list of type Integer & String */
class EmployeeAgeAscending implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1-o2;
	}
}
class EmployeeAgeDescending implements Comparator<Integer>{
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
}
class EmployeeNameAscending implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
} 
class EmployeeNameDescending implements Comparator<String>{
	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}
}

public class ComparatorSortingExample {
	public static void main(String[] args) {
		
		 List<Integer> _listIntegers = new ArrayList<Integer>();
		 _listIntegers.add(2);
		 _listIntegers.add(1);
		 _listIntegers.add(3);
		 System.out.println("Before Sorting(_listIntegers) : "+_listIntegers);
		 /*Sorting _listIntegers elements in descending order*/
		 Collections.sort(_listIntegers, new EmployeeAgeDescending());
		 System.out.println("After Descending Sorting(_listIntegers) : "+_listIntegers);
		 /*Sorting _listIntegers elements in ascending*/
		 Collections.sort(_listIntegers, new EmployeeAgeAscending());
		 System.out.println("After Asecding Sorting(_listIntegers) : "+_listIntegers);
		 
		 System.out.println("-------------------------------------------------");
		 
		 List<String> _listString = new ArrayList<>();
		 _listString.add("B");
		 _listString.add("A");
		 _listString.add("C");
		 System.out.println("Before Sorting(_listString) : "+_listString);
		 /*Sorting _listString elements in descending order*/
		 Collections.sort(_listString, new EmployeeNameDescending());
		 System.out.println("After Descending Sorting(_listString) : "+_listString);
		 /*Sorting _listString elements in ascending*/
		 Collections.sort(_listString, new EmployeeNameAscending());
		 System.out.println("After Asecding Sorting(_listString) : "+_listString);

		 
	}

}
