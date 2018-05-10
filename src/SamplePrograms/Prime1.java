package com_1.oops;
public class Prime1 {
	
	public static void main(String[] args) {
		
		int i = 7;
		int j = 2;
		int l = 0;
		boolean b1 = false;
		
		while(j<i)
		{
			int k = i%j;
			if(k == 0)
			{
				b1 = true;
				System.out.println("Not Prime Number");
				break;
			}
			j++;
		}
		
		if(b1 == false)
		{
			System.out.println(i + " is a prime number");
		}
		
		
	}

}
