
/**
 * Java program to demonstrate where to use Volatile keyword in Java.
 * In this example Thread_Safe3 Instance is declared as volatile variable to ensure
 * every thread see updated value for _instance.
 *
 */
public class Thread_Safe3{
private static volatile Thread_Safe3 _instance; //volatile variable

public static Thread_Safe3 getInstance(){

   if(_instance == null){
            synchronized(Thread_Safe3.class){
              if(_instance == null)
              _instance = new Thread_Safe3();
            }

   }
   return _instance;

	}
}