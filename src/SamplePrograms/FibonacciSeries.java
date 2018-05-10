package SamplePrograms;

//[X]
public class FibonacciSeries {
	public static void main(String[] args) { 
		
		int num=200;
		int[] numarry=new  int[num];
		numarry[0]=0;
		numarry[1]=1;
		
		for(int i=2;i<num;i++)
		{
			numarry[i]=numarry[i-1]+numarry[i-2];
		}
		for(int j=0;j<num;j++)
		{
			System.out.println(numarry[j]);
		}
		
		//Get Maximum Memory Available to Java Virtual Machine(JVM) 
		Runtime runtime = Runtime.getRuntime();
		long maxMemory = runtime.maxMemory();
		System.out.println(maxMemory +"bytes");
	}

}
