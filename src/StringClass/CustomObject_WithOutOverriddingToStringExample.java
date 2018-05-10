package StringClass;

/* Printing object without overridding toString()	*/
public class CustomObject_WithOutOverriddingToStringExample {
	String name;
	int id;

	CustomObject_WithOutOverriddingToStringExample() {
	}
	CustomObject_WithOutOverriddingToStringExample(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		CustomObject_WithOutOverriddingToStringExample obj1 = new CustomObject_WithOutOverriddingToStringExample("A", 1);

		System.out.println(obj1);

	}

}

/*
 *  Java Docs Object.toString() says: Returns a string representation of the object.
 *  In general, the toString method returns a string that "textually represents" this object. 
 *  The result should be a concise but informative representation that is easy for a person to read.
 *  It is recommended that all subclasses override this method.
 * 
 *  The toString method for class Object returns a string consisting of the name of the class of which the object is an instance, the at-sign character `@', and the unsigned hexadecimal representation of the hash code of the object. 
 *  
 *  In other words, this method returns a string equal to the value of:
 *	
 *	getClass().getName() + '@' + Integer.toHexString(hashCode())
 *	ClassName				@		MemoryLocation (hexidecimal address of where that object is stored in memory)
 * 
 *
 * */

