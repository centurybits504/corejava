package SamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*Character count in a String */
public class Character_Count_In_String {
	public static void main(String[] args) {
		String str = "AABACDAA";
		Set set = new LinkedHashSet();
		List list = new ArrayList();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
			list.add(str.charAt(i));
		}

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Character s2 = (Character) it.next();
			System.out.println(s2 + " : " + Collections.frequency(list, s2));
		}

		System.out.println("----------------------------------");

		String str1 = "AABACDAA";
		Character[] charArry = new Character[str1.length()];
		for (int i = 0; i < str1.length(); i++) {
			charArry[i] = str1.charAt(i);
		}

		Set set1 = new HashSet(Arrays.asList(charArry));
		Iterator it1 = set1.iterator();
		while (it1.hasNext()) {
			Character s2 = (Character) it1.next();
			System.out.println(s2 + " : "
					+ Collections.frequency(Arrays.asList(charArry), s2));
		}

	}
}



 