import java.util.concurrent.atomic.AtomicInteger;

public class Thread_Safe2 {

	/*
     * 2. This method is thread-safe because count is incremented atomically
     */
	 private AtomicInteger count = new AtomicInteger(0);

	    public void increment() {
	        count.incrementAndGet();
	    }

	    public void decrement() {
	        count.decrementAndGet();
	    }

	    public int value() {
	        return count.get();
	    }
	

}//end class
