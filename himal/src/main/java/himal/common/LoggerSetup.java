package himal.common;

import java.util.logging.Logger;

public class LoggerSetup {

	public static Logger getApplicationLogger(Class classz) {		
		Logger log = Logger.getLogger(classz.getName());
		return log;
	}
}