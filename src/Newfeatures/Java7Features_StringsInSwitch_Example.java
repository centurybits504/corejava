package Newfeatures;

/*Java7 features : strings in switch */
public class Java7Features_StringsInSwitch_Example {
	public static void main(String[] args) {

		String _WEEKDAY = "SUNDAY";
		String display = null;
		switch(_WEEKDAY){
		 
		  case "MONDAY":  display = "Displaying MONDAY";
			  			  break;
		  case "TUESDAY": display = "Displaying TUESDAY";
			              break;
		  case "WEDNESDAY": display = "Displaying WEDNESDAY";
          					break;
		  case "THURSDAY": display = "Displaying THURSDAY";
          					break;
		  case "FRIDAY": display = "Displaying FRIDAY";
          				 break;
		  case "SATURDAY": display = "Displaying SATURDAY";
          				   break;
		  case "SUNDAY":  display = "Displaying SUNDAY";
			  			  break;
		}
		System.out.println(display);
	}
}
