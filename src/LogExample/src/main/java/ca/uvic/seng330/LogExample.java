package ca.uvic.seng330;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Shows a simple example of using SLF4J and its simplelogger.<br/>
 * @see https://www.slf4j.org/api/org/slf4j/impl/SimpleLogger.html
 * @see https://stackoverflow.com/questions/14544991/how-to-configure-slf4j-simple
 * @author nernst
 *
 */
public class LogExample {

  private Logger logger = LoggerFactory.getLogger(LogExample.class);

  /**
   * Logging. Use SLF4J to write all message traffic to the log file.
   *
   * @param logMsg
   */
  public void log(String logMsg) {
//    logger.debug("");
	    logger.info(logMsg);

//    logger.warn(msg);
    logger.error("Test file logging");
  }

}