import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
    private String name;
	private String jobTitle;
    private int age;
    private int salary;
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
    public Employee(String name, String jobTitle, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }
    public String toString() {
        return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
    }
}
class EmployeeAgeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getAge() - emp2.getAge();
    }
}
class EmployeeJobTitleComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getJobTitle().compareTo(emp2.getJobTitle());
    }
}
class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary() - emp2.getSalary();
    }
}
class EmployeeChainedComparator implements Comparator<Employee> {
    private List<Comparator<Employee>> listComparators;
   /* Here 3 dots, means that zero (or) more Comparator objects (or an array of them) may be passed as the parameter(s) for that function.
    *We can it as Variable arguments 
    * */
    @SafeVarargs
    public EmployeeChainedComparator(Comparator<Employee>... comparators) {
        this.listComparators = Arrays.asList(comparators);/*Here converting array(Comparator objects) to list*/
    }
    @Override
    public int compare(Employee p1, Employee p2) {
        for (Comparator<Employee> comparator : listComparators) {
            int result = comparator.compare(p1, p2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}

public class ComparatorSortingPersonExample {
	
	public static void main(String[] args) {
		System.out.println("**** Sorting Multiple Data Members ****");
		List<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees.add(new Employee("A", "TESTED", 20, 100));
		listEmployees.add(new Employee("D", "DBA", 10, 200));
		listEmployees.add(new Employee("B", "DEVELOPER", 25, 400));
		listEmployees.add(new Employee("C", "SYSTEM ENGINEER", 60, 600));

		System.out.println("\n**** Before sorting ****");
		for (Employee p : listEmployees) 
		{
			System.out.println(p);
		}
		Collections.sort(listEmployees, new EmployeeChainedComparator(
				new EmployeeJobTitleComparator(),
                new EmployeeAgeComparator(),
                new EmployeeSalaryComparator())
        );
		System.out.println("\n**** After sorting data members in order(JobTitle,Age,Salary) **** ");
		for (Employee p : listEmployees) {
            System.out.println(p);
        }
	}
	
}
