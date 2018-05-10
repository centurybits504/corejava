package Enums;

/*Enums Example : In if statement*/
enum enum_4{
	MON,TUES,WED,THU,FRI,SAT,SUN;
}
public class EnumsInIfExample {

	public static void main(String[] args) {
		
		enum_4 obj = enum_4.MON;
		if(obj == enum_4.MON)
			System.out.println("MONDAY");
		else
			System.out.println("Else Day");
	 
}

}
