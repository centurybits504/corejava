package SamplePrograms;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i<3;i++){
			try{
				if(i==1)
					System.out.println(1/0);
				else
					System.out.println(i);
				
				break;
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}
