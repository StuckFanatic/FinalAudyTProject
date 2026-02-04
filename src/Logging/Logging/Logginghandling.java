package Logging;

import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;

public class Logginghandling {

	final static Logger Log = 
			LogManager.getLogger("example");
	
	public static void main (String[] args) {
		
		Log.debug("Hello");
		Log.info("Hello Everyone");
	}
	
	
}
