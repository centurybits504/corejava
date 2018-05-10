package Enums;

enum Days_2{
	MONDAY(11),TUESDAY(22),WEDNESDAY(33),THURSDAY(44),FRIDAY(55),SATURDAY(66),SUNDAY(77);
	int day_value ; 
	private Days_2(){
	}
	private Days_2(int day_value){
		this.day_value = day_value;
	}
  }
public class EnumsDisplayingValuesToConstantsExample {

	public static void main(String[] args) {
		for(Days_2 days : Days_2.values()){
			System.out.println(days +" : "+ days.day_value);
		}
		System.out.println("--------------------------------");
		
		Days_2 d = Days_2.MONDAY;
		System.out.println(d);
		System.out.println(d.name());
		
		System.out.println("--------------------------------");
		
		 
		
	}

}
