package ca.uvic.seng330;

import org.junit.Test;

import ca.uvic.seng330.LogExample;

public class LogTest {

	@Test
	public void test() {
		  //NB: once set, this level cannot be changed while the application is running
		  //More complex loggers (log4j, j.u.logging) are needed for dynamic logging.
	    System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "ERROR");
	    System.setProperty(org.slf4j.impl.SimpleLogger.LOG_FILE_KEY, "debug.log");

	    LogExample l = new LogExample();
	    l.log("HelloWorld");
	}

}
