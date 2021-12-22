package dave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

   // get a logger instance named "com.foo"
   Logger  logger = LoggerFactory.getLogger("com.foo");

   Logger barlogger = LoggerFactory.getLogger("com.foo.Bar");

   // This request is enabled, because WARN >= INFO.
   logger.warn("Low fuel level.");

   // This request is disabled, because DEBUG < INFO.
   logger.debug("Starting search for nearest gas station.");

   // The logger instance barlogger, named "com.foo.Bar",
   // will inherit its level from the logger named
   // "com.foo" Thus, the following request is enabled
   // because INFO >= INFO.
   barlogger.info("Located nearest gas station.");

   // This request is disabled, because DEBUG < INFO.
   barlogger.debug("Exiting gas station search");
    }

}
