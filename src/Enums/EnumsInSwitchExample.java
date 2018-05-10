package Enums;

/*Enums Example : In switch Statement */
enum enum_3{
	MON,TUES,WED,THU,FRI,SAT,SUN;
}
public class EnumsInSwitchExample {

	public static void main(String[] args) {
		enum_3 enumsObj = enum_3.MON;
 		switch(enumsObj){
		case MON : System.out.println("MONDAY");break;
		case TUES : System.out.println("SUNDAY");break; 
		}
	}

}
