package Programs;


/*	Custom Singleton class		*/
class Single{
	
	//static --> initialising in static block, so it is declared as static
	//private --> access restricted to current class
	private static Single single = null;
	
	// private  --> constructor restricted to this class itself
	private Single(){
	}
	
	//static --> to call method with class name
	static Single returnSingleInstance(){
		//to ensure only one instance is created
		if(single == null)
			single = new Single();
	return single;
	}
}
public class CustomSingletonClass {
	public static void main(String[] args) {
		Single s = Single.returnSingleInstance();
		Single s1 = Single.returnSingleInstance();
		System.out.println(s);
		System.out.println(s1);
	}
}

/*To design a singleton class:
Make constructor as private.
Write a static method that has return type object of this singleton class. */