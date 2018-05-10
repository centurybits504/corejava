package Keywords;

/*this keyword Example : this keyword is not user here to get values */
public class ThisKeywordNotUsedToReferCurrentClassInstanceVariables {
	String name; //Here name, age are instance variable
	int age;
	ThisKeywordNotUsedToReferCurrentClassInstanceVariables(String userName, int userAge){//Here userName, userAge are local variables (or) formal arguments
		name = userName;
		age = userAge;
	}
	
	public static void main(String[] args) {
		ThisKeywordNotUsedToReferCurrentClassInstanceVariables obj = new ThisKeywordNotUsedToReferCurrentClassInstanceVariables("A",10);
		System.out.println("Name : "+obj.name);
		System.out.println("Age : "+obj.age);
	}

}

/*
OUTPUT:
Name : A
Age : 10
*/

/*
Here,
If formal arguments(userName, UserAge) and instance variables(name,age) are different, so there is no need to use this keyword. 
*/
 