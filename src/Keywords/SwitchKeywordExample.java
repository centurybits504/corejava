package Keywords;

import java.util.Calendar;
/*Switch Keyword Example : Current Month*/
public class SwitchKeywordExample {
	public static void main(String[] args) {
		
		Calendar nowCalander = Calendar.getInstance();
		/* month start from 0 to 11*/
		int currentMonthIndex = nowCalander.get(Calendar.MONTH) + 1;
        String currentMonthString;
        
        switch (currentMonthIndex) {
            case 1:  currentMonthString = "January";
                     break;
            case 2:  currentMonthString = "February";
                     break;
            case 3:  currentMonthString = "March";
                     break;
            case 4:  currentMonthString = "April";
                     break;
            case 5:  currentMonthString = "May";
                     break;
            case 6:  currentMonthString = "June";
                     break;
            case 7:  currentMonthString = "July";
                     break;
            case 8:  currentMonthString = "August";
                     break;
            case 9:  currentMonthString = "September";
                     break;
            case 10: currentMonthString = "October";
                     break;
            case 11: currentMonthString = "November";
                     break;
            case 12: currentMonthString = "December";
                     break;
            default: currentMonthString = "Unknown Month";
                     break;
        }
        System.out.println("CURRNET MONTH : "+currentMonthString);

	}

}
