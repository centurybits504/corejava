package Newfeatures;

import java.util.logging.Level;
import java.util.logging.Logger;


/*java 4 Features - LoggingAPI Example */
public class Java4Features_LoggingAPI_Example {

	public static void main(String[] args) {
		 
		Logger logger = Logger.getLogger(Java4Features_LoggingAPI_Example.class.getName());
		 
		logger.log(Level.INFO,"Logger Log : Java API Logger \n");
		logger.info("Logger Info : "+logger.getName() +"\n");
		logger.warning("Logger Warning : Some Exception Occured \n");
	}

}
