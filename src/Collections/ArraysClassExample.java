package Collections;

/*Arrays Class Example*/
import java.util.Arrays;

public class ArraysClassExample {
	public static void main(String[] args) {
		int[] _intArray = {1,2,4,3};
		
		System.out.println("BEFORE SORING");
		for(Integer iObj : _intArray){
			System.out.println(iObj.intValue());
		}
		
		Arrays.sort(_intArray);
		
		System.out.println("AFTER SORING ");
		for(Integer iObj : _intArray){
			System.out.println(iObj.intValue());
		}
	}

}
