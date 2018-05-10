package Keywords;

public class BreakExampleWithSwitch {
	public static void main(String[] args) {
        String defaultDay = null;
        int defaultDayIndex = 4;
        switch (defaultDayIndex) {
            case 1:  defaultDay = "Monday";
                     break;
            case 2:  defaultDay = "Tuesday";
                     break;
            case 3:  defaultDay = "Wednesday";
                     break;
            case 4:  defaultDay = "Thursday";
                     break;
            case 5:  defaultDay = "Friday";
                     break;
            case 6:  defaultDay = "Saturday";
                     break;
            case 7:  defaultDay = "Sunday";
                     break;
            default: defaultDay = "Unknown Day";
                     break;
        }
        System.out.println("Weekday : "+defaultDay);
	}
}

/*-----------------------------------------------*/