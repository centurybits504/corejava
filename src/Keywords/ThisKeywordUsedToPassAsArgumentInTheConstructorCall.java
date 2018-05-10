package Keywords;

/*this keyword example : this keyword can be pass as argument in the constructor call*/
class ThisOther {

	ThisKeywordUsedToPassAsArgumentInTheConstructorCall obj;

	public ThisOther(ThisKeywordUsedToPassAsArgumentInTheConstructorCall obj) {
		this.obj = obj;
	}

	public void display() {
		System.out.println("Hi..! My name is " + obj.name + " &  my age is "
				+ obj.age);
	}
}

public class ThisKeywordUsedToPassAsArgumentInTheConstructorCall {

	String name;
	int age;

	public ThisKeywordUsedToPassAsArgumentInTheConstructorCall(String name, int age) {
		this.name = name;
		this.age = age;
		new ThisOther(this).display();

	}

	public static void main(String[] args) {
		new ThisKeywordUsedToPassAsArgumentInTheConstructorCall("A", 10);

	}

}
