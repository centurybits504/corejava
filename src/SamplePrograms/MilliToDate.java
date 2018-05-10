package SamplePrograms;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MilliToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String x = "1086073200000";

				DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

				long milliSeconds= Long.parseLong(x);
				System.out.println(milliSeconds);

				Calendar calendar = Calendar.getInstance();
				calendar.setTimeInMillis(milliSeconds);
				System.out.println(formatter.format(calendar.getTime())); 
	}

}
