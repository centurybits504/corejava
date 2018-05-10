package SamplePrograms;

public class Triangle_Star {
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n-1;j++)
			System.out.print("A");
			
			for(int k=1;k<=i;k++)
			System.out.print(" "+"*");//+k//+i
			
			System.out.println();
					
			if(i==n)
			reversestars(n);
		}  
	}

	private static void reversestars(int temp) {
		int n=temp-1;
		for(int i=n;i>=1;i--)
		{
				for(int j=i;j<=n;j++)
				System.out.print("B");
			
				for(int k=i;k>=1;k--)
				System.out.print(" "+"*");//+k//+i
						
				System.out.println();
					
					 
		}
		
	}
}
