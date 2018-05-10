import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*Collections Class Example*/
public class CollectionsClassExample {
	public static void main(String[] args) {
		List _list = new ArrayList();
		_list.add("A");
		_list.add("B");
		String str = Collections.max(_list);
		System.out.println(str);
		
	}
}
