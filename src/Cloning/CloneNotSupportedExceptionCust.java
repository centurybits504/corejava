package Cloning;

/*
 CloneNotSupportedException is Checked Exception(compile-time)  */
public class CloneNotSupportedExceptionCust {

	public static void main(String[] args) {
		Vehicle_1 sub1 = new Vehicle_1();
		sub1.clone();
	}

}
class Vehicle_1{
}

