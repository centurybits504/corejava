package SamplePrograms;

//I don't know
import java.util.*;
public class StringRepeat {
	
	public static void main(String[] args) {
		
		String name = "manjunatha";
		Set set = new HashSet();
		ArrayList aList = new ArrayList();
		int temp = 0;
		for(int i=0;i<name.length();i++)
		{
			aList.add(name.charAt(i));
			if(set.add(name.charAt(i)))
			{
				//System.out.println(name.charAt(i)+" and temp value "+Collections.frequency(al, name.charAt(i)));
				
			}else
			{
				temp++;
				///System.out.println(name.charAt(i)+" and temp value "+temp);
			} 
			
		}
		for(int i=0;i<name.length();i++)
		{
		
		System.out.println(name.charAt(i)+" and temp value "+Collections.frequency(aList, name.charAt(i)));
		}
	}

}
