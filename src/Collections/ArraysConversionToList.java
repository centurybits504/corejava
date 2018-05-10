package Collections;
/*Converting Integer array to List Collection*/
import java.util.Arrays;
import java.util.List;

public class ArraysConversionToList {
	public static void main(String[] args) {
		Integer[] _intArray = {1,2,4,3};
		/*Using asList(array) of Arrays Class*/ 
		List<Integer> _list = Arrays.asList(_intArray);
		for(Integer _int : _list){
			System.out.println(_int);
		}	
	}
}
