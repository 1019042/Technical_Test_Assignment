/*
 * Program to write 3 thread safe ways to increment an integer 
 */

public class Thread_Safe {
	
	/*
	 * 1. Make the methods synchronized
	 */
	
	  private int c = 0;

	    public synchronized void increment() {
	        c++;
	    }

	    public synchronized void decrement() {
	        c--;
	    }

	    public synchronized int value() {
	        return c;
	    }
	    
}//end class
