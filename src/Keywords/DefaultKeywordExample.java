package Keywords;

/*default Example in switch */
public class DefaultKeywordExample {

	public static void main(String[] args) {

		String _WEEKDAY = "UNKNOWN";
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
		   default : display = "Displaying UNKNOWN DAY";
		   				break;	
		}
		
		System.out.println(display);
	}

}
/*-----------------------------------------------*/
