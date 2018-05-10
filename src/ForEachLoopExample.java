import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ForEachLoopExample {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Bus");
		list.add("Bike");
		list.add("Car");

		for (Object str : list) {
			System.out.println(str);
		}

		 
	}

}
