package singleton;

import java.util.concurrent.ThreadLocalRandom;

public class Logger {
	
	// private instance
	private static Logger logger;
	
	// private value
	private int id;
	
	// private constructor
	private Logger() {
		id = ThreadLocalRandom.current().nextInt(0, 100001);
	}

	public static Logger getInstance() {
		// moved synchronized internally to reduce overhead from multiple threads
		if (logger == null) {
			// prevent multiple threads from creating instance at the same time
		  synchronized (Logger.class) { 
			  // one final check to prevent the multiple threads that could have entered the first loop from instantiating
			  if(logger == null) {
				  logger = new Logger();
			  }
	      }
		}
		return logger;
	}
	
	public void log (String s) {
		// lets pretend this logs to somewhere meaningful 
		System.out.println(s);
	}
	
	public int getId() {
		return id;
	}
		
}


