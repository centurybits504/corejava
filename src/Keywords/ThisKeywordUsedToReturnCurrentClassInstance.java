package Keywords;

/*this keyword example: this keyword  used to return current class instance to the calling */

class ThisOther_1 {

	String name;
	int age;

	public ThisOther_1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	ThisOther_1 returnThisOther_1() {//return's the instance of "ThisOther_1" class
		return this;
	}

	public void display() {
		System.out.println("Hi..! My name is " + name + " &  my age is " + age);
	}

}

public class ThisKeywordUsedToReturnCurrentClassInstance {

	public static void main(String[] args) {
		ThisOther_1 obj = new ThisOther_1("A", 10);
		ThisOther_1 object = obj.returnThisOther_1();
		object.display();
	}

}
