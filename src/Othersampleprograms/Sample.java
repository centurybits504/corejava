package Othersampleprograms;

import java.util.Comparator;

class Emp implements Comparator<Emp>{
	int i;
	Emp(int i){
		this.i=i;
	}
	@Override
	public int compare(Emp o1, Emp o2) {
		System.out.println("--");
		// TODO Auto-generated method stub
		
		if(o1.i==o2.i)
		return 1;
		else
		return 0;
	}
}
public class Sample {

	public static void main(String[] args) {
		Emp e1 = new Emp(1);
		Emp e2 = new Emp(1);
		System.out.println("e1" + e1);
		System.out.println("e2" + e2);
		System.out.println(e1.equals(e2));
		System.out.println(e1 == e2);
		
	}

}
