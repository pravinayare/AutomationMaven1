package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoLogger {

	public static void main(String[] args) {

		Logger log = LogManager.getLogger();
		log.info("This is any IMP logs");
		
	}

}
