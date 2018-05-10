package SamplePrograms;



public class Singleton1 {
	
	int i = 10;
	
	private static Singleton1 s1 = null;
	
	private Singleton1()
	{
		
	}
	
	static
	{
		s1 = new Singleton1();
	}
	
	public static Singleton1 getSingleton()
	{
		if(s1 == null)
		{
			s1 = new Singleton1();
			return s1;
		}else
		{
			return s1;
		}
	}
	
	public void show()
	{
		System.out.println("------------------Singleton------"+i);
		
		
	}
	public static void main(String[] args) {
		
		Singleton1 s2 = Singleton1.getSingleton();
		
		Singleton1 s3 = Singleton1.getSingleton();
		
		System.out.println(s2==s3);
		
		
	}

}
