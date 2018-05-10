package Keywords;

/*this keyword Example : Used To Pass As Argument In Methods */

public class ThisKeywordUsedToPassAsArgumentInMethods {

	String name; 
	int age;
	ThisKeywordUsedToPassAsArgumentInMethods(){
	}
	ThisKeywordUsedToPassAsArgumentInMethods(String name, int age){
		this.name = name;
		this.age = age;
	}
	void tempDisplay() {
		display(this);
	}
	void display(ThisKeywordUsedToPassAsArgumentInMethods object){
		System.out.println("Hi..! My name is " + object.name  +" &  my age is "+ object.age );

	}
	public static void main(String[] args) {
		ThisKeywordUsedToPassAsArgumentInMethods obj  = new ThisKeywordUsedToPassAsArgumentInMethods("A",10);
		obj.tempDisplay();
	}
	

}


/*
OUTPUT:
Hi..! My name is A &  my age is 10
*/
