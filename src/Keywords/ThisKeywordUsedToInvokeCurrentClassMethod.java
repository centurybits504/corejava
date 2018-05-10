package Keywords;

/*this keyword example: this keyword invoking current class constructor*/
public class ThisKeywordUsedToInvokeCurrentClassMethod {
	
	ThisKeywordUsedToInvokeCurrentClassMethod() {
	/*Here, if you don't use the this keyword to display(), compiler automatically adds this keyword while invoking the method*/
		this.display();
	}
	void display(){
		System.out.println("this keyword invoking current class method");
	}
	public static void main(String[] args) {
		/*Here we're creating object for current class using no-argument constructor(ThisKeywordUsedToInvokeCurrentClassMethod()), so compiler will call above constructor */
		ThisKeywordUsedToInvokeCurrentClassMethod obj = new ThisKeywordUsedToInvokeCurrentClassMethod();
	}

}

/*
OUTPUT:
this keyword invoking current class method 
*/
 