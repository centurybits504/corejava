package Exceptionhandling;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Checked_ParseException_Example {
	public static void main(String[] args) {
		//here we required date format like this dd/MM/yyyy
		DateFormat  dft = new SimpleDateFormat("dd/MM/yyyy");
		//here we provided date format like this dd-MM-yyyy, so we got here ParseException
		String dateString = "11-11-2000";
		
		Date dt;
		try{
			dt = dft.parse(dateString);
             System.out.println(dt);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
