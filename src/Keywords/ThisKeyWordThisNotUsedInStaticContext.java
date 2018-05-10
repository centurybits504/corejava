package Keywords;

/*this keyword Example : this keyword can't be used in static context*/
public class ThisKeyWordThisNotUsedInStaticContext {
	 
	static{
		System.out.println(this); //this cann't use in static context // compile-time error
	}
	 
	public static void main(String[] args) {
		
	}

}


/*
"this" keyword can't be used in static context, because “this” refers to an Current Calling Object.
Static methods are not part of any object, so "this" cann't use in static context.
A static method is not referring to any object and thus cannot directly accessible.
*/

 