package Constructors;
/*Constructor Example : Constructor Overloading*/
public class ConstructorExampleOverloadingConstructor {

	String name;
	int firstHalf, secondHalf;
	/*Here we're overloading the constructors*/
	ConstructorExampleOverloadingConstructor(String name, int firstHalf){
		this.name = name;
		this.firstHalf = firstHalf;
	}
	ConstructorExampleOverloadingConstructor(int firstHalf,int secondHalf){
		this.firstHalf = firstHalf;
		this.secondHalf = secondHalf;
	}
	void display(){
		System.out.println("From Object obj_1, name :  "+ name);
		System.out.println("From Object obj_1, firstHalf :  "+ firstHalf);
	}
	void print(){
		System.out.println("From Object obj_2, firstHalf :  "+ firstHalf);
		System.out.println("From Object obj_2, secondHalf :  "+ secondHalf);
	}
	public static void main(String[] args) {
	
		ConstructorExampleOverloadingConstructor obj_1 = new ConstructorExampleOverloadingConstructor("A",20);
		ConstructorExampleOverloadingConstructor obj_2 = new ConstructorExampleOverloadingConstructor(40,80);
		obj_1.display();
		obj_2.print();
	}

}
