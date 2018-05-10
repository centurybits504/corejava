package SamplePrograms;
/*Factorial Example : Recursive*/
public class Factorial {
	static int fact(int num) {
		int result;
		if (num > 1) {
			result = fact(num - 1) * num;
			return result;
		} else {
			return 1;
		}

	}
	public static void main(String[] args) {
		System.out.println(fact(4));
	}
}
