package StringClass;


final class  CustomImmutableClass {

	
	private final String str;
	private final int i;
	
	CustomImmutableClass(){
		str = "A";
		i=0;
	}
	/* We should not use setter methods to initialize member variables because it leads to change of member varialbes	*/
	/* constructor is to initalizes  member variables	*/
	/* final to class >> not allow  extend class	*/
	/* private to variables >> cannot initalizes variables outside of class */
	/* final to variables >> cannot initalizes variables outside of constructor  */
	
	
	 
}

/*
To create immutable class in java, you have to do following steps.

Declare the class as final so it can’t be extended.
Make all fields private so that direct access is not allowed.
Don’t provide setter methods for variables
Make all mutable fields final so that it’s value can be assigned only once.
Initialize all the fields via a constructor performing deep copy.
Perform cloning of objects in the getter methods to return a copy rather than returning the actual object reference.*/

