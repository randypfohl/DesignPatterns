package singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	private static int numThreads = 100;
	
	public static void main(String[] args) {
		
		ExecutorService taskExecutor = Executors.newFixedThreadPool(numThreads);

		for(int i=0; i<numThreads; i++) {
			taskExecutor.execute(new ThreadTest());
		}
	}

	private static class ThreadTest implements Runnable {
	    public void run() {
	        long threadId = Thread.currentThread().getId();
	        Logger logger = Logger.getInstance();
	        logger.log("Thread # " + threadId + " is doing this task with id " + logger.getId());
	    }
	}
}
