package SamplePrograms;

public class Prime_Number {

	public static void main(String[] args) {
		int num=80000;
		for(int k=1;k<=num;k++)
		{
		boolean isPrime=true;
		
		for(int i=2;i<k;i++)
		{
			if(k%i==0)
			{	
				isPrime=false;
				break;
			}
		}if(isPrime)
		System.out.println(k);
	
		}
	}

}







/* 
int num=100;
for(int i=1;i<=num;i++)
{
	   
	   boolean s1 = true;
	   for(int j = 2;j<i;j++)
	   {
		   if(i%j==0)
		   {
			   s1 = false;
			   break;
		   }
		    
	   } if(s1)
          System.out.print(i +"\n");
	 
}



*/