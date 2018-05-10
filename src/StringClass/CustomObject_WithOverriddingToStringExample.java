package StringClass;

/* Printing object with overridding toString()	*/
public class CustomObject_WithOverriddingToStringExample {
	String name;
	int id;

	CustomObject_WithOverriddingToStringExample() {
	}
	CustomObject_WithOverriddingToStringExample(String name, int id) {
		this.name = name;
		this.id = id;
	}
	/* toString() method returns the string representation of the object*/
	public String toString() {
		return name + " : " + id;
	}

	public static void main(String[] args) {
		CustomObject_WithOverriddingToStringExample obj1 = new CustomObject_WithOverriddingToStringExample("A", 1);

		System.out.println(obj1);

	}

}


