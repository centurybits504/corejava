package Enums;

public class EnumsIterationInsideClassExample {

	enum Days{
		MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
	}
	public static void main(String[] args) {
	 
		for(Days days:Days.values()){
			System.out.println(days);
		}
	}

}
