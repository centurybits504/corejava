package SamplePrograms;

 
//I don't know
public class RightAngletriangle_Star {

	public static void main(String[] args) { 
		int n=4;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++)
				System.out.print(" *");
			System.out.println();
			
			if(i==n)
			reverse(n);
		}
	}

	private static void reverse(int temp) { 
		int n=temp-1;
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			System.out.print(" *");
			
			System.out.println(" ");
		}
		
	}

}
