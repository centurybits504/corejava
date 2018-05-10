package Othersampleprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {

	public static void main(String[] args)throws Exception {//Getting today's date
        
       Date today = new Date();
        
       //Printing today's date in the default format
        
       System.out.println("Today is : "+today);
        
       //Formatting today's date in yyyy-MM-dd format
        
       SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        
       System.out.println("Today in yyyy-MM-dd format : "+formatter.format(today));}

}
